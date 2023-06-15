using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MAS_s20960_MP4.Atrybut
{
    internal class Pracownik
    {
        public static float minimumSalary = 2000;
        public static int maxSalaryChangePercentage = 10;
        public float Salary { get; set; }

        public Pracownik(float salary)
        {
            setSalary(salary);
        }

        public float setSalary(float salary) 
        {
            if (salary < this.Salary)
            {
                throw new Exception("nie można zmniejszyć wypłaty");
            }
            else if (this.Salary != 0 && this.Salary * (1d + maxSalaryChangePercentage / 100d) < salary)
            {
                throw new Exception("nie można zwiększyć wypłaty o więcej niż " + maxSalaryChangePercentage + "%");
            }
            else if (salary < minimumSalary)
            {
                throw new Exception("Wypłata nie może być mniejsza niż " + minimumSalary);
            }
            else
                return salary;
        }

        public override string ToString() 
        {
            return "Wypłata pracownika wynosi "+Salary;
        }


    }

}
