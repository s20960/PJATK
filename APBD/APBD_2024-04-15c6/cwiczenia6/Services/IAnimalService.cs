
using cwiczenia6.Helpers.Enums;

namespace cwiczenia6.Services
{
    public interface IAnimalService
    {
        public IEnumerable<Animal> GetAnimals();
        public Animal GetAnimalById(int id);
        public int PostAnimal(Animal animal);
        public int PutAnimal(Animal animal);
        public int DeleteAnimal(int id);
    }
}
