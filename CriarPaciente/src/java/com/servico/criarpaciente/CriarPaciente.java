package com.servico.criarpaciente;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(
        name = "CriarPaciente",
        serviceName = "CriarPacienteService")

public class CriarPaciente
{

    @WebMethod(operationName = "gerarPaciente")
    public Paciente gerarPaciente(@WebParam(name = "nome") String nome, @WebParam(name = "tipoEnfermidade")
    String tipoEnfermidade)
    {
        Paciente pacienteUm = new Paciente(nome, tipoEnfermidade);
        return pacienteUm;
    }
}
