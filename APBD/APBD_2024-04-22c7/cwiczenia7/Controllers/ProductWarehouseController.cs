using cwiczenia7.Models;
using cwiczenia7.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace cwiczenia7.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ProductWarehouseController : ControllerBase
    {
        private readonly IProductWarehouseService _warehouseService;

        public ProductWarehouseController(IProductWarehouseService warehouseService)
        {
            _warehouseService = warehouseService;
        }

        [HttpPost]
        public IActionResult Post(ProductWarehouse warehouse) 
        {
            _warehouseService.PostWareProd(warehouse);
            return Ok(warehouse);
        }
    }
}
