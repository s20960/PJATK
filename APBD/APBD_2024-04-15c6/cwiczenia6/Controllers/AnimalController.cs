using cwiczenia6.Helpers.Enums;
using cwiczenia6.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace cwiczenia6.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class AnimalController : ControllerBase
    {
        private readonly IAnimalService _animalService;

        public AnimalController(IAnimalService animalService)
        {
            _animalService = animalService;
        }


        [HttpGet]
        public IActionResult Get()
        {
            var animals = _animalService.GetAnimals();
            return Ok(animals);
        }

        [HttpGet("{id:int}")]
        public IActionResult GetById([FromQuery]int id=5)
        {
            var animal = _animalService.GetAnimalById(id);
            if (animal == null)
                return BadRequest("Nie ma takiego futrzaka o takim id");

            return Ok(animal);
        }

        [HttpPost]
        public IActionResult Post(Animal animal)
        {
            _animalService.PostAnimal(animal);
            return Ok(animal);
        }

        [HttpPut("/api/animals/{idAnimal}")]
        public IActionResult Put(Animal input)
        {
            var animal = _animalService.PutAnimal(input);
            if (animal == null)
                return BadRequest("Nie ma takiego futrzaka o takim id");

            return Ok(animal);
        }

        [HttpDelete("/api/animals/{idAnimal}")]
        public IActionResult Delete(int idAnimal)
        {
            var animal = _animalService.DeleteAnimal(idAnimal);
            if (animal == null)
                return BadRequest("I tak nie ma takiego futrzaka o takim id");

            return Ok(_animalService);
        }
    }
}
