using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Polimorfizk
{
    internal abstract class Pomieszczenie
    {
        public int Metraż { get; set; }


        public abstract int getMetraż();
    }
}
