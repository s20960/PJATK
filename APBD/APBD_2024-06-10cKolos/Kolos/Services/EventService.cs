using Kolos.Context;
using Microsoft.EntityFrameworkCore;

namespace Kolos.Services
{
    public class EventService
    {
        private readonly KolosContext _context;

        public EventService(KolosContext context)
        {
            _context = context;
        }

        public async Task Delete(int eventId)
        {
            var eventobj = await _context.Events
                .Where(x => x.IdEvent == eventId)
                .FirstOrDefaultAsync()
                ?? throw new ArgumentException($"event z takim Id nie istnieje");

            if(eventobj.DateFrom>DateTime.Now)
                throw new ArgumentException($"nie można usunąc trwających eventów");

            if (eventobj.DateTo != null)
                throw new ArgumentException($"ten event ma uzupełnioną datę zakończenia");

            _context.Events.Remove(eventobj);
            _context.SaveChanges();

        }
    }
}
