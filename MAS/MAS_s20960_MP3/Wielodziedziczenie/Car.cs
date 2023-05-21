using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Wielodziedziczenie
{
    internal abstract class Car
    {
        public string Color { get; set; }

        protected Car(string color)
        {
            Color = color;
        }

        public abstract string getColor() ;
    }
}
