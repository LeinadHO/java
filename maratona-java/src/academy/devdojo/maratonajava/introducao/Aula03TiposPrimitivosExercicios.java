package academy.devdojo.maratonajava.introducao;
/*
Pŕatica

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Ichigo Kurosaki";
        String endereco = "Karakura, Tóquio - Japão";
        double salario = 500;
        String dataRecebimentoSalario = "31/02/2626";
        String relatorio = "Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}