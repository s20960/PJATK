using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP2
{
    internal class Faculty
    {
        public string Nazwa { get; set; }

        private List<Group> _group= new List<Group>();
        private Dictionary<string, Subject> _przedmioty= new Dictionary<string, Subject>();
        
        public Faculty(string nazwa)
        {
            Nazwa = nazwa;

        }
        
        public string addGroup(Group newGroup)
        {
            if (!_group.Contains(newGroup)){
                _group.Add(newGroup);
                newGroup.setFaculty(this);
            }

            return "Wydział "+this.Nazwa+" został powiększony o grupę "+newGroup.Numer ;
        }
        public string addSubject(Subject newSubject, string Id)
        {
            if (!_przedmioty.ContainsKey(Id))
            {
                _przedmioty.Add(Id,newSubject);
                newSubject.setFaculty(this);
            }

            return "Wydział " + this.Nazwa + " został powiększony o przedmiot " + newSubject.Name;
        }



    }
}
