OBS: é necessario no projeto a API do JSON, e o driver JDBC Mysql.

Este projeto, consiste em ler os dados de um arquivo JSON e salvar os mesmos em um banco de dados Mysql.
*Classes:
-Cliente: cria as variaveis que serão salvas no banco( nome e telefone) e seus Geteers  Seteers.
-daopadrao : cria o metodo salvar, que herda os dados da classe Cliente e realiza o insert no banco.
-Conexao : realiza a conexao com o banco de dados Mysql(Já criado previamente), atraves do driver JDBC. Tambem cria o metodo que fecha a conexao
com banco.
-CriaJson: escreve um arquivo no formato JSON, com os dados contidos nas variaveis nome e telefone, e grava o arquivo dentro da apsta do projeto.
-LeituraJson: realiza a leitura do arquivo JSON, armazenado na pasta do projeto, aramazena suas informações nas em variaveis, para em seguida, usar a função
salvarCliente, para gravar no banco de dados, as informações extraidas do arquivo.
