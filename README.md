# webforum_spring_4
Exemplo de aplicação que implementa um Forum Web como RESTfull utilizando Spring MVC 4

Utilização:

1) Crie as tabelas do bco de dados conforme script_cricao_bco_mysql.sql 

2) Crie para o schema webforum um usuário chamado forum e senha forum123 ou modifique
o usuário e senha para sua preferêcia na classe: DatabaseConnection.java 

3) Para utilizar o forum a partir de um browser: 

Registrar usuário: http://localhost:8080/webforum3/Registrar?nome=XXXXX (substitua XXXXXX pelo nome do usuário) 

Retorno: X (cadastrado com sucesso com ID = X ) ou falhou" 

Obter lista de usuários registrados: http://localhost:8080/webforum3/GetClientes?id=0 (onde id é o código do usuário, zero para retornar todos) 

Retorno: array de usuários registrados no formato JSON 

Postar mensagem: http://localhost:8080/webforum3/Postar?m={"id":0,"idCliente":1,"nomeCliente":"Elcio","data":"20/01/2015","mensagem":"Alô Mundo !"} 

Retorno: OK para mensagem postada com sucesso. 

Obter mensagens: http://localhost:8080/webforum3/GetMensagens?id=0 (id da primeira mensagem a partir da qual se deseja obter o restante das mensagens) 

Retorno: array de lista de mensagens em formato JSON 


Dúvidas e comentários com Prof. Elcio A.: elcio.brahao@gmail.com 


