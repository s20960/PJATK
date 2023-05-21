using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Wielodziedziczenie
{
    internal class ElectricCar : Car
    {
        public float Ah { get; set; }

        public ElectricCar(string color, float Ah) : base(color)
        {
            Color = color;
            this.Ah = Ah;
        }

        public override string getColor()
        {
            return Color;
        }
    }
}
