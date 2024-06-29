using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Reflection.Metadata;
using System.Runtime.CompilerServices;
using static LegacyApp.UserService;

namespace LegacyApp
{
    public class UserService
    {
        public bool AddUser(string firstName, string lastName, string email, DateTime dateOfBirth, int clientId)
        {

            Validacja(firstName, lastName, email, dateOfBirth);

            var client = new ClientRepository().GetById(clientId);

            var user = getNewUser(client, dateOfBirth, email, firstName, lastName);

            //IsClientImportant(client);

            if (client.Type == "VeryImportantClient")
            {
                client.HasCreditLimit = false;
            }


            else if (client.Type == "ImportantClient")
            {
                using (var userCreditService = new UserCreditService())
                {
                    int creditLimit = userCreditService.GetCreditLimit(client.Name);
                    creditLimit = creditLimit * 2;
                    client.CreditLimit = creditLimit;
                }
            }

            else
            {
                client.HasCreditLimit = true;
                using (var userCreditService = new UserCreditService())
                {
                    int creditLimit = userCreditService.GetCreditLimit(client.Name);
                    client.CreditLimit = creditLimit;
                }
            }

            UserDataAccess.AddUser(user);
            return true;
        }

        public static bool Validacja(string firstName, string lastName, string email, DateTime dateOfBirth)
        {

            if (!new Validation().ValidateName(firstName)) return false;
            if (!new Validation().ValidateName(lastName)) return false;
            if (!new Validation().ValidateEmail(email)) return false;
            if (!new Validation().ValidateAge(dateOfBirth)) return false;
            return true;
           
        }

        public static User getNewUser(Client client, DateTime dateOfBirth, string email, string firstName, string lastName)
        {
            return new User
            {
                Client = client,
                DateOfBirth = dateOfBirth,
                EmailAddress = email,
                FirstName = firstName,
                LastName = lastName
            };
        }

        //public interface IClientImportance
        //{
        //    string ClientType { get; }
        //    void Process(Client client);
        //}

        //public class VeryImportantClient : IClientImportance
        //{
        //    public string ClientType => "VeryImportantClient";

        //    public void Process(Client client)
        //    {
        //        client.HasCreditLimit = false;
        //    }
        //}

        //public class ImportantClient : IClientImportance
        //{
        //    public string ClientType => "ImportantClient";

        //    public void Process(Client client)
        //    {
        //        using (var userCreditService = new UserCreditService())
        //        {
        //            int creditLimit = userCreditService.GetCreditLimit(client.Name);
        //            creditLimit = creditLimit * 2;
        //            client.CreditLimit = creditLimit;
        //        }
        //    }
        //}

        //public class JustClient : IClientImportance
        //{
        //    public string ClientType => "JustClient";

        //    public void Process(Client client)
        //    {
        //        client.HasCreditLimit = true;
        //        using (var userCreditService = new UserCreditService())
        //        {
        //            int creditLimit = userCreditService.GetCreditLimit(client.Name);
        //            client.CreditLimit = creditLimit;
        //        }
        //    }
        //}

        //public class ClientImportance
        //{
        //    private readonly List<IClientImportance> _clients;

        //    public ClientImportance(List<IClientImportance> clients)
        //    {
        //        _clients = clients;
        //    }

        //    public void CheckClientImportance(Client client)
        //    {
        //        var processor = _clients.FirstOrDefault(p => p.ClientType == client.Type);
        //        processor?.Process(client);
        //    }
        //}

        //public static bool IsClientImportant(Client client)
        //{
        //    List<IClientImportance> clients;

        //    if (client.HasCreditLimit && client.CreditLimit < 500)
        //    {
        //        return false;
        //    }

        //    return true;
        //}
    }
}
