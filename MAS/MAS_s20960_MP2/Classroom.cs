using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace MAS_s20960_MP2
{
    internal class Classroom : IEquatable<Classroom?>
    {
        public int Numer { get; set; }
        public Uni uni { get; set; }

        private Classroom(int numer, Uni uni)
        {
            Numer = numer;
            this.uni = uni;
        }

        public static Classroom createClassroom(Uni uni, int numer)
        {
            if (uni == null)
            {
                throw new Exception("Uniwesytet nie istnieje!");
            }

            Classroom klasa = new Classroom(numer, uni);

            uni.addClass(klasa);

            return klasa;
        }

        public override bool Equals(object? obj)
        {
            return Equals(obj as Classroom);
        }

        public bool Equals(Classroom? other)
        {
            return other is not null &&
                   Numer == other.Numer &&
                   EqualityComparer<Uni>.Default.Equals(uni, other.uni);
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(Numer, uni);
        }

        public static bool operator ==(Classroom? left, Classroom? right)
        {
            return EqualityComparer<Classroom>.Default.Equals(left, right);
        }

        public static bool operator !=(Classroom? left, Classroom? right)
        {
            return !(left == right);
        }
    }

}

