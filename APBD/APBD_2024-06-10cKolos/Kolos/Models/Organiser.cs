using System.ComponentModel.DataAnnotations;

namespace Kolos.Models
{
    public class Organiser
    {
        [Key]
        public int IdOrganiser { get; set; }

        [Required]
        [MaxLength(50)]
        public string Name { get; set; }

        public virtual ICollection<EventOrganiser> EventOrganisers { get; set; }
    }
}
