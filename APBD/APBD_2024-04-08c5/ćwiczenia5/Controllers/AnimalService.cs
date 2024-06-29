using ćwiczenia5.Dto;
using ćwiczenia5.Models;
using Microsoft.AspNetCore.Mvc;

namespace ćwiczenia5.Controllers;

[Route("api/animals")]
[ApiController]


public class AnimalService : ControllerBase
{
    public static readonly List<Animal> _animals = new List<Animal>() {
        new Animal{IdAnimal = 1, Name = "Fikuś", Category = Helpers.Category.Cat, Weight = 5.5, Colour = Helpers.Colour.Orange},
        new Animal{IdAnimal = 2, Name = "Pimpuś", Category = Helpers.Category.Dog, Weight = 5.5, Colour = Helpers.Colour.Orange},
        new Animal{IdAnimal = 3, Name = "Piotrek", Category = Helpers.Category.YoungerSibling, Weight = 5.5, Colour = Helpers.Colour.White}
    };

    [HttpGet]
    public IActionResult Get()
    {
        return Ok(_animals);
    }

    [HttpGet("{id:int}")]
    public IActionResult GetById(int id) 
    {
        var animal = _animals.FirstOrDefault(x=>x.IdAnimal==id);
        if (animal == null) 
            return BadRequest("Nie ma takiego futrzaka o takim id");

        return Ok(animal);
    }

    [HttpPost]
    public IActionResult Post(Animal animal)
    {
       _animals.Add(animal);
        return Ok(_animals);
    }

    [HttpPut]
    public IActionResult Put(int id, AnimalDto input)
    {
        var animal = _animals.FirstOrDefault(x=>x.IdAnimal == id);
        if (animal == null)
            return BadRequest("Nie ma takiego futrzaka o takim id");

        animal.Name = input.Name;
        animal.Weight = input.Weight;

        return Ok(animal);
    }

    [HttpDelete]
    public IActionResult Delete(int id)
    {
        var animal = _animals.FirstOrDefault(x=>x.IdAnimal == id);
        if (animal == null)
            return BadRequest("I tak nie ma takiego futrzaka o takim id");

        _animals.Remove(animal);
        return Ok(_animals);
    }



}
