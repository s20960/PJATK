using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class Pacjent : Person
    {
        public virtual ICollection<Wizyta> Wizyty { get; set; }
    }
}
