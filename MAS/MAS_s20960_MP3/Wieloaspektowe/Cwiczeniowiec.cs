using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Wieloaspektowe
{
    internal class Cwiczeniowiec : Osoba
    {
        public int Pensja { get; set; }
        public Cwiczeniowiec(string imie, string nazwisko, bool wojsko, int pensja) : base(imie, nazwisko, wojsko)
        {
            Pensja = pensja;
        }
        public Cwiczeniowiec(string imie, string nazwisko, string panienskie, int pensja) : base(imie, nazwisko, panienskie)
        {
            Pensja = pensja;
        }


    }
}
