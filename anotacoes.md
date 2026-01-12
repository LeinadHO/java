# Parte 1 - Como o Java Funciona?
- Linguagem **orientada a objetos** desenvolvida pela *Oracle*;

- É uma linguagem **compilada** (utiliza um compilador) e **interpretada** (utiliza um interpretador), além de ser **fortemente** e **estaticamente tipada** (exige que os tipos sejam explicitados na declaração das variáveis, e uma vez declarados, não podem ser mudados);
  
- Tem como objetivo permitir, ao máximo, a reutilização dos códigos-fonte, a fim de facilitar a escalabilidade, manutenção e atualização do programa.

## Parte 1.1 - javac: O compilador Java
- Java é uma linguagem **compilada**, ou seja, o arquivo *.java* precisa passar por um **compilador** antes de ser executado;
  
- No Java, o comando para utilizar o compilador é o **javac**;
  
- O javac transforma o código-fonte Java em **bytecode**, um código intermediário que pode ser entendido pela **Java Virtual Machine (JVM)**;
  
- Esse bytecode é armazenado em um arquivo com extensão *.class*.
 
## Parte 1.2 - Java Virtual Machine (JVM): O "interpretador" Java
- A JVM funciona como um intermediário entre o programa em Java e os diferentes sistemas operacionais. O bytecode gerado pelo javac no arquivo *.class* é interpretado pela JVM;
  
- **Cada sistema operacional terá uma versão específica da JVM**, que atenderá ás suas demandas e especificidades;
  
- Desta forma, não é necessário escrever uma versão diferente do programa para cada sistema operacional onde se deseja fazê-lo disponível, pois o trabalho de tornar o programa compatível fica com a JVM;
  
- Em outras linguagens seria necessário criar uma versão do programa para cada SO em que ele fosse ficar disponível;
  
- A JVM facilita a criação e manutenção dos programas em Java, pois é mais fácil corrigir e atualizar um único código-fonte.
  
## Parte 1.3 - Java Development Kit (JDK)
- Programa que reúne diversos componentes essenciais e utilitários para o desenvolvimento de aplicações em Java;
  
- O JDK possui como componentes a JVM, o compilador javac, debugadores de código (para encontrar e corrigir erros mais facilmente), entre outros;
  
- Ele tem diferentes versões que foram lançadas ao longo dos anos, mas permite que programas desenvolvidos em versões antigas possam ser rodados nas versões mais recentes (retrocompatibilidade).

# Parte 2 - Estrutura básica de um código em Java
```java
public class ClasseDeExemplo {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");
  }
}
```

- As chaves delimitam o **escopo** da função, ou seja, determinam as partes do código que estão incluídas em suas atribuições/declarações;
  
- O **ponto e vírgula** no final do ```System.out.println("Olá mundo!");``` servem para marcar o fim de um comando.

```java
public class ClasseDeExemplo {
  ...
}
```

- O bloco acima se refere a **declaração de classe**. Convencionou-se que as classes em Java devem ser nomeadas seguindo o padrão **Camel Case** (as primeiras letras de cada palavra no nome devem ser maiúsculas).

```java
public static void main(String[] args) {
  ...
}
```

- O trecho de código acima é a **função principal** do programa. Ela é o ponto de entrada de toda aplicação em Java que for executada;
  
- O ```String[] args``` dentro dos parênteses é chamado de **argumento** da função, e pode ser usado dentro da função em que foi definido.

```java
System.out.println("Olá mundo!");
```

- O código acima é referente a função de **print**, ou seja, ela exibe o texto passado como **argumento** no terminal;
  
- Todo texto literal (textos que não são código) em Java deve ser escrito entre **aspas duplas**.

# Parte 2.1 - Compilando e executando um programa em Java manualmente
1. Depois de terminar de escrever o código, é necessário salvar o arquivo-fonte. O nome do arquivo deve ser **o mesmo** da classe implementada nele, acrescido da extensão *.java*.
   - No exemplo: **ClasseDeExemplo.java**.
   
2. Depois, deve-se abrir o terminal e navegar até a pasta onde o arquivo foi salvo;
   
3. Lá, executa-se o comando ```javac NomeDaClasse.java``` para chamar o compilador, onde **NomeDaClasse.java** é o nome do arquivo-fonte que deseja-se compilar.
   - No exemplo: ```javac ClasseDeExemplo.java```;
   
4. O compilador irá gerar um arquivo contendo o bytecode na mesma pasta em que foi executado, com o mesmo nome da classe, porém com a extensão *.class*.
   - No exemplo: **ClasseDeExemplo.class**.

5. Para executar o programa usa-se o comando ```java NomeDaClasse```, onde **NomeDaClasse** é o nome do arquivo *.class* que foi gerado na compilação.
   - No exemplo: ```java ClasseDeExemplo```;
   - Não se deve escrever o nome do arquivo com a extensão *.class*.
