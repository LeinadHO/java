# Parte 9 - Arrays

- Arrays são uma estrutura de dados que armazena valores de mesmo tipo

- Arrays são variáveis do tipo **reference**, ou seja: **não armazenam o valor real de um objeto, e sim o endereço de memória onde ele está salvo**

## Parte 9.1 - Declaração, Inicialização e Manipulação de Arrays

### Parte 9.1.1 - Para declarar uma variável do tipo array:

- ```tipo[] identificador``` ou ```tipo idenfificador[]``` *(a primeira forma é mais recomendada)*

### Parte 9.1.2 - Para inicializar um array:

- ```tipo[] identificador = new tipo[tamanho]```

  - O **tipo** define o tipo dos valores armazenados no array
 
  - o **identificador** é o nome da variável do array
 
  - O **tamanho** indica a quantidade máxima de valores que pode ser armazenada no array

#### Parte 9.1.2.1 - Inicializando um array com valores diferentes do padrão:

- ```int[] numeros = {1, 2, 3, 4, 5}``` ou ```int[] numeros = new int[]{1, 2, 3, 4, 5}```

  - O array *numeros* é inicializado com 5 posições e com os valores *{1, 2, 3, 4, 5}* em cada posição, respectivamente 

### Parte 9.1.3 - Para acessar/atribuir valores em um array:

- ```identificador[indice]```

  - O **indice** é a posição do valor que se deseja acessar
 
    - O valor do indice pode variar de **0** até **tamanho-1**
   
- A **atribuição** é feita do mesmo modo que uma variável primitiva: ```identificador[indice] = valor;```    

- Como uma variável de tipo *reference*, as posições do array são inicializadas com um valor padrão, dependendo do tipo do array. Os valores são:

  - **0** para *byte, short, int, long, float e double
 
  - **'\u000'** (caractere que equivale a um espaço em branco) para *char*
 
  - **false** para *boolean*
 
  - **null** para tipos *reference* (como String)

## Parte 9.2 - Iteração em Arrays

- Para iterar por um array, pode-se utilizar as estruturas de repetição:

    ```java
    String[] nomes = new String[3];
    
    for (int i = 0; i < nomes.length; i++) {
      System.out.println(nomes[i]);
    }
    ```

- Dessa forma, todos os elementos do array serão imprimidos durante a execução do *for*

- Todo array possui um campo chamado **length**, que retorna o seu tamanho ao ser chamado. Esse e demais campos podem ser acessados adicionando um **ponto** depois do nome do array

### Parte 9.2.1 - O foreach

- O **for-each** é uma forma alternativa da estrutura **for**. Sua sintaxe é:

  ```java
  int[] numeros = {1, 2, 3, 4, 5}

  for (int num: numeros) {
    System.out.println(num);
  }
  ```

- Essa estrutura não permite acessar índices específicos do array
