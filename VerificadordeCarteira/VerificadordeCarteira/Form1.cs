using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace VerificadordeCarteira
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            ServiceAnalisador.AnalisadorMultasService objAnalisador = new ServiceAnalisador.AnalisadorMultasService();
            
            objAnalisador.Timeout = (60 * 1000) * 1;

            String carta;
            carta = txtCarteira.Text;
            
            Array[] resultado = objAnalisador.consultaPontos(carta);
            if (resultado == null || resultado.Length == 0) {
                MessageBox.Show( "Sem retorno do servidor" );
                txtCarteira.Text = null;
                txtCarteira.Focus;
            }

            MessageBox.Show( resultado, "| Uso Serviço Web", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }
    }
}
