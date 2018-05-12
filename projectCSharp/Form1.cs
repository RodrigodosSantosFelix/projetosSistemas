using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsomeCalculos
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            double valorUm, valorDois;
            valorUm = Convert.ToDouble(textBox1.Text);
            valorDois = Convert.ToDouble(textBox2.Text);
            servicoCalculos.CalcularAreasService obj = new servicoCalculos.CalcularAreasService();
            double resultado = obj.retangulo(valorUm, valorDois);
            label1.Text = Convert.ToString(resultado);
            MessageBox.Show("Valor calculado " + resultado, "Uso Serviço Web", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
