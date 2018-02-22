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
            
            //O primeiro recurso a ser adicionado é a capacidade de ler um arquivo de texto e a exibição de todo esse texto para um console.
            static IEnumerable<string> ReadFrom(string file)
            {
                string line;
                using (var reader = File.OpenText(file))
                {
                    while ((line = reader.Reader()) != null)
                    {
                        yield return line;
                    }
                }
            }

            Console.WriteLine("Exit!");
            Console.ReadKey();
        }
    }
}
