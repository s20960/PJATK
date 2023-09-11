using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

#pragma warning disable CA1814 // Prefer jagged arrays over multidimensional

namespace MAS_Implementacja.Migrations
{
    /// <inheritdoc />
    public partial class _1 : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Adres",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Street = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Number = table.Column<int>(type: "int", nullable: false),
                    City = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Adres", x => x.Id);
                });

            migrationBuilder.CreateTable(
                name: "Badanie",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Nazwa = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Badanie", x => x.Id);
                });

            migrationBuilder.CreateTable(
                name: "Sala",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Numer = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Sala", x => x.Id);
                });

            migrationBuilder.CreateTable(
                name: "TypPersonelu",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Nazwa = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TypPersonelu", x => x.Id);
                });

            migrationBuilder.CreateTable(
                name: "SprzetMedyczny",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Nazwa = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SalaId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_SprzetMedyczny", x => x.Id);
                    table.ForeignKey(
                        name: "FK_SprzetMedyczny_Sala_SalaId",
                        column: x => x.SalaId,
                        principalTable: "Sala",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Person",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Imie = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Nazwisko = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Numer = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    AdresId = table.Column<int>(type: "int", nullable: false),
                    Discriminator = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Wyksztalcenie = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    Pensja = table.Column<int>(type: "int", nullable: true),
                    Specjalizacja = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    TypPersoneluId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Person", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Person_Adres_AdresId",
                        column: x => x.AdresId,
                        principalTable: "Adres",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_Person_TypPersonelu_TypPersoneluId",
                        column: x => x.TypPersoneluId,
                        principalTable: "TypPersonelu",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "BadanieSprzetMedyczny",
                columns: table => new
                {
                    BadaniaId = table.Column<int>(type: "int", nullable: false),
                    SprzetMedycznyId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_BadanieSprzetMedyczny", x => new { x.BadaniaId, x.SprzetMedycznyId });
                    table.ForeignKey(
                        name: "FK_BadanieSprzetMedyczny_Badanie_BadaniaId",
                        column: x => x.BadaniaId,
                        principalTable: "Badanie",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_BadanieSprzetMedyczny_SprzetMedyczny_SprzetMedycznyId",
                        column: x => x.SprzetMedycznyId,
                        principalTable: "SprzetMedyczny",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "PersonelBadanie",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    BadanieId = table.Column<int>(type: "int", nullable: false),
                    PersonelId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_PersonelBadanie", x => x.Id);
                    table.ForeignKey(
                        name: "FK_PersonelBadanie_Badanie_BadanieId",
                        column: x => x.BadanieId,
                        principalTable: "Badanie",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_PersonelBadanie_Person_PersonelId",
                        column: x => x.PersonelId,
                        principalTable: "Person",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "PersonelSala",
                columns: table => new
                {
                    PersonelId = table.Column<int>(type: "int", nullable: false),
                    SaleId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_PersonelSala", x => new { x.PersonelId, x.SaleId });
                    table.ForeignKey(
                        name: "FK_PersonelSala_Person_PersonelId",
                        column: x => x.PersonelId,
                        principalTable: "Person",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_PersonelSala_Sala_SaleId",
                        column: x => x.SaleId,
                        principalTable: "Sala",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "PersonelSprzetMedyczny",
                columns: table => new
                {
                    PersonelId = table.Column<int>(type: "int", nullable: false),
                    SprzetMedycznyId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_PersonelSprzetMedyczny", x => new { x.PersonelId, x.SprzetMedycznyId });
                    table.ForeignKey(
                        name: "FK_PersonelSprzetMedyczny_Person_PersonelId",
                        column: x => x.PersonelId,
                        principalTable: "Person",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_PersonelSprzetMedyczny_SprzetMedyczny_SprzetMedycznyId",
                        column: x => x.SprzetMedycznyId,
                        principalTable: "SprzetMedyczny",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Wizyta",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Status = table.Column<int>(type: "int", maxLength: 250, nullable: false),
                    Data = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Opis = table.Column<string>(type: "nvarchar(250)", maxLength: 250, nullable: true),
                    PacjentId = table.Column<int>(type: "int", nullable: false),
                    PersonelId = table.Column<int>(type: "int", nullable: false),
                    BadanieId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Wizyta", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Wizyta_Badanie_BadanieId",
                        column: x => x.BadanieId,
                        principalTable: "Badanie",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_Wizyta_Person_PacjentId",
                        column: x => x.PacjentId,
                        principalTable: "Person",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_Wizyta_Person_PersonelId",
                        column: x => x.PersonelId,
                        principalTable: "Person",
                        principalColumn: "Id");
                });

            migrationBuilder.InsertData(
                table: "Adres",
                columns: new[] { "Id", "City", "Number", "Street" },
                values: new object[,]
                {
                    { 1, "dziekan", 1, "dziekan" },
                    { 2, "dziekan", 2, "dziekan" },
                    { 3, "dziekan", 3, "dziekan" }
                });

            migrationBuilder.InsertData(
                table: "Badanie",
                columns: new[] { "Id", "Nazwa" },
                values: new object[,]
                {
                    { 1, "Badanie krwi" },
                    { 2, "Badanie moczu" },
                    { 3, "Badanie kału" }
                });

            migrationBuilder.InsertData(
                table: "TypPersonelu",
                columns: new[] { "Id", "Nazwa" },
                values: new object[,]
                {
                    { 1, "Lekarz" },
                    { 2, "Pielękniarka" },
                    { 3, "OperatorSprzętu" }
                });

            migrationBuilder.InsertData(
                table: "Person",
                columns: new[] { "Id", "AdresId", "Discriminator", "Imie", "Nazwisko", "Numer", "Pensja", "Specjalizacja", "TypPersoneluId", "Wyksztalcenie" },
                values: new object[,]
                {
                    { 1, 1, "Personel", "Doktor", "Susor 1", "1", 3, "dziekan", 1, "dziekan" },
                    { 2, 2, "Personel", "Doktor", "Susor 2", "1", 3, "dziekan", 1, "dziekan" },
                    { 3, 3, "Personel", "Doktor", "Susor 3", "1", 3, "dziekan", 1, "dziekan" }
                });

            migrationBuilder.InsertData(
                table: "PersonelBadanie",
                columns: new[] { "Id", "BadanieId", "PersonelId" },
                values: new object[,]
                {
                    { 1, 1, 1 },
                    { 2, 1, 2 },
                    { 3, 2, 3 }
                });

            migrationBuilder.CreateIndex(
                name: "IX_BadanieSprzetMedyczny_SprzetMedycznyId",
                table: "BadanieSprzetMedyczny",
                column: "SprzetMedycznyId");

            migrationBuilder.CreateIndex(
                name: "IX_Person_AdresId",
                table: "Person",
                column: "AdresId");

            migrationBuilder.CreateIndex(
                name: "IX_Person_TypPersoneluId",
                table: "Person",
                column: "TypPersoneluId");

            migrationBuilder.CreateIndex(
                name: "IX_PersonelBadanie_BadanieId",
                table: "PersonelBadanie",
                column: "BadanieId");

            migrationBuilder.CreateIndex(
                name: "IX_PersonelBadanie_PersonelId",
                table: "PersonelBadanie",
                column: "PersonelId");

            migrationBuilder.CreateIndex(
                name: "IX_PersonelSala_SaleId",
                table: "PersonelSala",
                column: "SaleId");

            migrationBuilder.CreateIndex(
                name: "IX_PersonelSprzetMedyczny_SprzetMedycznyId",
                table: "PersonelSprzetMedyczny",
                column: "SprzetMedycznyId");

            migrationBuilder.CreateIndex(
                name: "IX_SprzetMedyczny_SalaId",
                table: "SprzetMedyczny",
                column: "SalaId");

            migrationBuilder.CreateIndex(
                name: "IX_Wizyta_BadanieId",
                table: "Wizyta",
                column: "BadanieId");

            migrationBuilder.CreateIndex(
                name: "IX_Wizyta_PacjentId",
                table: "Wizyta",
                column: "PacjentId");

            migrationBuilder.CreateIndex(
                name: "IX_Wizyta_PersonelId",
                table: "Wizyta",
                column: "PersonelId");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "BadanieSprzetMedyczny");

            migrationBuilder.DropTable(
                name: "PersonelBadanie");

            migrationBuilder.DropTable(
                name: "PersonelSala");

            migrationBuilder.DropTable(
                name: "PersonelSprzetMedyczny");

            migrationBuilder.DropTable(
                name: "Wizyta");

            migrationBuilder.DropTable(
                name: "SprzetMedyczny");

            migrationBuilder.DropTable(
                name: "Badanie");

            migrationBuilder.DropTable(
                name: "Person");

            migrationBuilder.DropTable(
                name: "Sala");

            migrationBuilder.DropTable(
                name: "Adres");

            migrationBuilder.DropTable(
                name: "TypPersonelu");
        }
    }
}
