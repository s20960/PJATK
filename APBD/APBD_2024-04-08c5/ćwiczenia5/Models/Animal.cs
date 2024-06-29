using ćwiczenia5.Helpers;

namespace ćwiczenia5.Models
{
    public class Animal
    {
        public int IdAnimal { get; set; }
        public string Name { get; set; }
        public Category Category { get; set; }
        public double Weight { get; set; }
        public Colour Colour { get; set; }
    }
}
