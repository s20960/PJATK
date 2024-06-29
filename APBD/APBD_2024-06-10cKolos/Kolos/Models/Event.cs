using System.ComponentModel.DataAnnotations;

namespace Kolos.Models
{
    public class Event
    {
        [Key]
        public int IdEvent { get; set; }

        [Required]
        [StringLength(60)]
        public string Name { get; set; }

        [Required]
        public DateTime DateFrom { get; set; }
        public DateTime? DateTo { get; set; }

        public virtual ICollection<EventOrganiser> EventOrganisers { get; set; }
    }
}
