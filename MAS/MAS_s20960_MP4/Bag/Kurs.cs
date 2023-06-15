using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP4.Bag
{
    internal class Kurs
    {
        public List<Zapis> zapisyKurs = new List<Zapis>();
        public int Id { get; set; }
        public string Nazwa { get; set; }

        public void AddStudent(Student student)
        {
            var zapis = new Zapis
            {
                Student = student,
                Kurs = this
            };
            zapisyKurs.Add(zapis);
            student.zapisyStudent.Add(zapis);
        }


    }
}
