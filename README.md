# Readme para a aplicação Java Spring com MySQL e REST
O que é

Esta é uma aplicação simples que utiliza o model "Pessoa", gerando uma tabela SQL e possibilitando requisições HTTP. Ela foi desenvolvida com Java e o framework Spring, utilizando o banco de dados MySQL para armazenamento dos dados.

Como usar
Dê um git clone para baixar o projeto.
Crie o seu banco de dados MySQL e altere as configurações de conexão no arquivo application.properties.
Crie a tabela "Pessoa" de acordo com o model fornecido.
Abra o Postman e faça as requisições HTTP necessárias.

Requisições disponíveis

GET ALL: Obtém todos os registros da tabela "Pessoa".
GET por ID: Obtém um registro específico da tabela "Pessoa" pelo seu ID.
POST: Adiciona um novo registro à tabela "Pessoa".
PUT: Atualiza um registro existente na tabela "Pessoa".
DELETE: Deleta um registro existente na tabela "Pessoa".

Obs.: Certifique-se de verificar a documentação da API e as regras de uso antes de fazer as requisições. Além disso, é importante tratar possíveis erros e exceções durante o processo de envio e recebimento de dados.
