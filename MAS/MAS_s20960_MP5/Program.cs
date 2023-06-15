// See https://aka.ms/new-console-template for more information
using MAS_s20960_MP5;
using Microsoft.EntityFrameworkCore;


var context = new Context();
context.Database.EnsureDeleted();
context.Database.EnsureCreated();



//using (var context = new Context())//
{
    
    var newClient = new Client
    {
        Name = "John Doe",
        Products = new List<Product>
                {
                    new Product { Name = "Product 1", Price = 9.99m },
                    new Product { Name = "Product 2", Price = 19.99m }
                }
    };
    var newWorker = new Worker
    {
        Name = "Andrzej Mietczyński",
        Salary = 4000
    };
    context.Workers.Add(newWorker);
    context.Clients.Add(newClient);
    context.SaveChanges();

    
    
}