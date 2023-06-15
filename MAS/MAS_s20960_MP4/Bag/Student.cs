using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP4.Bag
{
    internal class Student
    {
        public List<Zapis> zapisyStudent = new List<Zapis>();
        public int Eska { get; set; }
        public string Name { get; set; }

        public void AddKurs(Kurs kurs)
        {
            var zapis = new Zapis
            {
                Student = this,
                Kurs = kurs
            };
            zapisyStudent.Add(zapis);
            kurs.zapisyKurs.Add(zapis);
        }
        
    }
}
