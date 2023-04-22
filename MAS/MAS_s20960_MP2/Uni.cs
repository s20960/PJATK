using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace MAS_s20960_MP2
{
    internal class Uni
    {
        private List<Classroom> _classes = new List<Classroom>();
        public HashSet<Classroom> _allClasses = new HashSet<Classroom>();

        public string Nazwa { get; set; }

        public Uni(string nazwa)
        {
            Nazwa = nazwa;
        }

        public void addClass(Classroom klasa){
            if (!_classes.Contains(klasa)) //!_classes.Any(s => s.Numer == s.Numer)
            {
                if (_allClasses.Contains(klasa))
                {
                    throw new Exception("Ta sala już istnieje");
                }
                _classes.Add(klasa);
                _allClasses.Add(klasa);
            }    
        }




        public override string ToString()
        {
            String info = "Uni: " + Nazwa + "\n";
            foreach (Classroom classroom in _classes)
            {
                info += " " + classroom.Numer + "\n";
            }
            return info;
        }


    }
}






