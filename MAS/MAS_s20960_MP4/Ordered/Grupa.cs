using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP4.Ordered
{
    internal class Grupa
    {
        public SortedSet<Student> students = new SortedSet<Student>(Comparer<Student>.Create((x, y)=> x.Eska.CompareTo(y.Eska)));
        public int Id { get; set; }
        public string Name { get; set; }

        public void addStudent(Student student)
        {
            students.Add(student);
        }
    }
}
