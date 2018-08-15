
package study;

/**
 *
 * @author rodri
 */
public class Study {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.titular = "Rodrigo";
        minhaConta.saldo = 3541.25;
        minhaConta.numero = 3256;
        
        System.out.println ( "Conta: " + minhaConta.numero + "\n Saldo: " + minhaConta.saldo);
    }
}
