/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servico.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Rodrigo dos Santos Felix
 */
@WebService(
        name = "Calculadora",
        serviceName = "CalculadoraService")
public class Calculadora {
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "soma")
    public float soma(@WebParam(name = "valorUm") float valorUm, @WebParam(name = "valorDois") float valorDois) {
        return  valorUm + valorDois;
    }
    @WebMethod(operationName = "multiplica")
    public float multiplica(@WebParam(name = "valorUm") float valorUm, @WebParam(name = "valorDois") float valorDois) {
        return valorUm * valorDois;
    }
}
