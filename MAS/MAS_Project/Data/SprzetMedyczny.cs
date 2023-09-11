using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class SprzetMedyczny
    {
        public int Id{ get; set; }
        public string Nazwa { get; set; }

        public virtual Sala Sala { get; set; }
        public virtual ICollection<Badanie> Badania { get; set; }
        public virtual ICollection<Personel> Personel { get; set; }
    }
}
