package br.ufc.quixada.prova02.q04;

public class Contas {

    //método estático, pode ser chamado pelo nome da classe.
    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        System.out.println("O resultado é: " + operacao.calcular(x, y));
    }

    public static void main(String args[]) {
        //Primeiro calculamos uma soma
        Contas.mostrarCalculo(new Soma(), 5, 5); //Imprime o resultado é: 10
        //Depois uma subtração
        Contas.mostrarCalculo(new Subtracao(), 5, 5); //Imprime o resultado é: 0
    }

}
