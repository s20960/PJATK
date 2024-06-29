using cwiczenia6.Helpers.Enums;
using Microsoft.AspNetCore.Mvc;

using cwiczenia6.Repositories;

namespace cwiczenia6.Services;

public class AnimalService : IAnimalService
{
    private readonly IAnimalRepository _animalRepository;

    public AnimalService(IAnimalRepository animalRepository)
    {
        _animalRepository = animalRepository;
    }

    public IEnumerable<Animal> GetAnimals()
    {
        var animals = _animalRepository.ReadAnimals();
        return animals;
    }

    public Animal GetAnimalById(int id)
    {
        return _animalRepository.ReadAnimalById(id);
    }

    public int PostAnimal(Animal animal)
    {   
        return _animalRepository.CerateAnimal(animal);
    }

    public int PutAnimal(Animal animal)
    {
        return _animalRepository.UpdateAnimal(animal);
    }

    public int DeleteAnimal(int id)
    {
        return _animalRepository.DeleteAnimal(id);
    }
}
