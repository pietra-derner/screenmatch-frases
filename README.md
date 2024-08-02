# SCREEN FRASES 🎬

Projeto de uma aplicação que é conectada com o front-end e criação de um banco de dados de frases de artistas de filmes e séries. A aplicação irá verificar as frases registradas no banco de dados e irá imprimí-las na página web de forma aleatória. Esse projeto foi criado a partir do desafio do Curso "[Java: criando sua primeira API e conectando ao front](https://cursos.alura.com.br/course/java-criando-primeira-api-conectando-front)", da [Alura](https://www.alura.com.br/).

## **Como rodar o projeto: ✅**
- No aplicativo pgAdmin, crie o banco de dados com o nome desejado. No caso da minha aplicação, o nome: *screen_frases*
- Após a criação da tabela, acesse o arquivo *application.properties* e altere a url, username e password com as suas informações.
  
Exemplo:
```
spring.datasource.url=jdbc:postgresql://${localhost}/screen_frases
spring.datasource.username=${usuario_nome}
spring.datasource.password=${usuario_senha}
```
Lembrando que essas informações devem ser as mesmas utilizadas na configuração do pgAdmin e na criação da tabela acima.

- Incluir dados no seu banco de dados:

Exemplo:
```
insert into frases(id, frase, personagem, titulo, poster) values (1, 'Eu não sou uma pessoa boa, mas sou uma pessoa bem-humorada.', 'Max Black', '2 Broke Girls', 'https://m.media-amazon.com/images/M/MV5BMTYxMDA3Mzg5NV5BMl5BanBnXkFtZTgwNDIxOTcwMDI@._V1_.jpg');Digite 'Bruno Mars'
insert into frases(id, frase, personagem, titulo, poster) values (2, 'Eu só queria evitar qualquer situação que pudesse ser potencialmente perigosa... e também qualquer coisa que pareça assustadora.', 'Medo', 'Divertidamente', 'https://m.media-amazon.com/images/M/MV5BOTgxMDQwMDk0OF5BMl5BanBnXkFtZTgwNjU5OTg2NDE@._V1_.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (3, 'Se você não pode encontrar o amor em uma panqueca, onde mais você vai encontrar?', 'Sookie', 'Gilmore Girls', 'https://m.media-amazon.com/images/M/MV5BZGQ1ZGM1YjEtM2UwNy00OTJlLTk1ODQtMjNkODRiNjE1ZDllXkEyXkFqcGdeQXVyMzI4Nzk0NjY@._V1_.jpg');
```

Caso queira verificar se as informações foram incluídas no seu banco de dados com sucesso, pode fazer o seguinte comando:
```
SELECT * FROM frases;
```

Para ver o projeto rodar na web, basta clonar [este repositório](https://github.com/jacqueline-oliveira/3356-java-desafio-front) e fazê-lo rodar através do [VS Code](https://code.visualstudio.com/).

## **Tecnologias utilizadas:** 
* [Java](https://www.java.com/pt-BR/)
* [Spring DevTools](https://docs.spring.io/spring-boot/reference/using/devtools.html)
* [Lombok](https://www.baeldung.com/intro-to-project-lombok)
* [JPQL](https://docs.oracle.com/cd/E29542_01/apirefs.1111/e13946/ejb3_langref.html)
* [PostgreSQL](https://www.postgresql.org/)

