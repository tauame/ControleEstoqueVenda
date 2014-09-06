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
        <title>Cadastro de Produto</title>
    </head>
    <body>
        <h1>Cadastrar Produtos</h1>
        
        <form action="Produto.do" method="post">
            <table>
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
                    <td> <input type="submit" name="acao" value="Inserir"/> </td>
                </tr>
            </table>
        </form>  
        
        <h3> <a href="index.jsp"> Voltar </a> </h3>
        
    </body>
</html>
