using Kolos.Services.Iservices;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace Kolos.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class EventController : ControllerBase
    {
        private readonly IEventService _eventService;

        public EventController(IEventService eventController)
        {
            _eventService = eventController;
        }

        [HttpDelete]
        public async Task<IActionResult> Delete(int EventId) 
        {
            try
            {
                await _eventService.Delete(EventId);
                return Ok();
            }
            catch (ArgumentException ex)
            {
                return BadRequest($"An error occurred: {ex.InnerException.Message}");
            }
        }
    }
}
