﻿// <auto-generated />
using System;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace MAS_Implementacja.Migrations
{
    [DbContext(typeof(Context))]
    partial class ContextModelSnapshot : ModelSnapshot
    {
        protected override void BuildModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "7.0.10")
                .HasAnnotation("Relational:MaxIdentifierLength", 128);

            SqlServerModelBuilderExtensions.UseIdentityColumns(modelBuilder);

            modelBuilder.Entity("BadanieSprzetMedyczny", b =>
                {
                    b.Property<int>("BadaniaId")
                        .HasColumnType("int");

                    b.Property<int>("SprzetMedycznyId")
                        .HasColumnType("int");

                    b.HasKey("BadaniaId", "SprzetMedycznyId");

                    b.HasIndex("SprzetMedycznyId");

                    b.ToTable("BadanieSprzetMedyczny");
                });

            modelBuilder.Entity("LekRecepta", b =>
                {
                    b.Property<int>("LekiId")
                        .HasColumnType("int");

                    b.Property<int>("ReceptyId")
                        .HasColumnType("int");

                    b.HasKey("LekiId", "ReceptyId");

                    b.HasIndex("ReceptyId");

                    b.ToTable("LekRecepta");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Adres", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<string>("City")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<int>("Number")
                        .HasColumnType("int");

                    b.Property<string>("Street")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("Id");

                    b.ToTable("Adres");

                    b.HasData(
                        new
                        {
                            Id = 1,
                            City = "dziekan",
                            Number = 1,
                            Street = "dziekan"
                        },
                        new
                        {
                            Id = 2,
                            City = "dziekan",
                            Number = 2,
                            Street = "dziekan"
                        },
                        new
                        {
                            Id = 3,
                            City = "dziekan",
                            Number = 3,
                            Street = "dziekan"
                        });
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Badanie", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<string>("Nazwa")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("Id");

                    b.ToTable("Badanie");

                    b.HasData(
                        new
                        {
                            Id = 1,
                            Nazwa = "Badanie krwi"
                        },
                        new
                        {
                            Id = 2,
                            Nazwa = "Badanie moczu"
                        },
                        new
                        {
                            Id = 3,
                            Nazwa = "Badanie kału"
                        });
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Diagnoza", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<string>("NazwaChoroby")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("Opis")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<int>("WizytaId")
                        .HasColumnType("int");

                    b.HasKey("Id");

                    b.HasIndex("WizytaId");

                    b.ToTable("Diagnoza");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Lek", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<string>("Nazwa")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("Opis")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("Id");

                    b.ToTable("Lek");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Person", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<int>("AdresId")
                        .HasColumnType("int");

                    b.Property<string>("Discriminator")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("Imie")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("Nazwisko")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("Numer")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("Id");

                    b.HasIndex("AdresId");

                    b.ToTable("Person");

                    b.HasDiscriminator<string>("Discriminator").HasValue("Person");

                    b.UseTphMappingStrategy();
                });

            modelBuilder.Entity("MAS_Implementacja.Data.PersonelBadanie", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<int>("BadanieId")
                        .HasColumnType("int");

                    b.Property<int>("PersonelId")
                        .HasColumnType("int");

                    b.HasKey("Id");

                    b.HasIndex("BadanieId");

                    b.HasIndex("PersonelId");

                    b.ToTable("PersonelBadanie");

                    b.HasData(
                        new
                        {
                            Id = 1,
                            BadanieId = 1,
                            PersonelId = 1
                        },
                        new
                        {
                            Id = 2,
                            BadanieId = 1,
                            PersonelId = 2
                        },
                        new
                        {
                            Id = 3,
                            BadanieId = 2,
                            PersonelId = 3
                        },
                        new
                        {
                            Id = 4,
                            BadanieId = 3,
                            PersonelId = 1
                        });
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Recepta", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<DateTime>("DataWaznosci")
                        .HasColumnType("datetime2");

                    b.Property<DateTime>("DataWystawienia")
                        .HasColumnType("datetime2");

                    b.Property<int>("WizytaId")
                        .HasColumnType("int");

                    b.HasKey("Id");

                    b.HasIndex("WizytaId");

                    b.ToTable("Recepta");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Sala", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<int>("Numer")
                        .HasColumnType("int");

                    b.HasKey("Id");

                    b.ToTable("Sala");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.SprzetMedyczny", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<string>("Nazwa")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<int>("SalaId")
                        .HasColumnType("int");

                    b.HasKey("Id");

                    b.HasIndex("SalaId");

                    b.ToTable("SprzetMedyczny");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.TypPersonelu", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<string>("Nazwa")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("Id");

                    b.ToTable("TypPersonelu");

                    b.HasData(
                        new
                        {
                            Id = 1,
                            Nazwa = "Lekarz"
                        },
                        new
                        {
                            Id = 2,
                            Nazwa = "Pielękniarka"
                        },
                        new
                        {
                            Id = 3,
                            Nazwa = "OperatorSprzętu"
                        });
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Wizyta", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                    b.Property<int>("BadanieId")
                        .HasColumnType("int");

                    b.Property<DateTime>("Data")
                        .HasColumnType("datetime2");

                    b.Property<string>("Opis")
                        .HasMaxLength(250)
                        .HasColumnType("nvarchar(250)");

                    b.Property<int>("PacjentId")
                        .HasColumnType("int");

                    b.Property<int>("PersonelId")
                        .HasColumnType("int");

                    b.Property<int>("Status")
                        .HasMaxLength(250)
                        .HasColumnType("int");

                    b.HasKey("Id");

                    b.HasIndex("BadanieId");

                    b.HasIndex("PacjentId");

                    b.HasIndex("PersonelId");

                    b.ToTable("Wizyta");
                });

            modelBuilder.Entity("PersonelSala", b =>
                {
                    b.Property<int>("PersonelId")
                        .HasColumnType("int");

                    b.Property<int>("SaleId")
                        .HasColumnType("int");

                    b.HasKey("PersonelId", "SaleId");

                    b.HasIndex("SaleId");

                    b.ToTable("PersonelSala");
                });

            modelBuilder.Entity("PersonelSprzetMedyczny", b =>
                {
                    b.Property<int>("PersonelId")
                        .HasColumnType("int");

                    b.Property<int>("SprzetMedycznyId")
                        .HasColumnType("int");

                    b.HasKey("PersonelId", "SprzetMedycznyId");

                    b.HasIndex("SprzetMedycznyId");

                    b.ToTable("PersonelSprzetMedyczny");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Pacjent", b =>
                {
                    b.HasBaseType("MAS_Implementacja.Data.Person");

                    b.HasDiscriminator().HasValue("Pacjent");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Personel", b =>
                {
                    b.HasBaseType("MAS_Implementacja.Data.Person");

                    b.Property<int>("Pensja")
                        .HasColumnType("int");

                    b.Property<string>("Specjalizacja")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<int>("TypPersoneluId")
                        .HasColumnType("int");

                    b.Property<string>("Wyksztalcenie")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasIndex("TypPersoneluId");

                    b.HasDiscriminator().HasValue("Personel");

                    b.HasData(
                        new
                        {
                            Id = 1,
                            AdresId = 1,
                            Imie = "Dr. Matełusz",
                            Nazwisko = "Susor",
                            Numer = "1",
                            Pensja = 3,
                            Specjalizacja = "dziekan",
                            TypPersoneluId = 1,
                            Wyksztalcenie = "dziekan"
                        },
                        new
                        {
                            Id = 2,
                            AdresId = 2,
                            Imie = "Dr. Pawian",
                            Nazwisko = "Pawuła",
                            Numer = "1",
                            Pensja = 3,
                            Specjalizacja = "dziekan",
                            TypPersoneluId = 1,
                            Wyksztalcenie = "dziekan"
                        },
                        new
                        {
                            Id = 3,
                            AdresId = 3,
                            Imie = "Dr. Majkel",
                            Nazwisko = "Łoman",
                            Numer = "1",
                            Pensja = 3,
                            Specjalizacja = "dziekan",
                            TypPersoneluId = 1,
                            Wyksztalcenie = "dziekan"
                        });
                });

            modelBuilder.Entity("BadanieSprzetMedyczny", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Badanie", null)
                        .WithMany()
                        .HasForeignKey("BadaniaId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("MAS_Implementacja.Data.SprzetMedyczny", null)
                        .WithMany()
                        .HasForeignKey("SprzetMedycznyId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();
                });

            modelBuilder.Entity("LekRecepta", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Lek", null)
                        .WithMany()
                        .HasForeignKey("LekiId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("MAS_Implementacja.Data.Recepta", null)
                        .WithMany()
                        .HasForeignKey("ReceptyId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Diagnoza", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Wizyta", "Wizyta")
                        .WithMany("Diagnozy")
                        .HasForeignKey("WizytaId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.Navigation("Wizyta");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Person", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Adres", "Adres")
                        .WithMany()
                        .HasForeignKey("AdresId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.Navigation("Adres");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.PersonelBadanie", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Badanie", "Badanie")
                        .WithMany("PersonelBadanie")
                        .HasForeignKey("BadanieId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("MAS_Implementacja.Data.Personel", "Personel")
                        .WithMany("PersonelBadanie")
                        .HasForeignKey("PersonelId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.Navigation("Badanie");

                    b.Navigation("Personel");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Recepta", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Wizyta", "Wizyta")
                        .WithMany("Recepty")
                        .HasForeignKey("WizytaId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.Navigation("Wizyta");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.SprzetMedyczny", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Sala", "Sala")
                        .WithMany("SprzetMedyczny")
                        .HasForeignKey("SalaId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.Navigation("Sala");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Wizyta", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Badanie", "Badanie")
                        .WithMany("Wizyty")
                        .HasForeignKey("BadanieId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("MAS_Implementacja.Data.Pacjent", "Pacjent")
                        .WithMany("Wizyty")
                        .HasForeignKey("PacjentId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("MAS_Implementacja.Data.Personel", "Personel")
                        .WithMany("Wizyty")
                        .HasForeignKey("PersonelId")
                        .OnDelete(DeleteBehavior.NoAction)
                        .IsRequired();

                    b.Navigation("Badanie");

                    b.Navigation("Pacjent");

                    b.Navigation("Personel");
                });

            modelBuilder.Entity("PersonelSala", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Personel", null)
                        .WithMany()
                        .HasForeignKey("PersonelId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("MAS_Implementacja.Data.Sala", null)
                        .WithMany()
                        .HasForeignKey("SaleId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();
                });

            modelBuilder.Entity("PersonelSprzetMedyczny", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.Personel", null)
                        .WithMany()
                        .HasForeignKey("PersonelId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("MAS_Implementacja.Data.SprzetMedyczny", null)
                        .WithMany()
                        .HasForeignKey("SprzetMedycznyId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Personel", b =>
                {
                    b.HasOne("MAS_Implementacja.Data.TypPersonelu", "TypPersonelu")
                        .WithMany("Personel")
                        .HasForeignKey("TypPersoneluId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.Navigation("TypPersonelu");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Badanie", b =>
                {
                    b.Navigation("PersonelBadanie");

                    b.Navigation("Wizyty");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Sala", b =>
                {
                    b.Navigation("SprzetMedyczny");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.TypPersonelu", b =>
                {
                    b.Navigation("Personel");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Wizyta", b =>
                {
                    b.Navigation("Diagnozy");

                    b.Navigation("Recepty");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Pacjent", b =>
                {
                    b.Navigation("Wizyty");
                });

            modelBuilder.Entity("MAS_Implementacja.Data.Personel", b =>
                {
                    b.Navigation("PersonelBadanie");

                    b.Navigation("Wizyty");
                });
#pragma warning restore 612, 618
        }
    }
}