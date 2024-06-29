using cwiczenia7.Models;
using cwiczenia7.Repositories;

namespace cwiczenia7.Services
{
    public class ProductWarehouseService : IProductWarehouseService
    {
        private readonly IProductWarehouseRepository _warehouseRepository;

        public ProductWarehouseService(IProductWarehouseRepository warehouseRepository)
        {
            _warehouseRepository = warehouseRepository;
        }

        public int PostWareProd(ProductWarehouse warehouse)
        {
            var answer = _warehouseRepository.Create(warehouse);
            return answer;
        }
    }
}
