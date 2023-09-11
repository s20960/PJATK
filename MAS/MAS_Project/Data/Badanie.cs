using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class Badanie
    {
        public int Id { get; set; }
        public string Nazwa { get; set; }

        //public virtual ICollection<Personel> Personel { get; set; }
        public virtual ICollection<PersonelBadanie> PersonelBadanie { get; set; }
        public virtual ICollection<SprzetMedyczny> SprzetMedyczny { get; set; }
        public virtual ICollection<Wizyta> Wizyty { get; set; }
    }
}
