using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LegacyApp
{
    internal class Validation
    {
        public bool ValidateName(string name)
        {
            if (string.IsNullOrEmpty(name))
            {
                return false;
            }
            return true;
        }

        public bool ValidateEmail(string email)
        {
            if (!email.Contains("@") && !email.Contains("."))
            {
                return false;
            }
            return true;
        }

        public bool ValidateAge(DateTime dateOfBirth)
        {
            var now = DateTime.Now;
            int age = now.Year - dateOfBirth.Year;
            if (now.Month < dateOfBirth.Month || now.Month == dateOfBirth.Month && now.Day < dateOfBirth.Day)
                age--;

            if (age < 21)
            {
                return false;
            }
            return true;
        }
    }
}
