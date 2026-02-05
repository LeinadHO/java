# Parte 6 - Operadores

- Operadores são elementos da linguagem que permitem a realização de **operações** entre dois valores/variáveis/elementos.

## Parte 6.1 - Operadores Aritméticos

- Operadores aritméticos são aqueles que permitem realizar operações **matemáticas** entre os números;

- Os operadores aritméticos básicos são:
    
   - Soma (+);
   - Subtração (-);
   - Multiplicação (*);
   - Divisão (/);
   - Resto da divisão (%); 

- OBS 1: O operador de adição (+) pode funcionar de maneiras diferentes, dependendo do contexto em que é utilizado. Quando utilizado com strings, o + serve para **concatenar** duas strings;

- OBS 2: Ao realizar uma divisão (/), recomenda-se sempre utilizar pelo menos um dos valores em tipos que aceitem casas decimais (float e double), pois isso evita perda de informação caso a operação resulte em números com vírgula.

## Parte 6.2 - Operadores Relacionais

- Operadores relacionais são aqueles que **comparam** valores e retornam um valor **lógico**, dependendo do resultado

- Os operadores relacionais básicos são:

   - Menor que (<);
   - Maior que (>);
   - Menor ou igual (<=);
   - Maior ou igual (>=);
   - Igual (==);
   - Diferente (!=);

- O valor à esquerda do operador é comparado com o valor à direita, e se a verificação for correta, a operação retorna o valor lógico **true**. Caso contrário, retorna o valor lógico **false**

   - Exemplos:
        - 5 < 3 retorna **false**, pois 5 não é menor que 3
        - 7 == 7 retorna **true**, pois 7 é igual a 7
        - 15.2 >= 15.2 retorna ** true, pois 15.2 é igual a 15.2

## Parte 6.3 - Operadores Lógicos

- Operadores lógicos são aqueles utilizados para **comparar** os resultados de expressões lógicas

- Os operadores lógicos básicos são:

   - AND (&&): retorna **true** quando **todos** os termos envolvidos são **verdadeiros**;
   - OR (||): retorna **true** quando **pelo menos um** dos termos envolvidos são **verdadeiros**;
   - NOT (!): **inverte** o resultado lógico obtido;

## Parte 6.4 - Operadores de Atribuição

- Operadores de atribuição são aqueles que **atribuem** um valor a uma variável

- Os operadores de atribuição básicos são: **=, +=, -=, *=, /=, %=**

- O sinal de igual atribui o valor diretamente à variável, sem alterá-lo, enquanto os operadores com as operações aritméticas atribuem o resultado da operação que acompanha o igual (=) entre o valor da variável e o valor escrito à direita

    - Exemplo: em *int idade = 10*, ao realizarmos *idade += 1*, o valor final de idade será 11.

- OBS: É possível simplificar ainda mais o incremento/decremento em uma unidade utilizando os operadores **++** e **--**

   - Exemplo: em *int idade = 10*, ao realizarmos *idade++*, o valor final será 11. Ao realizarmos *idade--*, o valor final será 9.

   - A ordem em que o operador é colocado importa para decidir o que deve ser feito primeiro;

        - Exemplo:
        int contador = 0;
        System.out.println(contador++); // Primeiro imprime o valor da variável (0) e depois soma 1
        System.out.println(++contador); // Primeiro soma 1 (0 + 1 = 1) e depois imprime o valor da variável (1)
              
