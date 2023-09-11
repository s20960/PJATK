using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
	public class Personel : Person
	{
		public string Wyksztalcenie { get; set; }
		public int Pensja { get; set; }

		public string Specjalizacja { get; set; }

		public virtual TypPersonelu TypPersonelu { get; set; }
		public int TypPersoneluId { get; set; }



		public virtual ICollection<Wizyta> Wizyty { get; set; }
		//public virtual ICollection<Badanie> Badania { get; set; }
		public virtual ICollection<PersonelBadanie> PersonelBadanie { get; set; }
		public virtual ICollection<SprzetMedyczny> SprzetMedyczny { get; set; }
		public virtual ICollection<Sala> Sale { get; set; }
	}
}
