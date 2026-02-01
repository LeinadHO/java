package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Carimbo Miguel";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(idade);
        System.out.println("Oi, meu nome é " + nome);
    }
}
