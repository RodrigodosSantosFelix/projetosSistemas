<%-- 
    Document   : index
    Created on : 04/05/2018, 21:24:58
    Author     : rodri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page consome calculadora</title>
    </head>
    <body>
        <h1>Hello World! consome calculadora</h1>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.calculadora.CalculadoraService service = new com.servico.calculadora.CalculadoraService();
	com.servico.calculadora.Calculadora port = service.getCalculadoraPort();
	 // TODO initialize WS operation arguments here
	float valorUm = 151.10f;
	float valorDois = 9460.410f;
	// TODO process result here
	float result = port.multiplica(valorUm, valorDois);
	out.println("Resulto Multiplicação = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.calculadora.CalculadoraService service = new com.servico.calculadora.CalculadoraService();
	com.servico.calculadora.Calculadora port = service.getCalculadoraPort();
	 // TODO initialize WS operation arguments here
	float valorUm = 910.10f;
	float valorDois = 30.90f;
	// TODO process result here
	float result = port.soma(valorUm, valorDois);
	out.println("Resulto Soma = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

            
    </body>
</html>
