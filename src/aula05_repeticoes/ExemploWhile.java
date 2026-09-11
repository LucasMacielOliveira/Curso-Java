package aula05_repeticoes;
import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade solicitada: ");
        int quantidadeSolicitada = entrada.nextInt();

        while (quantidadeSolicitada <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");

            System.out.print("Digite novamente: ");
            quantidadeSolicitada = entrada.nextInt();
        }

        System.out.println("Quantidade válida: " + quantidadeSolicitada);



        /*while (contador <= 3) {
            System.out.println("Repetição: " + contador);
            contador++;
        }

        System.out.println("Repetição encerrada.");*/
    }
}