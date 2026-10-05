package br.ufc.quixada.revisao.casting;

public class MainCasting {

    static void main() {
        //===============================
        //criação de uma referência
        ClassA classA;
        //"apontando" a referência ao objeto
        classA = new ClassA();
        //criando um objeto a partir da referência da
        //classe mãe
        //===============================
        ClassA refA = new ClassB();
        //Eu só posso acessar os métodos relativos a minha referencia,
        //mesmo o objeto sendo o filho
        refA.metodoA(); //ok
        //refA.metodoB();//não é possível
        //como acessar um método do meu filho, a partir de uma referência-pai?
        //resposta: usando o downcasting
        ((ClassB)refA).metodoB();
        //===============================
        //Criando outra referência de A que aponta para uma OBJETO
        //da ClasseC que é "irmão" da ClassB
        ClassA refA2 = new ClassC();
        if ( refA2 instanceof ClassB){
            ((ClassB)refA2).metodoB();
        }else {
            System.out.println("Não é possível fazer o casting!");
        }
        //===============================
        //Referências filho NÃO podem apontar para objetos-pai
        //ClassC classC = new ClassA(); //erro de compilação
        //Referências irmãs não podem se apontar
        //ClassB refB = new ClassC(); erro de compilação


    }
}
