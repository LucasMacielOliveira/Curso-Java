package aula04_condicionais;
import java.util.Scanner;



public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = entrada.nextLine();

        System.out.println("Digite a quantidade no estoque: ");
        int quantidadeEstoque = entrada.nextInt();

        System.out.println("Digite a quantidade solicitada: ");
        int quantidadeSolicitada = entrada.nextInt();

        System.out.println("Digite a quantidade de dias: ");
        int quantidadeDias = entrada.nextInt();

        System.out.println("Digite o valor da diaria: ");
        double valorDiaria = entrada.nextDouble();

        System.out.println("Digite se o cliente esta ativo (true/false): ");
        boolean clienteAtivo = entrada.nextBoolean();


        if (quantidadeSolicitada <= 0) {
            System.out.println("quantidade solicitada não pode ser negativa.");
        } else if (quantidadeSolicitada > quantidadeEstoque) {
            System.out.println("quantidade solicitada não pode ser maior que a quantidade em estoque.");
        } else if (!clienteAtivo) {
            System.out.println("cliente não está ativo.");
        }else if(quantidadeEstoque <= 0){
            System.out.println("quantidade em estoque não pode ser negativa.");
        } else if (valorDiaria <= 0) {
            System.out.println("valor da diaria não pode ser negativo.");
        } else if (quantidadeDias <= 0) {
            System.out.println("quantidade de dias não pode ser negativa.");
        } else {
        }
            double valorTotal = quantidadeSolicitada * valorDiaria * quantidadeDias;

            int estoqueRestante = quantidadeEstoque - quantidadeSolicitada;

            System.out.println("===== RESULTADO DA LOCAÇÃO =====");
            System.out.println("Locação aprovada!");
            System.out.println("Cliente: " + nomeCliente);
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Valor total: R$ " + valorTotal);
            System.out.println("Estoque restante: " + estoqueRestante);

            if (valorTotal >= 1000) {
                System.out.println("Classificação: valor alto");
            } else if (valorTotal >= 500) {
                System.out.println("Classificação: valor médio");
            } else {
                System.out.println("Classificação: valor baixo");
            }
        }
        }


