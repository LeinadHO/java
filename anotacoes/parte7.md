# Parte 7 - Estruturas Condicionais

- Estruturas condicionais servem para **direcionar** a execução do programa dependendo de condições determinadas durante a escrita do código

- Normalmente, os trechos de códigos dentro dessas estruturas só são executados quando a condição para entrada é atingida

- As principais estruturas condicionais são:

   - **if**: seu conteúdo só é executado quando a condição de entrada no *if* é **verdadeira**

      - Exemplo:
        
        ```java
        if (condicaoVerdadeira) {
            System.out.println("Entrei no if");
        }
        ```
    
   - **else**: seu conteúdo só é executado quando a condição de entrada de todos os *ifs* e *else ifs* for **falsa**
 
      - Exemplo:
        
        ```java
        if (condicaoVerdadeira) {
            System.out.println("Entrei no if");
        } else {
            System.out.println("Entrei no else");
        }
        ```
        
   - **else if**: seu conteúdo só é executado quando a sua condição de entrada é **verdadeira** e a de todos os *ifs* e *else ifs* anteriores for **falsa**
 
      - Exemplo:
        
        ```java
        if (primeiraCondicaoVerdadeira) {
            System.out.println("Entrei no if");
        } else if (segundaCondicaoVerdadeira) {
            System.out.println("Entrei no primeiro else if");
        } else if (terceiraCondicaoVerdadeira) {
            System.out.println("Entrei no segundo else if");
        } else {
            System.out.println("Entrei no else");
        }
        ```

- OBS 1: O **operador ternário (?)** funciona como um bloco de if-else "compacto". É possível utilizá-lo para atribuir diretamente um valor a uma variável ou um retorno de função/método, quando a definição desse valor depende de uma **condição**

   - Exemplo:
     
      ```java
      variavel = (condicao) ? valorAtribuidoCasoSejaVerdadeiro : valorAtribuidoCasoSejaFalso
      ```

- OBS 2: O **switch** é uma estrutura condicional usada para simplificar o código quando há **muitas** condições que deseja-se tratar para uma mesma variável

   - Exemplo:

      ```java
      int variavel;
      switch (variavel) {
         case 1:
            // faz algo
            break;
         case 2:
            // faz algo
            break;
         case 3:
            // faz algo
            break;
         case 4:
            // faz algo
            break;
         *
         *
         *
         default:
            // caso genérico
            break;
      }
      ```   
