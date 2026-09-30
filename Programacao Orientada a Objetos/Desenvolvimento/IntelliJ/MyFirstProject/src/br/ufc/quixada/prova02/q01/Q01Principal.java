package br.ufc.quixada.prova02.q01;

public class Q01Principal {

    static void main() {

        //item a)
        ClasseA a = new ClasseC();
        //ClasseC c;
        //ClasseC c = new ClasseC();
        //válido pois tipos menores (B e C) podem ser
        //referenciados por tipos maiores (A)
        //a = new ClasseC();
        //c = new ClasseA();//inválido, pois c é um tipo menor que ClasseA
        //inválido
        //c = a;

        //item B
        //a.atrasar();
        //Para você acessar um método que pertence a um objeto ao
        //qual a referencia aponta, você deve fazer um "casting"
        //DOWNCASTING
        ((ClasseC)a).casar();

        //item c
        //eu SEI que a é um referência que aponta para um objeto
        //do tipo ClasseC!
        //erro em tempo de execução pois não existe relacionamento
        //is-a entre B e C
        ((ClasseB)a).brincar();


    }
}
