using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class Diagnoza
    {
        public int Id { get; set; }

        public string NazwaChoroby { get; set; }
        public string Opis { get; set; }

        public virtual Wizyta Wizyta { get; set; }
    }
}
