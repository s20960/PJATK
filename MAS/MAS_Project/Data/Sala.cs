using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class Sala
    {
        public int Id { get; set; }
        public int Numer { get; set; }

        public virtual ICollection<SprzetMedyczny> SprzetMedyczny { get; set; }
        public virtual ICollection<Personel> Personel { get; set; }
    }
}
