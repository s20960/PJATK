using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP4.Subset
{
    internal class Nauczanie
    {
        public List<Przedmiot> przedmiotLista = new List<Przedmiot>();
        public List<Przedmiot> obieralnyLista = new List<Przedmiot>();

        public int Id { get; set; }
        public string Nazwa { get; set; }

        public void addPrzedmiot(Przedmiot przedmiot)
        {
            przedmiotLista.Add(przedmiot);
        }
        public void addObieralny(Przedmiot obieralny)
        {
            przedmiotLista.Add(obieralny);
            obieralnyLista.Add(obieralny);
        }


    }
}
