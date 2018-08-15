package Desafio;

/**
 *
 * @author Rodrigo dos Santos Felix
 */
public class Medicos {
    private int crm;
    private String nomemed;
    private String especialidademed;

    public Medicos(int crm, String nomemed, String especialidademed) {
        this.crm = crm;
        this.nomemed = nomemed;
        this.especialidademed = especialidademed;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNomemed() {
        return nomemed;
    }

    public void setNomemed(String nomemed) {
        this.nomemed = nomemed;
    }

    public String getEspecialidademed() {
        return especialidademed;
    }

    public void setEspecialidademed(String especialidademed) {
        this.especialidademed = especialidademed;
    }

    @Override
    public String toString() {
        return "Medicos{" + "crm=" + crm + ", nomemed=" + nomemed + ", especialidademed=" + especialidademed + '}';
    }
}
