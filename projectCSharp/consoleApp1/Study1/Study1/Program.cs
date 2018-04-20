using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Study1
{
    public class CustomClass
    {
        public int Number { get; set; }

        public int Multiply(int num)
        {
            return num * Number;
        }

        public CustomClass()
        {
            Number = 0;
        }
    }
        class Program
        {

        static void Main(string[] args)
        {
                CustomClass custClass = new CustomClass();
                custClass.Number = 27;
                int result = custClass.Multiply(4);
                Console.WriteLine($"The result is {result}.");
        }
    }
}