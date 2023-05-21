using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Wielodziedziczenie
{
    internal class CombustionCar : Car, ICumbustionCar
    {


        public float Silnik { get; set; }
        public float Spalanie { get; set; }

        public CombustionCar(string color, float silnik, float spalanie) : base(color)
        {
            Color = color;
            Silnik = silnik;
            Spalanie = spalanie;
        }

        public override string getColor()
        {
            return Color;
        }


    }
}
