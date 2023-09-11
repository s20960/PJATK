namespace MAS_Implementacja.Data
{
    public class TypPersonelu
    {
        public int Id { get; set; }
        public string Nazwa { get; set; }

        public virtual ICollection<Personel> Personel { get; set; }
    }
}
