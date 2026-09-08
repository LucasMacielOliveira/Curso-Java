package aula03_operadores;
import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = entrada.nextLine();

        System.out.println("Digite a quantidade de estoque: ");
        int quantidadeEstoque = entrada.nextInt();

        System.out.println("Digite a quantidade solicitada: ");
        int quantidadeSolicitada = entrada.nextInt();

        System.out.println("Digite a quandidade de dias: ");
        int quantidadeDias = entrada.nextInt();

        System.out.print("Digite o valor da diária: ");
        double valorDiaria = entrada.nextDouble();

        System.out.println("O cliente está ativo? (true/false): ");
        boolean clienteAtivo = entrada.nextBoolean();

        double valorTotalLocacao = quantidadeSolicitada * valorDiaria * quantidadeDias;

        //estoque restante

        int estoqueRestante = quantidadeEstoque - quantidadeSolicitada;

        // verifica se a locação é permitida

        boolean locacaoPermitida = clienteAtivo && (quantidadeSolicitada <= quantidadeEstoque);

        // Se o valor total é maior que R$ 500;

        boolean valorTotalMaiorQue500 = valorTotalLocacao > 500;

        // Quantos produtos sobram no estoque.

        System.out.println("===== Informações da Locação =====");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Quantidade solicitada: " + quantidadeSolicitada);
        System.out.println("Quantidade de dias: " + quantidadeDias);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("Valor total da locação: R$ " + valorTotalLocacao);
        System.out.println("Estoque restante: " + estoqueRestante);
        System.out.println("Locação permitida: " + locacaoPermitida);
        System.out.println("Valor total maior que R$ 500: " + valorTotalMaiorQue500);

    }
}





