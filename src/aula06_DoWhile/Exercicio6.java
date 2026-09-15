package aula06_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        locacao(args);
    }

    public static void locacao(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // Usa ponto na diaria: 25.50.

        int quantidadeEstoque = 30;
        String nomeProduto = "Furadeira";
        boolean continuar;

        // Repete o atendimento para cada nova locacao.
        do {
            System.out.println("Digite o nome do cliente: ");
            String nomeCliente = entrada.nextLine();

            System.out.println("Estoque disponível: " + quantidadeEstoque);
            System.out.println("Digite a quantidade desejada: ");
            int quantidadeSolicitada = entrada.nextInt();

            System.out.println("Digite a quantidade de dias: ");
            int quantidadeDias = entrada.nextInt();

            System.out.println("Digite o valor da diária (ex.: 25.50): ");
            double valorDiaria = entrada.nextDouble();

            System.out.println("O cliente está ativo? (true/false): ");
            boolean clienteAtivo = entrada.nextBoolean();

            // Corrige os valores invalidos antes de calcular a locacao.
            do {
                if (quantidadeSolicitada <= 0 || quantidadeSolicitada > quantidadeEstoque) {
                    System.out.println("A quantidade deve estar entre 1 e " + quantidadeEstoque + "!");
                    System.out.println("Digite novamente a quantidade desejada: ");
                    quantidadeSolicitada = entrada.nextInt();

                } else if (quantidadeDias <= 0) {
                    System.out.println("A quantidade de dias deve ser maior que 0!");
                    System.out.println("Digite novamente a quantidade de dias: ");
                    quantidadeDias = entrada.nextInt();

                } else if (valorDiaria <= 0) {
                    System.out.println("O valor da diária deve ser maior que 0!");
                    System.out.println("Digite novamente o valor da diária: ");
                    valorDiaria = entrada.nextDouble();
                }

            } while (quantidadeSolicitada <= 0
                    || quantidadeSolicitada > quantidadeEstoque
                    || quantidadeDias <= 0
                    || valorDiaria <= 0);

            if (!clienteAtivo) {
                System.out.println("O cliente não está ativo. Locação não realizada.");

            } else {
                double valorTotalLocacao = quantidadeSolicitada * valorDiaria * quantidadeDias;
                quantidadeEstoque = quantidadeEstoque - quantidadeSolicitada;

                System.out.println("====== LOCAÇÃO ======");
                System.out.println("Nome do cliente: " + nomeCliente);
                System.out.println("Nome do produto: " + nomeProduto);
                System.out.println("Quantidade solicitada: " + quantidadeSolicitada);
                System.out.println("Quantidade de dias: " + quantidadeDias);
                System.out.printf("Valor da diária: R$ %.2f%n", valorDiaria);
                System.out.println("O cliente está ativo? " + clienteAtivo);
                System.out.printf("Valor total da locação: R$ %.2f%n", valorTotalLocacao);
                System.out.println("Estoque restante: " + quantidadeEstoque);
                System.out.println("=====================");
            }

            // Sem estoque, nao ha como iniciar outra locacao.
            if (quantidadeEstoque == 0) {
                System.out.println("Estoque esgotado.");
                break;
            }

            System.out.println("Deseja realizar outra locação? (true/false): ");
            continuar = entrada.nextBoolean();
            entrada.nextLine(); // Consome o Enter antes da proxima leitura do nome.

        } while (continuar);

        entrada.close();
        System.out.println("Programa encerrado.");
    }
}