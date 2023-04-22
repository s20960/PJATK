using System;
using System.IO;

namespace MAS_s20960_MP1
{
    class Program
    {
        public static void Main(String[] args)
        {
            /*Dictionary<string, float> dic1 = new Dictionary<string, float>();
            dic1.Add("PPJ", 2);
            Student student1 = new Student(dic1, "Jan", "Kowalski", 19, new Adress("Przykladowa", 1, "Warszawa"));


            Dictionary<string, float> dic2 = new Dictionary<string, float>();
            dic2.Add("SBD", 4);
            Student student2 = new Student(dic2, "Piotr", "Nowak", 20, new Adress("Zaruby", 12, "Warszawa"));


            Dictionary<string, float> dic3 = new Dictionary<string, float>();
            dic3.Add("SBD", 5);
            Student student3 = new Student(dic3, "Krystian", "Sasor", 21, new Adress("Wawrzyniak", 150, "Warszawa"));*/




            //Student.Save();
            Student.Load();
            //Console.WriteLine();
            Console.WriteLine(Student.GradesAverage());

            foreach (var item in Student.Osoby)
            {
                Console.WriteLine(item);
            }
        }
    }


}

