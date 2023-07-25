# Aplicação CLI Spring Shell

Esta é uma simples aplicação de linha de comando construída usando o Spring Shell, uma poderosa ferramenta do Spring Framework, para proporcionar uma experiência interativa e amigável através da linha de comando.

## Começando

### Pré-requisitos

- Java JDK (Java Development Kit) instalado no seu sistema.
- Conhecimento em Java e conceitos básicos do Spring Framework.

### Configurando o Projeto

1. Clone este repositório para sua máquina local.
1. Construa o projeto usando o Maven:

```bash
mvnw.cmd clean install
```

### Executando a Aplicação

1. Execute a aplicação Spring Boot usando o Maven:

```bash
mvnw.cmd spring-boot:run
```

2. Assim que a aplicação iniciar, você verá o prompt de comando do Spring Shell:

```bash
shell:>
```

### Utilizando a Aplicação

Digite `help` para ver a lista de comandos disponíveis:

```bash
shell:>help

AVAILABLE COMMANDS

Built-In Commands
       help: Display help about available commands
       stacktrace: Display the full stacktrace of the last error.
       clear: Clear the shell screen.
       quit, exit: Exit the shell.
       history: Display or save the history of previously run commands
       version: Show version info
       script: Read and execute commands from a file.

Hello Command
       hello: Dizer olá ao usuário
```

Utilize o comando `hello` para cumprimentar o usuário:

```bash
shell:>hello
Olá, Spring Shell!
```

Adicione um nome como parâmetro opcional para o comando `hello`:

```bash
shell:>hello Leonardo
Olá, Leonardo!
```


