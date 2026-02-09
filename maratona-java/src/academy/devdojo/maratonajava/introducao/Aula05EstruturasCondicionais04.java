package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double imposto;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        if (salarioAnual <= 34712) {
            imposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 68507) {
            imposto = salarioAnual * segundaFaixa;
        } else {
            imposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Você deve pagar " + imposto + " de imposto");
    }
}
