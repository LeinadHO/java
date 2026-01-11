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
