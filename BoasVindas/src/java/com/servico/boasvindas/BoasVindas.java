/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servico.boasvindas;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Rodrigo dos Santos Felix
 * 
 */
@WebService(
        name = "BoasVindas",
        serviceName = "BoasVindasService"
)
public class BoasVindas {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "gerarMensagem")
    public String gerarMensagem(@WebParam(name = "nome") String nome) {
        return "Seja bem vindo " + nome + " !";
    }
}