<%-- 
    Document   : atualizarProduto
    Created on : 05/09/2014, 20:32:06
    Author     : Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizando Cadastro de Produto</title>
    </head>
    <body>
        <h1>Atualizar Produto</h1>
        
        <form action="Produto.do" method="post">
            <table>
                <tr>
                    <td> Código do Produto: </td>
                    <td> <input type="text" name="cod_produto" id="cod_produto"/> </td>
                </tr>
                <tr>
                    <td> Nome: </td>
                    <td> <input type="text" name="nome" id="nome"/> </td>
                </tr>
                <tr>
                    <td> Código Barras: </td>
                    <td> <input type="text" name="cod_barras" id="cod_barras"/> </td>
                </tr>
                <tr>
                    <td> Fabricante: </td>
                    <td> <input type="text" name="fabricante" id="fabricante"/> </td>
                </tr>
                <tr>
                    <td> Modelo: </td>
                    <td> <input type="text" name="modelo" id="modelo"/> </td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" name="acao" value="Atualizar"/> </td>
                </tr>
            </table>
        </form>  
        
        <h3> <a href="index.jsp"> Voltar </a> </h3>
    </body>
</html>
