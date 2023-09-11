using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class Lek
    {
		public int Id { get; set; }


		public string Nazwa { get; set; }
        public string Opis { get; set; }

		public virtual ICollection<Recepta> Recepty { get; set; }
	}
}
