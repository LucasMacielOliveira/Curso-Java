package aula03_operadores;

public class OperadoresEmJava {

    int numeroUm = 20;
    int numeroDois = 10;

    int soma = numeroUm + numeroDois; // operador de soma
    int subtracao = numeroUm - numeroDois; // operador de subtração
    int multiplicacao = numeroUm * numeroDois; // operador de multiplicação
    int divisao = numeroUm / numeroDois; // operador de divisão
    int resto = numeroUm % numeroDois; //  operador de resto da divisão


    //Operadodres de atribuição

    // valor =+ 10; // operador de atribuição de soma
    // valor =- 10; // operador de atribuição de subtração
    // valor =* 10; // operador de atribuição de multiplicação
    // valor =/ 10; // operador de atribuição de divisão

    //EXEMPLO: int quantidadeEstoque = 10; -> quantidadeEstoque += 5;

    //Incremento e Decremento
    // int valor = 10;
    // valor++; // incremento
    // valor--; // decremento

    //Operadores relacionais
    // == (igual a)
    // != (diferente de)
    // > (maior que)
    // < (menor que)
    // >= (maior ou igual a)
    // <= (menor ou igual a)

    //exemplo: int valor1 = 10; int valor2 = 20; boolean resultado = valor1 < valor2;


    //Operadores lógicos
    // && (E)
    // || (OU)
    // ! (NÃO)

   public static void main(String[] args) {
        exemplo(args);
    }


    public static void exemplo(String[] args){
       int quantidadeEstoque = 10;
       int quantidadeSolicitada = 5;
       double valorDiaria = 60.00;
       int quantoDias = 3;

       boolean clienteAtivo = true;

       boolean estoqueSuficiente = quantidadeEstoque >= quantidadeSolicitada;

       boolean locacaoPermitida = clienteAtivo && estoqueSuficiente;

       double valorTotal = quantidadeSolicitada * valorDiaria * quantoDias;

       int estoqueRestante = quantidadeEstoque - quantidadeSolicitada;

         System.out.println("===== Informações da Locação =====");
         System.out.println("Quantidade em estoque: " + quantidadeEstoque);
         System.out.println("Quantidade solicitada: " + quantidadeSolicitada);
         System.out.println("Valor da diária: R$ " + valorDiaria);
         System.out.println("Número de dias: " + quantoDias);
         System.out.println("Estoque suficiente: " + estoqueSuficiente);
         System.out.println("Locação permitida: " + locacaoPermitida);
         System.out.println("Valor total: R$ " + valorTotal);
         System.out.println("Estoque restante: " + estoqueRestante);
   }
}
