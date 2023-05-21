using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP3.Polimorfizk
{
    internal class Sala : Pomieszczenie
    {
        public int CenaMiesiąc { get; set; }

        public Sala(int Metraż, int CenaMiesiąc)
        {
            this.Metraż = Metraż;
            this.CenaMiesiąc = CenaMiesiąc;
        }


        public override int getMetraż()
        {
            return ileMetrów();
        }

        public int ileMetrów()
        {
            return Metraż;
        }
    }
}
