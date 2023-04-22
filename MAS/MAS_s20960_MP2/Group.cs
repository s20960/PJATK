using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace MAS_s20960_MP2
{
    internal class Group
    {
        public int Numer { get; set; }
        private Faculty _wydzial;
        public List<StudentGroup> StudentGroups = new List<StudentGroup>();

        public Group(int numer)
        {
            Numer = numer;
        }

        public string setFaculty(Faculty newFaculty)
        {
            if(newFaculty != null)
            {
                if (_wydzial == null){
                    _wydzial = newFaculty;

                    newFaculty.addGroup(this);
                }
                
            }

            return "Dla grupy "+this.Numer+" został ustawiony wydział "+newFaculty.Nazwa;
        }







    }
}
