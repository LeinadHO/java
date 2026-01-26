# Parte 5 - Tipos Primitivos e Variáveis
- **Tipos primitivos** são **palavras reservadas**, escritas em letras minúsculas, que determinam o **tipo** de uma variável;

- O **tipo** da variável determina quanto espaço a variável declarada ocupará na memória, além de determinar os possíveis valores que podem ser atribuídos a ela;
 
- Os tipos primitivos são: **int**, **double**, **float**, **char**, **byte**, **short**, **long** e **boolean**;

- Eles são todos numéricos (com excessão do tipo *boolean*);

  - **short:** representa números inteiros entre -32.768 e 32.767;

  - **int:** representa números inteiros entre -2.000.000.000 e +2.000.000.000, aproximadamente;
 
  - **long:** representa números inteiros entre -9 quintilhões e +9 quintilhões, aproximadamente;
 
  - **double:** representa números decimais com certa de **15 casas decimais** e ocupa **64 bits**. Possui maior alcance de valores que o tipo **float**;
 
    - É o tipo padrão para a maioria dos cálculos envolvendo números decimais. 

  - **float:** representa números decimais com cerca de **7 casas decimais** e ocupa **32 bits**. Possui menor alcance de valores que o tipo **double**;
 
    - É utilizado quando os valores envolvidos não são tão grandes ou quando se deseja economizar memória.

  - **char:** representa uma única **letra/caractere**;

  - **byte:** representa um valor de até **1 byte (8 bits)**, o que varia entre -128 e 127;

  - **boolean:** representa os valores lógicos **verdadeiro (true)** ou **falso (false)**;

- Uma **variável** é um **símbolo/nome/local de memória** que pode ser criado para representar um valor que pode ser **alterado** durante a execução do programa ou é **desconhecido** antes do programa ser executado.

# Parte 5.1 - Declaração de Variáveis

- Para declarar uma variável: ```tipo nomeDaVariavel = valorAtribuido;```

  - O **nome** da variável serve como **identificador** do valor. Ou seja, quando for necessário fazer referência ao valor, pode-se usar a variável no lugar;
    
    - O nome deve seguir um padrão de nomenclatura parecido com o Camel Case, porém a **primeira** palavra do nome deve ser escrita em letras minúsculas.
 
  - O **valorAtribuido** deve corresponder ao tipo da variável a que está sendo atribuído;
 
  - O sinal de igual (=) representa **atribuição** de valores. O valor à direita será atribuído à variável na direita.
