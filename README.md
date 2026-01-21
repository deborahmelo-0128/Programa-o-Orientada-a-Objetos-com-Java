# Programa-o-Orientada-a-Objetos-com-Java
📚 Projeto Biblioteca – Java
📌 Descrição do Projeto

Este projeto consiste no desenvolvimento de uma aplicação de biblioteca em Java, criada com fins didáticos, com o objetivo de aplicar na prática os principais conceitos de Programação Orientada a Objetos (POO), testes unitários, arquitetura limpa e padrões de projeto.

A aplicação permite o gerenciamento de autores, usuários, livros, artigos e empréstimos, respeitando regras de negócio e princípios de boas práticas de desenvolvimento.

🎯 Objetivos de Aprendizado

Aplicar conceitos fundamentais de POO

Desenvolver código organizado e testável

Implementar padrões de projeto (Decorator e Strategy)

Utilizar JUnit 5 para testes automatizados

Trabalhar com boas práticas de arquitetura e SOLID

🧱 Estrutura do Projeto
📁 Módulo 2 – Código de Produção

Contém as classes responsáveis pela lógica da aplicação:

Pessoa

Usuario

Autor

Livro

Artigo

Emprestimo

ItemEmprestavel (Interface)

Decorators:

LivroDecorator

LivroDigital

LivroRaro

LivroComMulta

Main (Classe de execução)

📁 Módulo 3 – Testes Unitários

Contém os testes automatizados com JUnit 5:

AutorTest

LivroTest

UsuarioTest

EmprestimoTest

ArtigoTest

🧠 Conceitos Aplicados
✔️ Programação Orientada a Objetos (POO)

Encapsulamento com getters e controle de estado

Herança (Usuario herda de Pessoa)

Polimorfismo através de interfaces e decorators

Abstração com interfaces (ItemEmprestavel)

🧪 Testes Unitários

Todos os métodos e regras de negócio foram cobertos por testes unitários utilizando JUnit 5, garantindo:

Validação das regras de empréstimo

Controle de disponibilidade dos livros

Criação correta de artigos e autores

Funcionamento adequado dos decorators

✔️ Todos os testes executam com sucesso (testes verdes)

🧩 Padrões de Projeto Utilizados
🧩 Decorator

O padrão Decorator foi utilizado para adicionar comportamentos aos livros de forma dinâmica, sem modificar a classe base:

Livro digital

Livro raro (não emprestável)

Livro com multa

Isso permite estender funcionalidades respeitando o princípio Open/Closed.

🧠 Strategy

O padrão Strategy foi introduzido para permitir diferentes formas de publicação (livros e artigos), possibilitando a troca de comportamento em tempo de execução, sem acoplamento direto às classes principais.

📐 Princípios SOLID Aplicados

Single Responsibility: cada classe possui uma responsabilidade bem definida

Open/Closed: uso de decorators para extensão de comportamento

Liskov Substitution: uso correto de interfaces

Interface Segregation: contratos simples e objetivos

Dependency Inversion: dependência de abstrações

▶️ Execução do Projeto

A aplicação pode ser executada pela classe Main, que demonstra:

Criação de autor e usuário

Criação de livro e artigo

Realização de empréstimos

Impressão das informações no console

🛠 Tecnologias Utilizadas

Java

IntelliJ IDEA

JUnit 5

Git/GitHub

📚 Considerações Finais

Este projeto consolidou o aprendizado prático sobre arquitetura de software, testes automatizados e padrões de projeto, demonstrando como construir uma aplicação organizada, escalável e de fácil manutenção.
