<h1 align="center" style="font-weight: bold;">Gamify Project 👾</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> • 
  <a href="#routes">API Endpoints</a> •
 <a href="#model">Domain Model</a> •
 <a href="#contribute">Contribute</a>
</p>

<p align="center">
    <b>This backend manages a reorderable game list with detailed game information stored in a database.</b>
</p>

<h2 id="technologies">💻 Technologies</h2>

- **Java**
- **Spring Boot**
  - **Spring Data JPA**
  - **Spring Web**
  - **Lombok**
- **JPA/Hibernate**
- **PostgreSQL** and **H2 Database**
- **Docker** and **Docker Compose**
- Projections for **Native SQL**

<h2 id="started">🚀 Getting started</h2>

How to run the project locally

<h3>Prerequisites</h3>

Ensure the following are installed on your system:

- [**Java 21+**](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [**PostgreSQL**](https://www.postgresql.org/)
- [**Maven**](https://maven.apache.org/download.cgi)
- [**Docker**](https://www.docker.com/products/docker-desktop/)

<h3>Installation</h3>

1. Clone repository:

```bash
git clone https://github.com/leovncs/gamify-project.git
```

2. Install dependencies with Maven

3. Install [**PostgreSQL**](https://www.postgresql.org/) and [**Docker**](https://www.docker.com/products/docker-desktop/)

<h2 id="routes">📍 API Endpoints</h2>

Here you can list the main routes of your API, and what are their expected request bodies.
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /games</kbd>     | Retrieve a list of all games
| <kbd>GET /games/${id}</kbd>     | Retrieve a list of a game by id
| <kbd>GET /lists</kbd>     | Retrieve a list of all game lists
| <kbd>GET /lists/${id}/games</kbd>     | Retrieve a game list of a list by id
| <kbd>POST /lists/${id}/replacement</kbd>     | Replace a game in the game list

<h3 id="get-auth-detail">POST /lists/${id}/replacement</h3>

**REQUEST**
```json
{
  "sourceIndex": 3,
  "destinationIndex": 1
}
```

<h2 id="model">🗃️ Domain Model</h2>

![image](https://github.com/leovncs/gamify-project/blob/master/src/main/resources/domain-model.png)

<h2 id="contribute">📫 Contribute</h2>

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.
