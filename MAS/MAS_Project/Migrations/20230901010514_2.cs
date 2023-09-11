using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace MAS_Implementacja.Migrations
{
    /// <inheritdoc />
    public partial class _2 : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Diagnoza",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    NazwaChoroby = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Opis = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    WizytaId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Diagnoza", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Diagnoza_Wizyta_WizytaId",
                        column: x => x.WizytaId,
                        principalTable: "Wizyta",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Lek",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Nazwa = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Opis = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Lek", x => x.Id);
                });

            migrationBuilder.CreateTable(
                name: "Recepta",
                columns: table => new
                {
                    Id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    DataWystawienia = table.Column<DateTime>(type: "datetime2", nullable: false),
                    DataWaznosci = table.Column<DateTime>(type: "datetime2", nullable: false),
                    WizytaId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Recepta", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Recepta_Wizyta_WizytaId",
                        column: x => x.WizytaId,
                        principalTable: "Wizyta",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "LekRecepta",
                columns: table => new
                {
                    LekiId = table.Column<int>(type: "int", nullable: false),
                    ReceptyId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_LekRecepta", x => new { x.LekiId, x.ReceptyId });
                    table.ForeignKey(
                        name: "FK_LekRecepta_Lek_LekiId",
                        column: x => x.LekiId,
                        principalTable: "Lek",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_LekRecepta_Recepta_ReceptyId",
                        column: x => x.ReceptyId,
                        principalTable: "Recepta",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Diagnoza_WizytaId",
                table: "Diagnoza",
                column: "WizytaId");

            migrationBuilder.CreateIndex(
                name: "IX_LekRecepta_ReceptyId",
                table: "LekRecepta",
                column: "ReceptyId");

            migrationBuilder.CreateIndex(
                name: "IX_Recepta_WizytaId",
                table: "Recepta",
                column: "WizytaId");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Diagnoza");

            migrationBuilder.DropTable(
                name: "LekRecepta");

            migrationBuilder.DropTable(
                name: "Lek");

            migrationBuilder.DropTable(
                name: "Recepta");
        }
    }
}
