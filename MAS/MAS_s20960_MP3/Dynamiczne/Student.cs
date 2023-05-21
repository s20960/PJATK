using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Dynamiczne
{
    internal class Student : Osoba
    {
        public string eska { get; set; }
        public Student(Osoba prevOsoba, string imie, string nazwisko, string eska) : base(imie, nazwisko)
        {
            this.eska = eska;
        }
        public override string ToString()
        {
            return this.GetType().Name + ": " + Imie + " " + Nazwisko + " " + eska;
        }
    }
}
