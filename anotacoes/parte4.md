# Parte 4 - Comentários
- Comentários são trechos do código que **NÃO serão lidos** pelo compilador, logo **NÃO serão executados**;
  
- Eles são úteis para, dentre muitos:
  
  1. Indicar informações a outros desenvolvedores que acessam o código;
     
  2. Explicar o funcionamento de certos trechos do programa;
     
  3. Servir como anotação/lembrança da função de certas partes do sistema.

# Parte 4.1 - Tipos de comentários
- **Comentários de uma linha:** São comentários que só valem na linha onde foram escritos. É indicado com *//*.
  
  - Exemplo:
    
    `// Este é um comentário de uma linha! Nenhuma dessas palavras será lida pelo compilador!`

- **Comentaŕios de múltiplas linhas:** São comentários que são válidos para todas as linhas incluídas no seu intervalo. O início do intervalo é marcado com _/*_, e o fim do intervalo é marcado com _*/_.

  - Exemplo:
    
    ```java
    /* Este é um comentário
       de múltiplas linhas!
       Nenhuma dessas palavras será lida
       pelo compilador! */
    ```

- **Comentários "javadoc":** São comentários **oficiais** da linguagem java, e são utilizados para fins de **documentar** o código, isto é, descrever o funcionamento de funções, métodos, classes, e tudo que for necessário para entender o funcionamento do sistema.

- Esses comentários são especiais pois são lidos e tratados pela linguagem, sendo possível até utilizar HTML dentro, por exemplo.
  
  - Exemplo:
    ```java
    /**
    *  Isso é um comentário javadoc! Tudo nesse intervalo será exibido para outras pessoas a fim de explicar uma parte do código!
    */
    ```

# Parte 4.2 - Quando devo comentar meu código?
- Resposta rápida: **NUNCA**, a não ser que seja *javadoc*;
  
- Comentar o código é visto como uma má prática de programação, pois se você precisa explicar muito o que um código faz, significa que ele não foi escrito de forma clara suficiente;
  
- Evitar comentários "simples", como:
  
  ```java
  // imprime algo na tela
  System.out.println("algo na tela");
  ```
  
  pois o programador já deve saber para que serve a função `System.out.println();`
