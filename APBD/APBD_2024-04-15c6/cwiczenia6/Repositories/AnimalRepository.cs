using cwiczenia6.Helpers;
using cwiczenia6.Helpers.Enums;
using cwiczenia6.Services;
using System.Data.SqlClient;
using System.Xml.Linq;

namespace cwiczenia6.Repositories
{
    public class AnimalRepository : IAnimalRepository
    {
        //public static readonly List<Animal> _animals = new List<Animal>() {
        //new Animal{IdAnimal = 1, Name = "Fikuś", Description = "lorem ipsum 1", Category = Helpers.Category.Cat, Area = "Warszawa"},
        //new Animal{IdAnimal = 2, Name = "Pimpuś", Description = "lorem ipsum 2", Category = Helpers.Category.Dog, Area = "Kraków"},
        //new Animal{IdAnimal = 3, Name = "Piotrek", Description = "lorem ipsum 3", Category = Helpers.Category.Cat, Area = "Gdańsk"}
        //};

        private readonly IConfiguration _configuration;

        public AnimalRepository(IConfiguration configuration)
        {
            _configuration = configuration;
        }

        public IEnumerable<Animal> ReadAnimals(string name)
        {
            using var con = new SqlConnection(_configuration["ConnectionStrings:DefaultConnection"]);
            con.Open();

            using var cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "SELECT IdAnimal, Name, Description, Category, Area FROM Animal ORDER BY @IdName";
            cmd.Parameters.AddWithValue("IdName", name);

            var dr = cmd.ExecuteReader();
            var animals = new List<Animal>();
            while (dr.Read())
            {
                var animal = new Animal
                {
                    IdAnimal = (int)dr["IdAnimal"],
                    Name = dr["Name"].ToString(),
                    Description = dr["Description"].ToString(),
                    Category = (Category)dr["Category"],
                    Area = dr["Area"].ToString()
                };
                animals.Add(animal);
            }
            return animals;
        }

        public Animal ReadAnimalById(int idAnimal)
        {
            using var con = new SqlConnection(_configuration["ConnectionStrings:DefaultConnection"]);
            con.Open();

            using var cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "SELECT IdAnimal, Name, Description, Category, Area FROM Animal WHERE IdAnimal = @IdAnimal";
            cmd.Parameters.AddWithValue("@IdAnimal", idAnimal);


            var dr = cmd.ExecuteReader();
            if (!dr.Read()) 
                return null;

            var animal = new Animal
            {
                IdAnimal = (int)dr["IdAnimal"],
                Name = dr["Name"].ToString(),
                Description = dr["Description"].ToString(),
                Category = (Category)dr["Category"],
                Area = dr["Area"].ToString()
            };
            return animal;
        }

        public int CerateAnimal(Animal animal)
        {
            using var con = new SqlConnection(_configuration["ConnectionStrings:DefaultConnection"]);
            con.Open();

            using var cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "INSERT INTO Animal(Name, Description, Category, Area) Values(@Name, @Description, @Category, @Area)";
            cmd.Parameters.AddWithValue("@IdAnimal", animal.IdAnimal);
            cmd.Parameters.AddWithValue("@Name", animal.Name);
            cmd.Parameters.AddWithValue("@Description", animal.Description);
            cmd.Parameters.AddWithValue("@Category", animal.Category);
            cmd.Parameters.AddWithValue("@Area", animal.Area);

            var affectedCount = cmd.ExecuteNonQuery();
            return affectedCount;
        }

        public int DeleteAnimal(int idAnimal)
        {
            using var con = new SqlConnection(_configuration["ConnectionStrings:DefaultConnection"]);
            con.Open();

            using var cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "DELETE FROM Animal WHERE IdAnimal = @IdAnimal";
            cmd.Parameters.AddWithValue("@IdAnimal", idAnimal);

            var affectedCount = cmd.ExecuteNonQuery();
            return affectedCount;
        }

        public int UpdateAnimal(Animal animal)
        {
            using var con = new SqlConnection(_configuration["ConnectionStrings:DefaultConnection"]);
            con.Open();

            using var cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "UPDATE Animal SET Name=@Name, Description=@Description, Category=@Category, Area=@Area";
            cmd.Parameters.AddWithValue("@IdAnimal", animal.IdAnimal);
            cmd.Parameters.AddWithValue("@Name", animal.Name);
            cmd.Parameters.AddWithValue("@Description", animal.Description);
            cmd.Parameters.AddWithValue("@Category", animal.Category);
            cmd.Parameters.AddWithValue("@Area", animal.Area);

            var affectedCount = cmd.ExecuteNonQuery();
            return affectedCount;
        }

    }
}
