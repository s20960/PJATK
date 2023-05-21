using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Dynamiczne
{
    internal class Wykładowca : Osoba
    {
        public string Tytuł { get; set; }
        public Wykładowca(Osoba prevOsoba, string imie, string nazwisko, string tytuł) : base(imie, nazwisko)
        {
            Tytuł = tytuł;
        }
        public override string ToString()
        {
            return this.GetType().Name + ": " + Imie + " " + Nazwisko + " " + Tytuł;
        }
    }
}
