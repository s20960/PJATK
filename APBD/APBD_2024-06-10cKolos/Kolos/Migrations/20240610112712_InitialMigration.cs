using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Kolos.Migrations
{
    /// <inheritdoc />
    public partial class InitialMigration : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Events",
                columns: table => new
                {
                    IdEvent = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Name = table.Column<string>(type: "nvarchar(60)", maxLength: 60, nullable: false),
                    DateFrom = table.Column<DateTime>(type: "datetime2", nullable: false),
                    DateTo = table.Column<DateTime>(type: "datetime2", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Events", x => x.IdEvent);
                });

            migrationBuilder.CreateTable(
                name: "Organisers",
                columns: table => new
                {
                    IdOrganiser = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Name = table.Column<string>(type: "nvarchar(50)", maxLength: 50, nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Organisers", x => x.IdOrganiser);
                });

            migrationBuilder.CreateTable(
                name: "EventOrganisers",
                columns: table => new
                {
                    IdEventOrganiser = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    IdEvent = table.Column<int>(type: "int", nullable: false),
                    IdOrganiser = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_EventOrganisers", x => x.IdEventOrganiser);
                    table.ForeignKey(
                        name: "FK_EventOrganisers_Events_IdEvent",
                        column: x => x.IdEvent,
                        principalTable: "Events",
                        principalColumn: "IdEvent",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_EventOrganisers_Organisers_IdOrganiser",
                        column: x => x.IdOrganiser,
                        principalTable: "Organisers",
                        principalColumn: "IdOrganiser",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_EventOrganisers_IdEvent",
                table: "EventOrganisers",
                column: "IdEvent");

            migrationBuilder.CreateIndex(
                name: "IX_EventOrganisers_IdOrganiser",
                table: "EventOrganisers",
                column: "IdOrganiser");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "EventOrganisers");

            migrationBuilder.DropTable(
                name: "Events");

            migrationBuilder.DropTable(
                name: "Organisers");
        }
    }
}
