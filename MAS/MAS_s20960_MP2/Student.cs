using MAS_s20960_MP2;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;


namespace MAS_s20960_MP1
{[Serializable]
    internal class Student
    {
        public static List<Student> Osoby= new List<Student>();
        public Dictionary<string, float> Grades;
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public int Age { get; set; }
        public string? Email { get; set; }
        public Adress adress { get; set; }
        public static int ITNPrice { get; set; } = 100; 
        public int RetakePrice =>Grades.Where((x)=>x.Value==2).Count()*ITNPrice;

        public List<StudentGroup> StudentGroups = new List<StudentGroup>();

        public Student(Dictionary<string, float> grades, string firstName, string lastName, int age, Adress adress)
        {
            Grades = grades ?? throw new ArgumentNullException(nameof(grades));
            FirstName = firstName ?? throw new ArgumentNullException(nameof(firstName));
            LastName = lastName ?? throw new ArgumentNullException(nameof(lastName));
            Age = age;
            this.adress = adress ?? throw new ArgumentNullException(nameof(adress));
            Osoby.Add(this);
        }

        public Student(Dictionary<string, float> grades, string firstName, string lastName, int age, string? email, Adress adress)
        {
            Grades = grades ?? throw new ArgumentNullException(nameof(grades));
            FirstName = firstName ?? throw new ArgumentNullException(nameof(firstName));
            LastName = lastName ?? throw new ArgumentNullException(nameof(lastName));
            Age = age;
            Email = email;
            this.adress = adress ?? throw new ArgumentNullException(nameof(adress));
            Osoby.Add(this);
        }








        public string AddGrade(string subject, float grade)
        {
            Grades.Add(subject, grade);
            return "Dodano ocene: " + grade + ", do przedmiotu: " + subject+".";
        }

        public static float GradesAverage()
        {
            float gradeSum = 0;
            int gradesTotal = 0;
            foreach (Student student in Osoby)
            {

                foreach(var grade in student.Grades)
                {
                    gradeSum += grade.Value;
                    
                }
                gradesTotal += student.Grades.Count();   
            }
            return gradeSum / gradesTotal;
        }

        public override string ToString()
        {
            return "Osoba o imieniu: " + FirstName + ", oraz nazwisku: " + LastName+"."; 
        }

        public static void Save()
        {
            using(FileStream file = File.Create("Students"))
            {
                BinaryFormatter bf = new BinaryFormatter();
                bf.Serialize(file, Osoby);
            }
        }

        public static void Load()
        {
            using (FileStream file = File.OpenRead("Students"))
            {
                BinaryFormatter bf = new BinaryFormatter();
                Osoby = (List<Student>)bf.Deserialize(file);
            }
        }






    }


}
