<%-- 
    Document   : estoque
    Created on : 29/08/2014, 21:24:56
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Adicionar produtos</h1>
        
        <form action="FornecedorServlet">
            Codigo do estoque: <input type="text" name="codestoque"/></br>
            Codigo do produto: <input type="text" name="codprod"/></br>
            Qtde do produto: <input type="text" name="qtdeprod"/></br>
            Validade: <input type="text" name="validade"/></br>
            <input type="submit" value="Salvar"/>
    </body>
</html>
