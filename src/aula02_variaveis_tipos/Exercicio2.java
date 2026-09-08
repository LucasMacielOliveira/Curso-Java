package aula02_variaveis_tipos;

public class Exercicio2 {

    public static void main(String[] args) {

        // Programa responsável por apresentar os dados de uma locação.
        String nomeCliente = "Lucas Maciel de Oliveira";
        String nomeProduto = "Furadeira";

        int quantidadeAlugada = 5;
        int diasAlugados = 3;

        double valorDiaria = 50.00;
        double totalLocacao =
                quantidadeAlugada * valorDiaria * diasAlugados;

        boolean locacaoAtiva = true;

        final String NOME_EMPRESA = "OLS Locações";

        System.out.println("===== Informações da Locação =====");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Quantidade Alugada: " + quantidadeAlugada);
        System.out.println("Dias Alugados: " + diasAlugados);
        System.out.println("Valor da Diária: R$ " + valorDiaria);
        System.out.println("Total da Locação: R$ " + totalLocacao);
        System.out.println("Locação Ativa: " + locacaoAtiva);
        System.out.println("Nome da Empresa: " + NOME_EMPRESA);
    }
}