using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP4.Unique
{
    internal class Student
    {
        public static HashSet<int> eskaSet = new HashSet<int>();
        private int _eska;
        public int Eska { 
            get => _eska;
            set
            {
                if(eskaSet.Contains(value)) throw new Exception ("taki już istnieje");
                eskaSet.Remove(value);
                eskaSet.Add(value);

            } 
        }
        public string Imie { get; set; }
        
        public Student(int eska, string imie)
        { 
            Eska = eska;
            Imie = imie;
        }

    }
}
