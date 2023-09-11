namespace MAS_Implementacja.Data
{
	public class PersonelBadanie
	{
		public int Id { get; set; }

		public virtual Badanie Badanie { get; set; }
		public int BadanieId { get; set; }

		public virtual Personel Personel { get; set; }
		public int PersonelId { get; set; }
	}
}
