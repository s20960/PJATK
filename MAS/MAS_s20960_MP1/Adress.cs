using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP1
{[Serializable]
    internal class Adress
    {
        public string Street { get; set; }
        public int Number { get; set; }
        public string City { get; set; }

        public Adress(string street, int number, string city)
        {
            Street = street ?? throw new ArgumentNullException(nameof(street));
            Number = number;
            City = city ?? throw new ArgumentNullException(nameof(city));
        }
    }
}
