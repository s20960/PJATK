using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public abstract class Person
    {
        public int Id { get; set; }

        public string Imie { get; set; }
        public string Nazwisko { get; set; }
        public string Numer { get; set; }

        public virtual Adres Adres { get; set; }
        public int AdresId { get; set; }
    }
}
