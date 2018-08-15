
package com.servico.calculadora;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculadora", targetNamespace = "http://calculadora.servico.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculadora {


    /**
     * 
     * @param valorDois
     * @param valorUm
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "soma", targetNamespace = "http://calculadora.servico.com/", className = "com.servico.calculadora.Soma")
    @ResponseWrapper(localName = "somaResponse", targetNamespace = "http://calculadora.servico.com/", className = "com.servico.calculadora.SomaResponse")
    @Action(input = "http://calculadora.servico.com/Calculadora/somaRequest", output = "http://calculadora.servico.com/Calculadora/somaResponse")
    public float soma(
        @WebParam(name = "valorUm", targetNamespace = "")
        float valorUm,
        @WebParam(name = "valorDois", targetNamespace = "")
        float valorDois);

    /**
     * 
     * @param valorDois
     * @param valorUm
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplica", targetNamespace = "http://calculadora.servico.com/", className = "com.servico.calculadora.Multiplica")
    @ResponseWrapper(localName = "multiplicaResponse", targetNamespace = "http://calculadora.servico.com/", className = "com.servico.calculadora.MultiplicaResponse")
    @Action(input = "http://calculadora.servico.com/Calculadora/multiplicaRequest", output = "http://calculadora.servico.com/Calculadora/multiplicaResponse")
    public float multiplica(
        @WebParam(name = "valorUm", targetNamespace = "")
        float valorUm,
        @WebParam(name = "valorDois", targetNamespace = "")
        float valorDois);

}
