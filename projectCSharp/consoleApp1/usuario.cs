

namespace ConsoleApp1
{
    public class Usuario
    {
        public string name;
        public Usuario()
        {
            name = "unknown";
        }

        public Usuario(string nm)
        {
            name = nm;
        }

        public void SetName(string newName)
        {
            name = newName;
        }
    }
    
}
