package clinicamedica;
public class Medicos
{
    private int crm;
    private String nomemed;
    private String especialidadeMed;
    
    public Medicos(int crm, String nomemed, String especialidadeMed)
    {
        this.setCrm(crm);
        this.setNomemed(nomemed);
        this.setEspecialidadeMed(especialidadeMed);
    }
    
    public int getCrm()
    {
        return crm;
    }
    
    public String getNomemed()
    {
        return nomemed;
    }
    
    public String getEspecialidadeMed()
    {
        return especialidadeMed;
    }
    
    public void setCrm (int crm)
    {
        this.crm = crm;
    }
    
    public void setNomemed (String nomemed)
    {
        this.nomemed = nomemed;
    }
    
    public void setEspecialidadeMed (String especialidadeMed)
    {
        this.especialidadeMed = especialidadeMed;
    }
    
    @Override
    public String toString()
    {
        return "Medico " + getCrm() + " Nome: " + getNomemed() + " Especialidade: " + getEspecialidadeMed() + "\n";
    }
}