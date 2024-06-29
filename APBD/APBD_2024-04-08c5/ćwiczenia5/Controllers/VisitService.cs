using ćwiczenia5.Models;
using Microsoft.AspNetCore.Mvc;

namespace ćwiczenia5.Controllers;

[Route("api/visit")]
[ApiController]

public class VisitService : ControllerBase
{
    //private VisitService _visitService;

    //public VisitService(VisitService visitService)
    //{
    //    _visitService = visitService;
    //}

    private static readonly List<Visit> _visits = new List<Visit>()
    //{
    //    new Visit{Date = new DateTime(2024, 4, 19), Animal = _visitService.GetByAnimalId(1), Description = "Lorem ipsum", Payment = 1200.50}
    //};
    {
        new Visit{Date = new DateTime(2024, 4, 19), Animal = new Animal{IdAnimal = 1, Name = "Fikuś", Category = Helpers.Category.Cat, Weight = 5.5, Colour = Helpers.Colour.Orange}, Description = "Lorem ipsum", Payment = 1200.50},
        new Visit{Date = new DateTime(2024, 4, 19), Animal = new Animal{IdAnimal = 2, Name = "Pimpuś", Category = Helpers.Category.Dog, Weight = 5.5, Colour = Helpers.Colour.Orange}, Description = "Lorem ipsum", Payment = 1200.50},
        new Visit{Date = new DateTime(2024, 4, 19), Animal = new Animal{IdAnimal = 3, Name = "Piotrek", Category = Helpers.Category.YoungerSibling, Weight = 5.5, Colour = Helpers.Colour.White}, Description = "Lorem ipsum", Payment = 1200.50}
    };

    [HttpGet("{id:int}")]
    public IActionResult GetByAnimalId(int id)
    {
        var visits = _visits.Where(x => x.Animal.IdAnimal == id);
        if (visits == null) 
            return BadRequest("Nie ma wizyt dla wskazanego futrzaka");

        return Ok(visits);
    }

    [HttpPost]
    public IActionResult Post(Visit visit)
    {
        _visits.Add(visit);
        return Ok(_visits);
    }

}
