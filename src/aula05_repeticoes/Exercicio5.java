//Nome do cliente;
//Nome do produto;
//Quantidade solicitada;
//Quantidade de dias;
//Valor da diária;
//Se o cliente está ativo

package aula05_repeticoes;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Locacao(args);
    }

    public static void Locacao(String[] args){
        Scanner entrada = new Scanner(System.in);
        int quantidadeEstoque = 30;

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = entrada.nextLine();

        System.out.println("Digite a quantidade desejada: ");
        int quantidadeSolicitada = entrada.nextInt();

        System.out.println("Digite a quantidade de dias: ");
        int quantidadeDias = entrada.nextInt();

        System.out.println("Digite o valor da diária: ");
        double valorDiaria = entrada.nextDouble();

        System.out.println("O cliente está ativo? (true/false): ");
        boolean clienteAtivo = entrada.nextBoolean();

        while (quantidadeSolicitada <= 0 || quantidadeSolicitada > quantidadeEstoque){
            System.out.println("A quantidade solicitada deve ser maior que 0 e menor ou igual à quantidade de estoque!!");
            System.out.println("Digite a quantidade desejada: ");
            quantidadeSolicitada = entrada.nextInt();
        }

        while (quantidadeDias <= 0 ){
            System.out.println("A quantidade de dias deve ser maior que 0!!");
            System.out.println("Digite a quantidade de dias: ");
            quantidadeDias = entrada.nextInt();
        }
        while (valorDiaria <= 0){
            System.out.println("O valor da diária deve ser maior que 0!!");
            System.out.println("Digite o valor da diária: ");
            valorDiaria = entrada.nextDouble();
        }

        if(!clienteAtivo){
            System.out.println("O cliente não está ativo!!");
        }else{
           double valorTotalLocacao = quantidadeSolicitada * valorDiaria * quantidadeDias;
            int estoqueRestante = quantidadeEstoque - quantidadeSolicitada;

            System.out.println("===== Locação Aprovada =====");
            System.out.println("Nome do cliente: " + nomeCliente);
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Quantidade solicitada: " + quantidadeSolicitada);
            System.out.println("Quantidade de dias: " + quantidadeDias);
            System.out.println("Valor da diária: R$ " + valorDiaria);
            System.out.println("Valor total da locação: R$ " + valorTotalLocacao);
            System.out.println("Estoque restante: " + estoqueRestante);

            if (valorTotalLocacao >= 1000) {
                System.out.println("Classificação: valor alto");
            } else if (valorTotalLocacao >= 500) {
                System.out.println("Classificação: valor médio");
            } else {
                System.out.println("Classificação: valor baixo");
            }

        }
    }
}
