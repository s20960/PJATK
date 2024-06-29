using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace Kolos.Models
{
    public class EventOrganiser
    {
        [Key]
        public int IdEventOrganiser { get; set; }

        //[Required]
        //public ICollection<Organiser> MainOrganiser { get; set; }

        public int IdEvent { get; set; }
        public int IdOrganiser { get; set; }

        [ForeignKey(nameof(IdEvent))]
        public virtual Event Event { get; set; }

        [ForeignKey(nameof(IdOrganiser))]
        public virtual Organiser Organiser { get; set; }
    }
}
