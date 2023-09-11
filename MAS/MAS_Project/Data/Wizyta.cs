using System.ComponentModel.DataAnnotations;

namespace MAS_Implementacja.Data
{
	public class Wizyta
	{
		[Key] public int Id { get; set; }

		[MaxLength(250)] public StatusWizyty Status { get; set; }
		public DateTime Data { get; set; }
		[MaxLength(250)] public string? Opis { get; set; }

		public virtual Pacjent Pacjent { get; set; }
		public int PacjentId { get; set; }

		public virtual Personel Personel { get; set; }
		public int PersonelId { get; set; }

		public virtual Badanie Badanie { get; set; }
		public int BadanieId { get; set; }


		public virtual ICollection<Recepta> Recepty { get; set; }
		public virtual ICollection<Diagnoza> Diagnozy { get; set; }
	}

	public enum StatusWizyty
	{
		zaplanowana,
		zrealizowana,
		odwolana
	}
}
