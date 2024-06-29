using cwiczenia7.Models;
using System.Data.SqlClient;

namespace cwiczenia7.Repositories
{
    public class ProductWarehouseRepository : IProductWarehouseRepository
    {
        private readonly IConfiguration _configuration;

        public ProductWarehouseRepository(IConfiguration configuration)
        {
            _configuration = configuration;
        }

        public int Create(ProductWarehouse warehouse)
        {
            using var con = new SqlConnection(_configuration["ConnectionStrings:DefaultConnection"]);
            con.Open();

            using var cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "INSERT INTO Product_Warehouse(IdProduct, IdWarehouse, Amount, CreatedAt) Values(@IdProduct, @IdWarehouse, @Amount, @CreatedAt)";
            cmd.Parameters.AddWithValue("@IdProduct", warehouse.IdProduct);
            cmd.Parameters.AddWithValue("@IdWarehouse", warehouse.IdWarehouse);
            cmd.Parameters.AddWithValue("@Amount", warehouse.Amount);
            cmd.Parameters.AddWithValue("@CreatedAt", warehouse.CreatedAt);

            var affectedCount=cmd.ExecuteNonQuery();
            return affectedCount;
        }
    }
}
