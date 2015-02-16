<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC 4 - WEBFORUM</title>
</head>
<body>
<h1>Exemplo de Aplicação RESTfull com Spring MVC 4</h1>
<br>
Utilização:<br><br>
<br><br>1) Crie as tabelas do bco de dados conforme script_cricao_bco_mysql.sql
<br><br>2) Crie para o schema webforum um usuário chamado <b>forum</b> e senha <b>forum123</b> ou modifique<br>
o usuário e senha para sua preferêcia na classe: DatabaseConnection.java
<br><br>3) Para utilizar o forum a partir de um browser:
<br><br>Registrar usuário: <b>http://localhost:8080/webforum3/Registrar?nome=XXXXX</b> (substitua XXXXXX pelo nome do usuário)
<br><br>Retorno: X (cadastrado com sucesso com ID = X ) ou falhou"
<br><br>Obter lista de usuários registrados: <b>http://localhost:8080/webforum3/GetClientes?id=0</b> (onde id é o código do usuário, zero para retornar todos)
<br><br>Retorno: array de usuários registrados no formato JSON
<br><br>Postar mensagem: <b>http://localhost:8080/webforum3/Postar?m={"id":0,"idCliente":1,"nomeCliente":"Elcio","data":"20/01/2015","mensagem":"Alô Mundo !"}</b>
<br><br>Retorno: OK para mensagem postada com sucesso.
<br><br>Obter mensagens: <b>http://localhost:8080/webforum3/GetMensagens?id=0</b> (id da primeira mensagem a partir da qual se deseja obter o restante das mensagens)
<br><br>Retorno: array de lista de mensagens em formato JSON
<br><br><br>
Dúvidas e comentários com Prof. Elcio A.: elcio.abrahao@gmail.com
<br><br>

</body>
</html>