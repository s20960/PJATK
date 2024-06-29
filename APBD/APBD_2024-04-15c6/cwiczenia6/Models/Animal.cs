using System.ComponentModel.DataAnnotations;

namespace cwiczenia6.Models { }
namespace cwiczenia6.Helpers.Enums
{
    public class Animal
    {
        [Required]
        public int IdAnimal { get; set; }

        [Required]
        public string Name { get; set; }

        public string? Description { get; set; }

        [Required]
        public Category Category { get; set; }

        [Required]
        public string Area { get; set; }

    }
}
