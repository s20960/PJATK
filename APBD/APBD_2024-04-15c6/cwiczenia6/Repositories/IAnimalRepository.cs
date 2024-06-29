using cwiczenia6.Helpers.Enums;
using cwiczenia6.Services;

namespace cwiczenia6.Repositories
{
    public interface IAnimalRepository
    {
        public IEnumerable<Animal> ReadAnimals(string name);
        Animal ReadAnimalById(int idAnimal);
        int CerateAnimal(Animal animal);
        int DeleteAnimal(int idAnimal);
        int UpdateAnimal(Animal animal);
    }
}
