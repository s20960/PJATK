using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class Recepta
    {
        public int Id { get; set; }

        public DateTime DataWystawienia { get; set; }
        public DateTime DataWaznosci { get; set; }

		public virtual Wizyta Wizyta { get; set; }
		public virtual ICollection<Lek> Leki{ get; set; }  
	}
}
