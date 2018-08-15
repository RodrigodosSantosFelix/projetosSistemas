<%-- 
    Document   : index
    Created on : 11/05/2018, 20:00:21
    Author     : rodri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Consome</title>
    </head>
    <body>
        <h1>Consome WS via página JSP</h1>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.calcularareas.CalcularAreasService service = new com.servico.calcularareas.CalcularAreasService();
	com.servico.calcularareas.CalcularAreas meuobjeto = service.getCalcularAreasPort();
	 // TODO initialize WS operation arguments here
	double base = 2;
	double altura = 8;
	// TODO process result here
	double resultado = meuobjeto.retangulo(base, altura);
	out.println("Resultado = "+resultado);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
