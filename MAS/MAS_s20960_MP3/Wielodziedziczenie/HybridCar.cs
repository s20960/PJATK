using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Wielodziedziczenie
{
    internal class HybridCar : ElectricCar, ICumbustionCar
    {
        public float Silnik { get; set; }
        public float Spalanie { get; set; }
        public HybridCar(float silnik, float spalanie, string color, float Ah) : base(color, Ah)
        {
            Silnik = silnik;
            Spalanie = spalanie;
        }


    }
}
