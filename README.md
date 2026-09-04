# 🎬 Rede CineMais
Sistema de gerenciamento de cinema desenvolvido em **Java**, criado para simular as principais operações de uma rede de cinemas.

## ✨ Funcionalidades
- Cadastro de cinemas, filmes, salas (2D/3D) e sessões.
- Alteração de filmes e salas
- Consulta de filmes em cartaz, sessões, salas e disponibilidade de vagas
- Venda, cancelamento e exibição de ingressos
- Cálculo do valor dos ingressos
- Aplicação de meia-entrada
- Diferenciação de preços entre dias comuns e finais de semana
- Acréscimo de no valor dos ingressos para salas 3D

## 🛠️ Tecnologias
- Java
- Java Swing

## 📋 Pré-requisitos
- Java JDK 
- NetBeans IDE
- Apache Ant, caso o projeto seja executado diretamente através do build.xml

## 🎞️ Modelo de Negócio
O CineMais representa um sistema de gerenciamento de cinemas, salas, filmes, sessões e ingressos.

### 🎥 Cinema
O cinema possui informações relacionadas à sua localização e aos valores dos ingressos.

### 🏛️ Salas
O projeto utiliza uma classe abstrata `Salas` como base para os diferentes tipos de sala sendo implementadas Sala `2D` e `3D`.

            Salas
              ▲
       ┌──────┴──────┐
       │             │
     Sala2D        Sala3D

Cada sala possui `número, capacidade e tipo`. Além disso, as salas `3D` possui ainda informações sobre os equipamentos utilizados na projeção.

### 🎬 Filme
Cada filme possui informações como: Título, Diretor, Ator principal, Duração, Classificação etária e Categoria.
Entre as categorias utilizadas pelo sistema estão: Ação, Comédia, Infantil, Suspense e Terror.

### 🎞️ Sessões
Uma sessão representa a exibição de um `filme` em determinada `sala`, data e horário.
Cada sessão relaciona: Filme, Sala, Data, Horário e Capacidade.

### 🎟️ Ingressos
Os ingressos representam as vendas realizadas para as `sessões`.
São armazenadas informações relacionadas a: Filme, Sala, Data, Horário, Tipo de sala, Tipo de ingresso e Status da venda.

### 💰 Regras de Negócio
O sistema implementa regras relacionadas ao cálculo dos ingressos. Entre elas:
- Valores diferentes para dias comuns e finais de semana.
- Estudantes possuem direito à meia-entrada.
- Ingressos para `salas 3D` possuem acréscimo de **20%** sobre o valor convencional.
- A venda deve considerar a disponibilidade de vagas da sessão.
- Ingressos podem ser cancelados.

### 🖥️ Interface Gráfica
A aplicação utiliza **Java Swing** para construção da interface gráfica.

## 📄 Sobre o Projeto
Projeto desenvolvido como atividade para a disciplina de Linguagem de Programação II.


O projeto utiliza conceitos de Programação Orientada a Objetos, incluindo:
Classes e objetos, Encapsulamento, Abstração, Herança, Polimorfismo, Construtores, Métodos getters e setters e Associação entre objetos.