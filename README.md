# Sistema de Gestão de Posto de Saúde

Este é um projeto de sistema de gestão para um posto de saúde, desenvolvido com foco em gerenciamento de pacientes, funcionários, vacinas e turnos de plantão. O sistema foi desenvolvido utilizando **Java** e **MySQL** para o banco de dados, visando facilitar o controle e acesso a informações relacionadas ao funcionamento do posto.

## Diagrama do Banco de Dados

O projeto utiliza uma base de dados estruturada para o gerenciamento das principais entidades envolvidas no funcionamento do posto de saúde. As tabelas e suas relações estão descritas a seguir:

### Tabelas

- **Paciente**: Armazena informações dos pacientes, como nome, data de nascimento, endereço e contatos.
- **Vacina**: Armazena os detalhes sobre as vacinas disponíveis no posto.
- **Vacina_Paciente**: Relaciona as vacinas administradas aos pacientes, incluindo a data e dose aplicada.
- **Funcionário**: Armazena dados dos funcionários do posto, como nome, função, CPF, e informações de contato.
- **Login**: Gerencia as credenciais de acesso ao sistema.
- **Plantão**: Gerencia os turnos de plantão dos funcionários, com registros de horários de entrada e saída.

### Relacionamentos

- Um paciente pode receber várias vacinas.
- Cada funcionário possui um plantão, com horários de entrada e saída registrados.
- O sistema utiliza a tabela de login para gerenciar permissões e acessos dos usuários.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do sistema.
- **MySQL**: Banco de dados utilizado para armazenamento das informações.
- **JDBC**: API para conexão e manipulação do banco de dados MySQL.
- **Maven**: Gerenciador de dependências para o projeto.

## Funcionalidades

- Cadastro e gerenciamento de pacientes.
- Registro e controle de vacinas aplicadas.
- Cadastro de funcionários e gerenciamento de plantões.
- Sistema de login com permissões de acesso.

