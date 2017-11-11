
package cadastrarpaciente;

public class Paciente {
    private String nome;
    private String tipoEnfermidade;
    
    public Paciente( String nome, String tipoEnfermidade)
    {
        this.setNome(nome);
        this.setTipoEnfermidade(tipoEnfermidade);
        
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getTipoEnfermidade()
    {
        return tipoEnfermidade;
    }
    public void setTipoEnfermidade(String tipoEnfermidade)
    {
        this.tipoEnfermidade = tipoEnfermidade;
    }
    public String relatorioPaciente()
    {
        return "individuo " + getNome() + " doença " + getTipoEnfermidade() + "\n";
    }
}
