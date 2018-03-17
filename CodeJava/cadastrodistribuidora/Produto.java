package cadastrodistribuidora;

/**
 *
 * @author 010617040
 */
public class Produto {
    private String descrição;
    private String fabricante;
    
    public Produto(String descrição, String fabricante)
    {
        this.setDescrição(descrição);
        this.setFabricante(fabricante);
    }
    public String getDescrição()
    {
        return descrição;
    }
    public void setDescrição(String descrição)
    {
        this.descrição = descrição; 
    }
    public String getFabricante()
    {
        return fabricante;
    }
    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }
    public String relatorioProduto()
    {
        return "Produto " + getDescrição() + " do Fornecedor " + getFabricante() + "\n";
    }
}
