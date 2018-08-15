<%-- 
    Document   : index
    Created on : 04/05/2018, 20:02:06
    Author     : rodri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page consome boas vindas</title>
    </head>
    <body>
        <h1>Hello World! consome boas vindas</h1>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.boasvindas.BoasVindasService service = new com.servico.boasvindas.BoasVindasService();
	com.servico.boasvindas.BoasVindas port = service.getBoasVindasPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nome = "Rodrigo";
	// TODO process result here
	java.lang.String result = port.gerarMensagem(nome);
	out.println("Resultado = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
        
        
    </body>
</html>
