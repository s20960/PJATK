using MAS_s20960_MP3.Overlapping;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Wieloaspektowe
{
    public enum Sex
    {
        male,
        female
    }

    internal abstract class Osoba
    {
        public string Imie { get; set; }
        public string Nazwisko { get; set; }
        public string Panienskie { get; set; }
        public bool Wojsko { get; set; }
        public Sex sex { get; set; }

        public Osoba(string imie, string nazwisko, bool wojsko)
        {
            sex=Sex.male;
            Imie = imie;
            Nazwisko = nazwisko;
            Wojsko = wojsko;
        }

        public Osoba(string imie, string nazwisko, string panienskie)
        {
            sex = Sex.female;
            Imie = imie;
            Nazwisko = nazwisko;
            Panienskie = panienskie;
        }



        public string urodzenie()
        {
            if (sex == Sex.female)
            {
                return "urodzone";
            }
            else
                throw new Exception("Aborcja");
        }

        public void pobór()
        {
            if (sex == Sex.male)
            {
                this.Wojsko=true;
            }
            else
                throw new Exception("To nie jest mężczyzna");
        }



    }
}
