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

### Parte 9.1.3 - Para acessar/atribuir valores em um array:

- ```identificador[indice]```

  - O **indice** é a posição do valor que se deseja acessar
 
    - O valor do indice pode variar de **0** até **tamanho-1**
   
- A **atribuição** é feita do mesmo modo que uma variável primitiva: ```identificador[indice] = valor;```    
