# Projeto Web Services com Spring Boot e JPA / Hibernate

Este projeto é uma API de Web Services desenvolvida com Spring Boot e JPA / Hibernate. O objetivo é implementar um CRUD completo, incluindo tratamento de exceções, configuração de banco de dados em memória (H2) para testes, além de explorar conceitos de camadas lógicas (Resource, Service, Repository) e mapeamento de entidades.

## Objetivos do Projeto

- Criar um projeto Spring Boot em Java.
- Implementar um modelo de domínio com entidades relacionadas.
- Estruturar camadas lógicas: Resource, Service e Repository.
- Configurar banco de dados de teste (H2).
- Povoar o banco de dados com dados iniciais.
- Implementar operações CRUD (Create, Retrieve, Update, Delete).
- Adicionar tratamento de exceções para operações do CRUD.

## Checklist do Projeto

### Configurações Iniciais
- Criado com [Spring Initializr](https://start.spring.io/).
  - Maven
  - Java 17
  - Packaging: JAR
  - Dependências: Spring Web, Spring Data JPA, H2 Database

### Camadas do Sistema
- **Camada de Domínio**: Modelo de dados utilizando entidades JPA.
- **Camada de Serviço**: Regras de negócio implementadas nos serviços.
- **Camada de Controle (Resource)**: Pontos de entrada da API (endpoints RESTful).

### Entidades
- **User**: Representa um usuário no sistema.
- **Order**: Representa um pedido realizado por um usuário.
- **Category**: Categorias para produtos.
- **Product**: Produtos disponíveis no sistema.
- **OrderItem**: Relacionamento many-to-many entre pedidos e produtos, com atributos adicionais.

### Configuração de Banco de Dados
- Banco de dados em memória H2 configurado para o perfil de teste.
- Mapeamento JPA das entidades.
  
  **application.properties:**
  ```properties
  spring.profiles.active=test
  spring.jpa.open-in-view=true
