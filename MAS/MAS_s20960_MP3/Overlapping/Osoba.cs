namespace MAS_s20960_MP3.Overlapping
{
    [Flags]
    public enum TypOsoby
    {
        Osoba = 1,
        Student = 2,
        Wykładowca = 4,
        Pracownik = 8
    }

    internal class Osoba
    {

        public int PESEL { get; set; }
        public string Imie { get; set; }
        public string Nazwisko { get; set; }
        public string Eska { get; set; }
        public string Tytuł { get; set; }
        public int Pensja { get; set; }

        public TypOsoby TypOsoby { get; private set; }

        public Osoba(int PESEL, string Imie, string Nazwisko, string Eska)
        {
            TypOsoby = TypOsoby.Student;
            this.PESEL = PESEL;
            this.Imie = Imie;
            this.Nazwisko = Nazwisko;
            this.Eska = Eska;
        }

        public Osoba(int PESEL, string Imie, string Nazwisko, int Pensja)
        {
            TypOsoby = TypOsoby.Pracownik;
            this.PESEL = PESEL;
            this.Imie = Imie;
            this.Nazwisko = Nazwisko;
            this.Pensja = Pensja;
        }

        public Osoba(int PESEL, string Imie, string Nazwisko, int Pensja, string Eska)
        {
            TypOsoby = TypOsoby.Pracownik | TypOsoby.Student;
            this.PESEL = PESEL;
            this.Imie = Imie;
            this.Nazwisko = Nazwisko;
            this.Pensja = Pensja;
            this.Eska = Eska;
        }




        public string getEska()
        {
            if ((TypOsoby & TypOsoby.Student) == TypOsoby.Student)
            {
                return Eska;
            }
            else
                throw new Exception("To nie jest Student");
        }

        public void setEska(string eska)
        {
            if ((TypOsoby & TypOsoby.Student) == TypOsoby.Student)
            {
                Eska = eska;
            }
            else
                throw new Exception("To nie jest Osoba");
        }


        public int getPensja()
        {
            if ((TypOsoby & TypOsoby.Pracownik) == TypOsoby.Pracownik)
            {
                return Pensja;
            }
            else
                throw new Exception("To nie jest Pracownik");
        }

        public void setPensja(string eska)
        {
            if ((TypOsoby & TypOsoby.Pracownik) == TypOsoby.Pracownik)
            {
                Eska = eska;
            }
            else
                throw new Exception("To nie jest Osoba");
        }
    }

}
