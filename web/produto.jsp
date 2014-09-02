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
        
        <form action="ProdutoServlet"method="post">
            Nome:<input type="text" name="nome" id="nome"/></br>
            Cod Barras:<input type="text" name="cod_barras" id="cod_barras"/></br>
            Fabricante<input type="text" name="fabricante" id="fabricante"/></br>
            Modelo:<input type="text" name="modelo" id="modelo"/></br>
            <input type="submit" value="Salvar"/>
        </form>
    </body>
</html>
