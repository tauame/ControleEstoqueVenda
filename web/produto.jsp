<%-- 
    Document   : teste
    Created on : 29/08/2014, 20:11:21
    Author     : tauame
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Cadastro de produtos</h1>
        
        <form action="FornecedorServlet">
            Codigo de barras: <input type="text" name="codbarras"/></br>
            Nome: <input type="text" name="nome"/></br>
            Fabricante: <input type="text" name="fabricante"/></br>
            Modelo: <input type="text" name="modelo"/></br>
            <input type="submit" value="Salvar"/>
        </form>
    </body>
</html>
