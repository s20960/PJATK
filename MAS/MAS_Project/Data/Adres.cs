﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_Implementacja.Data
{
    public class Adres
    {
        [Key] public int Id { get; set; }

        public string Street { get; set; }
        public int Number { get; set; }
        public string City { get; set; }
    }
}
