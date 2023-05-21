using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Wieloaspektowe
{
    internal class Student : Osoba
    {
        public string Eska { get; set; }
        public Student(string imie, string nazwisko, bool wojsko, string eska) : base(imie, nazwisko, wojsko)
        {
            Eska = eska;
        }
        public Student(string imie, string nazwisko, string panienskie, string eska) : base(imie, nazwisko, panienskie)
        {
            Eska = eska;
        }
    }
}
