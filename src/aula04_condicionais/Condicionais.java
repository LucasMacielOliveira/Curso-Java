package aula04_condicionais;

public class Condicionais {

    public static void main(String[] args) {
        double valorTotal = 750.00;

        if (valorTotal > 1000) {
            System.out.println("Locação de valor alto.");
        } else if (valorTotal >= 500) {
            System.out.println("Locação de valor médio.");
        } else {
            System.out.println("Locação de valor baixo.");
        }

    }
}
