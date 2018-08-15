//
//Em uma clínica médica onde atendem profissionais de diferentes especialidades,
//trabalham médicos e existem pacientes em processo de tratamento. 
//Cada médico é identificado pelo seu CRM, possui um nome e uma especialidade. 
//Para todo paciente que é cliente na clínica são cadastrados alguns dados pessoais: nome,
//RG, CPF, endereço, telefone para contato e data do nascimento. 
//Um paciente pode ser atendido por diversos médicos durante seu tratamento e um médico trata
//diversos pacientes. 
//É importante saber a data em que o paciente iniciou o 
//tratamento com determinado médico e quando o tratamento foi finalizado.
//Tabela Médicos
//CRM (Chave Primária)
//NomeMed
//EspecialidadeMed
//Tabela Pacientes
//NomePac
//RG
//CPF (Chave Primária)
//EnderecoPac
//TelefonePac
//NascPac
//Tabela Tratamentos
//CodTratamento (Chave primária)
//CPF (Chave estrangeira)
//CRM (Chave estrangeira)
//DataInicio
//DataFim
package clinica;

/**
 *
 * @author rodrigo dos santos felix RA: 010617040
 */
public class Medicos {

    private String NomeMedico;
    private String EspecialidadeMedico;
    private int Crm;

    public String getNomeMedico() {
        return NomeMedico;
    }

    public void setNomeMedico(String NomeMedico) {
        this.NomeMedico = NomeMedico;
    }

    public String getEspecialidadeMedico() {
        return EspecialidadeMedico;
    }

    public void setEspecialidadeMedico(String EspecialidadeMedico) {
        this.EspecialidadeMedico = EspecialidadeMedico;
    }

    public int getCrm() {
        return Crm;
    }

    public void setCrm(int Crm) {
        this.Crm = Crm;
    }
}
