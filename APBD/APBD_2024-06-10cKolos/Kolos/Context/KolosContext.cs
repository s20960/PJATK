using Kolos.Models;
using Microsoft.EntityFrameworkCore;

namespace Kolos.Context
{
    public class KolosContext : DbContext
    {
        public DbSet<Event> Events { get; set; }
        public DbSet<Organiser> Organisers { get; set; }
        public DbSet<EventOrganiser> EventOrganisers { get; set; }

        public KolosContext() { }
        public KolosContext(DbContextOptions<KolosContext> options) : base(options) { }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            //base.OnModelCreating(modelBuilder);
            modelBuilder.ApplyConfigurationsFromAssembly(typeof(KolosContext).Assembly);
        }
    }
}
