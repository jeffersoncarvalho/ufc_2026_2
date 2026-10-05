package br.ufc.quixada.revisao.sobrescrita;

/*
* Sobrescrita de métodos (method overriding) é a
* redefinição, em uma subclasse, de um método herdado da superclasse,
* com a mesma assinatura (nome, parâmetros e tipo de retorno),
* mas com uma implementação própria
* */

public class ClasseMae{

    public String toString() {
        //return super.toString();
        return "Sobrescrita em ClasseMae!";
    }

    public String metodo(String s){
        return "Classe Mae: " + s;
    }

    static void main() {
        //objeto anônimo ou objeto sem referência
        System.out.println(new ClasseMae());
    }
}
