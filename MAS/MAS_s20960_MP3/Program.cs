using com.sun.org.apache.xml.@internal.resolver.helpers;
using MAS_s20960_MP3.Overlapping;
using MAS_s20960_MP3.Polimorfizk;
using MAS_s20960_MP3.Wielodziedziczenie;

namespace MAS_s20960_MP3
{

    class Program
    {
        public static void Main(string[] args)
        {
            Sala sala110 = new Sala(100, 2000);
            Console.WriteLine("Metraż mieszkania: "+sala110.ileMetrów());
            
            Console.WriteLine("--------------------------------------");

            Overlapping.Osoba student = new Overlapping.Osoba(0011123, "Jan", "Kowalski", "s12345");
            Overlapping.Osoba pracownik = new Overlapping.Osoba(765433, "Jan", "Kowalski", 2500);
            Overlapping.Osoba pracownikStudent = new Overlapping.Osoba(954368, "Jan", "Kowalski", 4000, "s45678");

            Console.WriteLine("Student posiada ekse o numerze: "+student.getEska());
            Console.WriteLine("Pracownik posiada pensję o wartości: "+pracownik.getPensja());
            Console.WriteLine("Pracownik który jednocześnie jest studentem posiada pensję o wartości: "+ 
                pracownikStudent.getPensja()+", oraz ekse o numerze: "+pracownikStudent.getEska());

            Console.WriteLine("--------------------------------------");

            HybridCar hybrydowy = new HybridCar(1.6f, 6.3f, "Czarny", 3.3f);

            Console.WriteLine("Spalanie samochodu hybrydowego: " + hybrydowy.Spalanie);
            Console.WriteLine("Amperogodziny samochodu hybrydowego: " + hybrydowy.Ah);

            Console.WriteLine("--------------------------------------");

            Dynamiczne.Osoba osoba = new Dynamiczne.Osoba("Jan", "Kowalski");
            Console.WriteLine(osoba);
            osoba = new Dynamiczne.Student(osoba, "Marcin", "Nowak", "s20960");
            Console.WriteLine(osoba);
            osoba = new Dynamiczne.Wykładowca(osoba, "Marcin", "Nowak", "Doktor");
            Console.WriteLine(osoba);
            
            Console.WriteLine("--------------------------------------");

            Wieloaspektowe.Cwiczeniowiec cwiczKobieta = new Wieloaspektowe.Cwiczeniowiec("Monika", "Nowka", "Kowalska", 4000);
            Wieloaspektowe.Cwiczeniowiec cwiczMezczyzna = new Wieloaspektowe.Cwiczeniowiec("Marcin", "Nowka", true, 4000);

            Wieloaspektowe.Student studKobieta = new Wieloaspektowe.Student("Monika", "Nowka", "Pakuła", "s20960");
            Wieloaspektowe.Student studMezczyzna = new Wieloaspektowe.Student("Piotrek", "Nowak", true, "s20960");






        }
    }
}