# 📌 Manipulação de Strings em Java

Este repositório contém diversos programas em Java que realizam manipulações com strings, 
como cálculo de volume, contagem de caracteres, verificação de anagramas e outros. 
Abaixo estão as funcionalidades de cada programa.

## 🚀 Tecnologias Utilizadas

- Java (JDK 8+)
- Scanner para entrada de dados do usuário
- Estruturas de controle (loops, condicionais)
- Métodos para modularização do código

## 📌 Confira meu artigo no DEV.to

Para aprender mais sobre Java e ver exemplos de exercícios, confira meu artigo no [DEV.to](https://dev.to/vitorpaiola/lista-de-exercicios-basicos-em-java-part-2-5aj2)! 🚀

## 📂 Estrutura do Projeto

```estrutura
📦 Manipulacao-Strings-Java
├── 📁 src
│   ├── 📁 string
│   │   ├── 📁 calculadoraVolumeEsfera
│   │   │   └── CalculadoraVolumeEsfera.java
│   │   ├── 📁 concatenarPalavras
│   │   │   └── ConcatenarPalavras.java
│   │   ├── 📁 contarEspacosV1
│   │   │   └── ContarEspacosV1.java
│   │   ├── 📁 contarEspacosV2
│   │   │   └── ContarEspacosV2.java
│   │   ├── 📁 contarVogaisV1
│   │   │   └── ContarVogaisV1.java
│   │   ├── 📁 contarVogaisV2
│   │   │   └── ContarVogaisV2.java
│   │   ├── 📁 exibirLetrasV1
│   │   │   └── ExibirLetrasV1.java
│   │   ├── 📁 exibirLetrasV2
│   │   │   └── ExibirLetrasV2.java
│   │   ├── 📁 exibirNomeSobrenome
│   │   │   └── ExibirNomeSobrenome.java
│   │   ├── 📁 exibirPrimeiroNome
│   │   │   └── ExibirPrimeiroNome.java
│   │   ├── 📁 substituirLetraV1
│   │   │   └── SubstituirLetraV1.java
│   │   ├── 📁 substituirLetraV2
│   │   │   └── SubstituirLetraV2.java
│   │   ├── 📁 verificarAnagramaV1
│   │   │   └── VerificarAnagramaV1.java
│   │   ├── 📁 verificarAnagramaV2
│   │   │   └── VerificarAnagramaV2.java
│   │   ├── 📁 verificarNome
│   │   │   └── VerificarNome.java
│   │   ├── 📁 verificarPalindromo
│   │   │   └── VerificarPalindromo.java
└── README.md
```

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**

Abra o terminal e navegue até a pasta `src` do projeto. Em seguida, execute:

```sh
javac -d . NomeDaPasta/NomeDoArquivo.java
```

Por exemplo, para compilar o programa de volume da esfera:

```sh
javac -d . string/calculadoraVolumeEsfera/CalculadoraVolumeEsfera.java
```

### 2️⃣ **Executar**

Após a compilação, execute o programa com:

```sh
java NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java string.calculadoraVolumeEsfera.CalculadoraVolumeEsfera
```

## 📌 Descrição dos Programas

### 🔵 **CalculadoraVolumeEsfera**

Calcula o volume de uma esfera a partir do raio fornecido pelo usuário.

📌 **Fórmula:**
```java
volume = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
```

### ➗ **ConcatenarPalavras**

Concatena duas palavras fornecidas pelo usuário.

### 🔢 **ContarEspacosV1**

Conta o número de espaços em uma string fornecida pelo usuário.

### 🔢 **ContarEspacosV2**

Conta o número de espaços em uma string, considerando espaços consecutivos.

### 🔤 **ContarVogaisV1**

Conta o número de vogais em uma string fornecida pelo usuário.

### 🔤 **ContarVogaisV2**

Conta o número de vogais em uma string, considerando a diferenciação entre maiúsculas e minúsculas.

### 🔠 **ExibirLetrasV1**

Exibe as letras de uma string fornecida pelo usuário.

### 🔠 **ExibirLetrasV2**

Exibe as letras de uma string de forma reversa.

### 📝 **ExibirNomeSobrenome**

Exibe o nome e sobrenome fornecidos pelo usuário separadamente.

### 📝 **ExibirPrimeiroNome**

Exibe apenas o primeiro nome fornecido pelo usuário.

### 🔄 **SubstituirLetraV1**

Substitui uma letra específica em uma string por outra fornecida pelo usuário.

### 🔄 **SubstituirLetraV2**

Substitui todas as ocorrências de uma letra específica em uma string por outra.

### 🔑 **VerificarAnagramaV1**

Verifica se duas palavras fornecidas pelo usuário são anagramas.

### 🔑 **VerificarAnagramaV2**

Verifica se duas palavras são anagramas, considerando letras repetidas.

### 🧾 **VerificarNome**

Verifica se o nome fornecido pelo usuário atende a um critério específico (por exemplo, se possui mais de 5 caracteres).

### 🔄 **VerificarPalindromo**

Verifica se uma palavra fornecida pelo usuário é um palíndromo.

### 📜 **Licença**

Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**

Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos programas ou funcionalidades,
sinta-se à vontade para abrir um Pull Request. Estou ansioso para ver suas melhorias! 😃
