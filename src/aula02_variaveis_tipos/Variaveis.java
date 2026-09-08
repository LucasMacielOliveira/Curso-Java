package aula02_variaveis_tipos;

public class Variaveis {

    /*TIPOS DE VARIAVEIS */

    //STRING:

    String Nome = "Lucas Maciel";  // String é um tipo de variavel que gurda Texto.
    String Curso = "Ciência da Computação";
    String Ferramenta = "Java";

    //INT:

    int idade = 40; // Int é um tipo de variavel que guarda numeros inteiros.
    int anoNascimento = 1983;
    int semestreAtual = 6;

    //DOUBLE:

    double nota = 8.5; // Double é um tipo de variavel que guarda numeros decimais.
    double altura = 1.75;
    double peso = 70.5;

    //BOOLEAN:

    boolean aprovado = true; // Boolean é um tipo de variavel que guarda valores verdadeiro ou falso.
    boolean matriculaAtiva = false;
    boolean temExperiencia = true;

    //CHAR:

    char sexo = 'M'; // Char é um tipo de variavel que guarda um unico caractere.
    char inicialCurso = 'C';
    char inicialNome = 'L';

    //FLOAT:

    float salario = 2500.50f; // Float é um tipo de variavel que guarda numeros decimais, porem com menos precisao que o Double.
    float notaProva = 8.5f;
    float PLR = 1500.75f;

    //LONG:

    long populacao = 2100000000L; // Long é um tipo de variavel que guarda numeros inteiros, porem com maior capacidade que o Int.
    long distanciaTerraSol = 149600000000L;
    long distanciaEuaBrasil = 8000000L;

    //SHORT:

    short idadeMedia = 30; // Short é um tipo de variavel que guarda numeros inteiros, porem com menor capacidade que o Int.
    short numeroMaximo = 32767;
    short numeroMinimo = -32768;


    /*
    * Observaçã0: int tem capacidade de 2.147.483.647,
    * long tem capacidade de 9.223.372.036.854.775.807,
    * short tem capacidade de 32.767.
    * byte tem capacidade de 127.

    * podemos redeclarar uma variavel,
    * mas não podemos redeclarar uma variavel com o mesmo nom dentro do mesmo escopo.
     */

    // CONSTANTE COM FINAL

    final double PI = 3.14159; // Final é uma palavra reservada que indica que a variavel é uma constante, ou seja, não pode ser alterada.
    final int diasSemana = 7;


    public static void main(String[] args) {
        Variaveis variaveis = new Variaveis();
        variaveis.idade = 45; // redeclarando a variavel idade

        System.out.println("Nome: " + variaveis.Nome);
        System.out.println("Curso: " + variaveis.Curso);
        System.out.println("Ferramenta: " + variaveis.Ferramenta);
        System.out.println("Idade: " + variaveis.idade);
        System.out.println("Ano de Nascimento: " + variaveis.anoNascimento);
        System.out.println("Semestre Atual: " + variaveis.semestreAtual);
        System.out.println("Nota: " + variaveis.nota);
        System.out.println("Altura: " + variaveis.altura);
        System.out.println("Peso: " + variaveis.peso);
        System.out.println("Aprovado: " + variaveis.aprovado);
        System.out.println("Matrícula Ativa: " + variaveis.matriculaAtiva);
        System.out.println("Tem Experiência: " + variaveis.temExperiencia);
        System.out.println("Sexo: " + variaveis.sexo);
        System.out.println("Inicial do Curso: " + variaveis.inicialCurso);
        System.out.println("Inicial do Nome: " + variaveis.inicialNome);
        System.out.println("Salário: " + variaveis.salario);
        System.out.println("Nota da Prova: " + variaveis.notaProva);
        System.out.println("PLR: " + variaveis.PLR);
        System.out.println("População: " + variaveis.populacao);
        System.out.println("Distância Terra-Sol: " + variaveis.distanciaTerraSol);
        System.out.println("Distância EUA-Brasil: " + variaveis.distanciaEuaBrasil);
        System.out.println("Idade Média: " + variaveis.idadeMedia);
        System.out.println("Número Máximo: " + variaveis.numeroMaximo);
        System.out.println("Número Mínimo: " + variaveis.numeroMinimo);

        exemplo(args);

    }

    public static void exemplo(String[] args) {
       String nomeProduto = "Furadeira";
       String marcaProduto = "Bosch";
       int quantidadeProduto = 10;
       double precoProduto = 199.99;

       if (quantidadeProduto > 0) {
           boolean disponivel = true;
       }else {
           System.out.println("produto indisponivel para locação");
       }

       System.out.println("===== Informações do Produto =====");
       System.out.println("Nome do Produto: " + nomeProduto);
       System.out.println ("Marca:" + marcaProduto);
       System.out.println("Quantidade em Estoque: " + quantidadeProduto);
       System.out.println("Preço: R$" + precoProduto);
    }


}

