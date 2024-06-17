# Projeto de POO em Java

## Universidade Vale do Rio Doce (UNIVALE)

### Curso de Sistemas de Informação

### Disciplina: Programação Orientada a Objetos

### Aluno: Jeiel Jedson Leão Alves

---

## Descrição do Projeto

Este projeto foi desenvolvido como parte da avaliação da disciplina de Programação Orientada a Objetos (POO) na UNIVALE. O objetivo principal foi implementar duas funcionalidades utilizando Java para a gestão de veículos:

1. **Tela de Login**: Implementar uma interface de login que valida o usuário e a senha com um banco de dados. Se as credenciais forem válidas, o sistema redireciona o usuário para uma tela de cadastro de veículos.
   
2. **Tela de Cadastro de Veículos**: Implementar uma interface de cadastro que permita registrar veículos com pelo menos cinco atributos distintos. Além disso, a interface deve exibir os registros cadastrados em um `jTable`.

---

## Funcionalidades

### 1. Tela de Login

A tela de login autentica os usuários antes de permitir o acesso ao cadastro de veículos. As principais características desta funcionalidade são:

- **Interface**: Um formulário simples contendo campos para inserir o nome de usuário e a senha.
- **Validação**: As credenciais são verificadas contra um banco de dados relacional.
- **Navegação**: Em caso de sucesso na autenticação, o usuário é redirecionado para a tela de cadastro de veículos.

**Tecnologias e Ferramentas:**
- **Java SE**: Utilizado para a lógica de programação.
- **Swing**: Utilizado para criar a interface gráfica do usuário (GUI).
- **JDBC**: Usado para a conexão e a interação com o banco de dados.

### 2. Tela de Cadastro de Veículos

A tela de cadastro permite a inserção e a visualização de registros de veículos. As principais características desta funcionalidade são:

- **Interface**: Um formulário com os campos necessários para a inserção de novos registros de veículos.
- **Atributos**: Inclui no mínimo cinco atributos, como Placa, Modelo, Marca, Ano e Cor.
- **Exibição de Registros**: Os registros cadastrados são exibidos em uma tabela (`jTable`) na mesma interface, permitindo a visualização fácil dos veículos cadastrados.

**Tecnologias e Ferramentas:**
- **Java SE**: Utilizado para a lógica de programação.
- **Swing**: Utilizado para criar a interface gráfica do usuário (GUI).
- **JDBC**: Usado para a conexão e a interação com o banco de dados.

---

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- `src`
  - `main`
    - `java`
      - `LoginForm.java` - Implementa a tela de login.
      - `Login.java` - Classe modelo para o login. 
      - `LoginDAO.java` - Classe para interagir  com o banco de dados.
      - `MySQLConnection.java` - Classe para a conexão com o banco de dados.
      - `VeiculosForm.java` - Implementa a tela de cadastro de veículos.
      - `Veiculo.java` - Classe modelo que representa um veículo.
      - `VeiculoDAO.java` - Classe para interagir com o banco de dados.

---

## Instruções de Execução

### Requisitos

- **Java Development Kit (JDK) 8 ou superior**
- **Banco de Dados**: MySQL

### Passos para Executar

1. **Configurar o Banco de Dados**:
   - Crie um banco de dados e uma tabela para armazenar os usuários.
   - Crie uma tabela para armazenar os veículos com os atributos necessários.

2. **Configurar o Projeto**:
   - Clone o repositório ou baixe os arquivos.
   - Abra o projeto em sua IDE Java preferida (por exemplo, IntelliJ IDEA ou NetBeans).
   - Configure a string de conexão ao banco de dados no arquivo `VeiculoDAO.java`.

3. **Executar a Aplicação**:
   - Compile e execute o arquivo `LoginForm.java`.
   - Faça login com um usuário existente no banco de dados ou adicione manualmente um usuário para teste.
   - Após o login bem-sucedido, a tela de cadastro de veículos será exibida.

---

## Banco de Dados

### Estrutura do Banco de Dados

#### Tabela: `usuarios`

| Campo     | Tipo    | Descrição                |
|-----------|---------|--------------------------|
| id        | INT     | Chave primária           |
| usuario   | VARCHAR | Nome de usuário          |
| senha     | VARCHAR | Senha do usuário         |

#### Tabela: `veiculos`

| Campo     | Tipo    | Descrição                |
|-----------|---------|--------------------------|
| id        | INT     | Chave primária           |
| marca     | VARCHAR | Marca do veículo         |
| modelo    | VARCHAR | Modelo do veículo        |
| ano       | INT     | Ano de fabricação        |
| placa     | INT     | Placa do veículo         |
| cor       | VARCHAR | Cor do veículo           |
| tipo      | VARCHAR | Tipo do veículo          |

---

## Conclusão

O projeto demonstra o uso de conceitos de Programação Orientada a Objetos (POO) para implementar uma aplicação de cadastro e autenticação utilizando Java. As principais funcionalidades, como a tela de login e a tela de cadastro de veículos, mostram a interação com um banco de dados e a manipulação de interfaces gráficas. Este projeto pode ser estendido para incluir funcionalidades adicionais conforme necessário.

---  
### Nota

As informações sobre as tabelas de banco de dados são apenas para fins de exemplo. Certifique-se de adequar a estrutura conforme necessário para o seu ambiente específico.

---

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE.txt).

[![Licença](https://img.shields.io/badge/Licença-MIT-blue.svg)](https://opensource.org/licenses/MIT)