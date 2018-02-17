using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main()
        {
            Usuario usuario1 = new Usuario();
            Console.WriteLine(usuario1.name);

            usuario1.SetName("John Smith");
            Console.WriteLine(usuario1.name);

            Usuario usuario2 = new Usuario("Sarah Jones");
            Console.WriteLine(usuario2.name);

            Console.WriteLine("Exit!");
            Console.ReadKey();
        }
    }
}
