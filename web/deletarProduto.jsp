<%-- 
    Document   : deletarProduto
    Created on : 05/09/2014, 20:45:07
    Author     : Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deletando Produto</title>
    </head>
    <body>
    
        <h1>Deletar Produto</h1>
        
        <form action="Produto.do" method="post">
            <table>
                <tr>
                    <td> Código do Produto: </td>
                    <td> <input type="text" name="cod_produto" id="cod_produto"/> </td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" name="acao" value="Deletar"/> </td>
                </tr>
            </table>
        </form>  
        
        <h3> <a href="index.jsp"> Voltar </a> </h3>
    </body>
</html>
