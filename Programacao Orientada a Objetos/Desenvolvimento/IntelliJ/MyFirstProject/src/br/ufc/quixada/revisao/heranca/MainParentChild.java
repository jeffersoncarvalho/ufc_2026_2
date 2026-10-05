package br.ufc.quixada.revisao.heranca;

public class MainParentChild {

    static void main() {
        //public
        Parent p1 = new Parent();
        p1.nome = "Jefferson";
        Parent p2 = new Child();
        p2.nome = "Sicrano";
        Child c1 = new Child();
        c1.nome = "Beltrano";

        //protected - não posso acessar via objeto!
        //p1.idade;
        //c1.idade;

        //private
        //p1.curso = "Engenharia de Software";

    }
}
