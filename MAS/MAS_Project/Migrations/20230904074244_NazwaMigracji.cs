using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace MAS_Implementacja.Migrations
{
    /// <inheritdoc />
    public partial class NazwaMigracji : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.UpdateData(
                table: "Person",
                keyColumn: "Id",
                keyValue: 1,
                columns: new[] { "Imie", "Nazwisko" },
                values: new object[] { "Dr. Matełusz", "Susor" });

            migrationBuilder.UpdateData(
                table: "Person",
                keyColumn: "Id",
                keyValue: 2,
                columns: new[] { "Imie", "Nazwisko" },
                values: new object[] { "Dr. Pawian", "Pawuła" });

            migrationBuilder.UpdateData(
                table: "Person",
                keyColumn: "Id",
                keyValue: 3,
                columns: new[] { "Imie", "Nazwisko" },
                values: new object[] { "Dr. Majkel", "Łoman" });

            migrationBuilder.InsertData(
                table: "PersonelBadanie",
                columns: new[] { "Id", "BadanieId", "PersonelId" },
                values: new object[] { 4, 3, 1 });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DeleteData(
                table: "PersonelBadanie",
                keyColumn: "Id",
                keyValue: 4);

            migrationBuilder.UpdateData(
                table: "Person",
                keyColumn: "Id",
                keyValue: 1,
                columns: new[] { "Imie", "Nazwisko" },
                values: new object[] { "Doktor", "Susor 1" });

            migrationBuilder.UpdateData(
                table: "Person",
                keyColumn: "Id",
                keyValue: 2,
                columns: new[] { "Imie", "Nazwisko" },
                values: new object[] { "Doktor", "Susor 2" });

            migrationBuilder.UpdateData(
                table: "Person",
                keyColumn: "Id",
                keyValue: 3,
                columns: new[] { "Imie", "Nazwisko" },
                values: new object[] { "Doktor", "Susor 3" });
        }
    }
}
