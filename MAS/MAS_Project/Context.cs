using MAS_Implementacja.Data;
using Microsoft.EntityFrameworkCore;

public class Context : DbContext
{
    public Context(DbContextOptions options) : base(options)
    {
    }

    public DbSet<Wizyta> Wizyta { get; set; }
    public DbSet<Person> Person { get; set; }
    public DbSet<Pacjent> Pacjent { get; set; }
    public DbSet<Personel> Personel { get; set; }
    public DbSet<Badanie> Badanie { get; set; }
    public DbSet<SprzetMedyczny> SprzetMedyczny { get; set; }
    public DbSet<Sala> Sala { get; set; }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Wizyta>(e =>
        {
            e.HasOne(x => x.Personel).WithMany(x => x.Wizyty).OnDelete(DeleteBehavior.NoAction);

            //List<Wizyta> list = new();
            //list.Add(new Wizyta() { Data= DateTime.Now})
            //e.HasData(wizyty);
        });

        modelBuilder.Entity<TypPersonelu>(e =>
        {
            TypPersonelu[] list = new TypPersonelu[]
            {
                new TypPersonelu { Id = 1, Nazwa = "Lekarz" },
                new TypPersonelu { Id = 2, Nazwa = "Pielękniarka" },
                new TypPersonelu { Id = 3, Nazwa = "OperatorSprzętu" }
            };
            e.HasData(list);
        });

        modelBuilder.Entity<Adres>(e =>
        {
            Adres adres1 = new Adres { Id = 1, City = "dziekan", Number = 1, Street = "dziekan" };
            Adres adres2 = new Adres { Id = 2, City = "dziekan", Number = 2, Street = "dziekan" };
            Adres adres3 = new Adres { Id = 3, City = "dziekan", Number = 3, Street = "dziekan" };

            Adres[] list = new Adres[]
            {
                new Adres { Id = 1, City = "dziekan", Number = 1, Street = "dziekan" },
                new Adres { Id = 2, City = "dziekan", Number = 2, Street = "dziekan" },
                new Adres { Id = 3, City = "dziekan", Number = 3, Street = "dziekan" }
            };
            e.HasData(list);
        });

        modelBuilder.Entity<Personel>(e =>
        {
            Adres adres1 = new Adres { Id = 1, City = "dziekan", Number = 1, Street = "dziekan" };
            Adres adres2 = new Adres { Id = 2, City = "dziekan", Number = 2, Street = "dziekan" };
            Adres adres3 = new Adres { Id = 3, City = "dziekan", Number = 3, Street = "dziekan" };

            Personel[] list = new Personel[]
            {
                new Personel { Id = 1, Imie="Dr. Matełusz", Nazwisko="Susor", AdresId=1,  Numer="1", Wyksztalcenie="dziekan", Pensja=3, Specjalizacja="dziekan", TypPersoneluId=1},
                new Personel { Id = 2, Imie="Dr. Pawian", Nazwisko="Pawuła", AdresId=2,  Numer="1", Wyksztalcenie="dziekan", Pensja=3, Specjalizacja="dziekan", TypPersoneluId=1},
                new Personel { Id = 3, Imie="Dr. Majkel", Nazwisko="Łoman", AdresId=3,  Numer="1", Wyksztalcenie="dziekan", Pensja=3, Specjalizacja="dziekan", TypPersoneluId=1},
            };
            e.HasData(list);
        });

		modelBuilder.Entity<Badanie>(e =>
		{
			Badanie[] list = new Badanie[]
			{
				new Badanie { Id = 1, Nazwa="Badanie krwi" },
				new Badanie { Id = 2, Nazwa="Badanie moczu" },
				new Badanie { Id = 3, Nazwa="Badanie kału" }
			
			};
			e.HasData(list);
		});

		modelBuilder.Entity<PersonelBadanie>(e =>
		{
			PersonelBadanie[] list = new PersonelBadanie[]
			{
				new PersonelBadanie { Id = 1, BadanieId=1, PersonelId=1 },
				new PersonelBadanie { Id = 2, BadanieId=1, PersonelId=2 },
				new PersonelBadanie { Id = 3, BadanieId=2, PersonelId=3 },
				new PersonelBadanie { Id = 4, BadanieId=3, PersonelId=1 }

            };
			e.HasData(list);
		});
	}
}