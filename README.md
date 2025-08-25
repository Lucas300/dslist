# Game List API

API REST desenvolvida em **Java com Spring Boot**, utilizando **JPA/Hibernate** para persistência e os bancos de dados **H2** (testes) e **PostgreSQL** (produção).  
Projeto criado durante o **Intensivão Java Spring** do professor [Nélio Alves](https://devsuperior.com.br/).

---

## Sobre o Projeto

O sistema tem como objetivo gerenciar uma lista de jogos.  

- Cada **jogo (Game)** possui título, gênero, ano de lançamento, plataformas, score e descrições.  
- É possível organizar jogos em diferentes **listas (GameList)**, como “Favoritos” ou “Top RPGs”.  
- O relacionamento entre jogos e listas é feito pela entidade **Belonging**, que também guarda a **posição** de cada jogo dentro da lista.  

Modelo Conceitual:

![Diagrama ER](./dslist-model.png) <!-- Ajuste o caminho conforme sua pasta -->

---

## Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot 3**  
- **Spring Data JPA**  
- **Hibernate**  
- **H2 Database** (testes)  
- **PostgreSQL** (produção)  
- **Maven**  
- **Postman / Insomnia** (testes de endpoints)  

---

## Estrutura do Projeto

│<br>
├── config/ # Configurações globais do projeto (beans, cors, etc) <br>
├── controller/ # Controladores REST (endpoints da API)<br>
├── dto/ # Data Transfer Objects (transferência de dados entre camadas)<br>
├── entities/ # Entidades JPA (mapeamento do banco de dados)<br>
├── projections/ # Interfaces para consultas personalizadas (SQL nativo ou JPQL)<br>
├── repository/ # Interfaces Repository (acesso ao banco via JPA/Hibernate)<br>
└── services/ # Regras de negócio e lógica de aplicação<br>


##  Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/Lucas300/dslist
2. Import o projeto na sua IDE
3.  Rode o projeto e acesse o http://localhost:8080 com o Insomnia ou Postman


##  Endpoints

```http
GET /games
GET /games/{id}
GET /lists
```
### Reposicionar Jogos de uma lista

POST /lists/{id}/replacement
{
  "sourceIndex": 3,
  "destinationIndex": 1
}


