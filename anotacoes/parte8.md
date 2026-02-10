# Parte 8 - Estruturas de Repetição

- As estruturas de repetição são aquelas que repetem o trecho de código em seu escopo até que uma **condição de saída** seja atingida

## Parte 8.1 - O while

- A estrutura **while** irá repetir o código em seu escopo enquanto sua condição for **verdadeira**

- Exemplo:
  ```java
  int count = 0;
  while (count < 10) {
    System.out.println(count);
    count++;
  }
  ```
  
- O while é melhor utilizado quando **não se sabe** quantas vezes a iteração terá que ser feita

## Parte 8.2 - O do-while

- A estrutura **do-while** é semelhante ao *while*, mas ela garante que a ação será executada **no mínimo** uma vez

- Exemplo:
  ```java
  int count = 10;
  do {
    System.out.println("Dentro do do-while"); // A mensagem será printada uma vez, mesmo que a condição seja falsa
  } while (count < 10);
  ```

- É útil quando se deseja que algo seja feito pelo menos uma vez, independente do resultado da expressão lógica

## Parte 8.3 - O for

- O **for** irá executar o código delimitado por ele por uma quantidade **definida** de vezes

- A quantidade de iterações é explícitamente escrita na definição do escopo do *for*

- Exemplo:
  ```java
  for (int i = 0; i < 10; i++) {
    System.out.println("For " + i);
  }
  ```

  - No exemplo acima, a primeira parte do for, ```int i = 0```, indica a variável que será utilizada para marcar a **continuidade (ou não)** do for, essa variável é comumente chamada de **índice**
    
  - A segunda parte do for, ```i < 10```, indica a **condição de saída** do loop
 
  - A terceira parte do for, ```i++```, indica como será feito o **incremento/decremento** da variável
