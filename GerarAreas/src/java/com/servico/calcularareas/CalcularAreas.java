package com.servico.calcularareas;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(
        name = "CalcularAreas",
        serviceName = "CalcularAreasService")

public class CalcularAreas {
    
    @WebMethod(operationName = "retangulo")
    public double retangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura ) {
        return base * altura;
    }
    
    @WebMethod(operationName = "triangulo")
    public double triangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura) {
        return (base * altura)/2;
    }
}