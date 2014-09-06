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
        <title>Inserir Estoque</title>
    </head>
    <body>
        <h1>Cadastrar Produtos em Estoque</h1>
        
        <form action="Estoque.do" method="post">
            <table>
                <tr>
                    <td> Código do estoque: </td>
                    <td> <input type="text" name="cod_estoque"/> </td>
                </tr>
                <tr>
                    <td> Código do produto: </td>
                    <td> <input type="text" name="cod_produto"/> </td>
                </tr>
                <tr>
                    <td> Qtd do produto: </td>
                    <td> <input type="text" name="qtd_produto"/> </td>
                </tr>
                <tr>
                    <td> Validade: </td>
                    <td> <input type="text" name="validade"/> </td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Cadastrar"/> </td>
                </tr>
            </table>
        </form>
        
        <h3> <a href="index.jsp"> Voltar </a> </h3>
        
    </body>
</html>
