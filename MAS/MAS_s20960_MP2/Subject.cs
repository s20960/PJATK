using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP2
{
    internal class Subject
    {
        public int Id { get; set; }
        public string Name { get; set; }
        private Faculty _wydzial { get; set; }

        public Subject(int id, string name)
        {
            Id = id;
            Name = name;
        }

        public string setFaculty(Faculty newFaculty)
        {
            if (newFaculty != null)
            {
                if (_wydzial == null)
                {
                    _wydzial = newFaculty;

                    newFaculty.addSubject(this, Name);
                }

            }

            return "Dla przedmiotu " + this.Name + " został ustawiony wydział " + newFaculty.Nazwa;
        }
    }
}
