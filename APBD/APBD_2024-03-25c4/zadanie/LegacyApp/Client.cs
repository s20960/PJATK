namespace LegacyApp
{
    public class Client
    {
        public int ClientId { get; internal set; }
        public string Name { get; internal set; }
        public string Email { get; internal set; }
        public string Address { get; internal set; }
        public string Type { get; set; }
        public bool HasCreditLimit { get; internal set; }
        public int CreditLimit { get; internal set; }
    }
}