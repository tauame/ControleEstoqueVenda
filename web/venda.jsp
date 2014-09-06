<%-- 
    Document   : venda
    Created on : 05/09/2014, 00:10:41
    Author     : Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar Venda</h1>
        
        <form action="Venda.do" method="post">
            <table>
                <tr>
                    <td> Código do Produto: </td>
                    <td> <input type="text" name="cod_produto"/> </td>
                </tr>
                <tr>
                    <td> Qtd do Produto: </td>
                    <td> <input type="text" name="qtd_produto"/> </td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Inserir Venda"/> </td>
                </tr>
            </table>
        </form>
        
        <h3> <a href="index.jsp"> Volar </a> </h3>
        
    </body>
</html>
