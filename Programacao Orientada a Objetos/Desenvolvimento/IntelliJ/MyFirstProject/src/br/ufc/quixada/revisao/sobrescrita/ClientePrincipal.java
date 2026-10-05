package br.ufc.quixada.revisao.sobrescrita;

public class ClientePrincipal {

    static void main() {
        ClassCliente cliente = new ClassCliente();
        ClasseMae[] filhos = {
          new ClasseFilhoA(),
          new ClasseFilhoB(),
          new ClasseFilhoB(),
          new ClasseFilhoA(),
          new ClasseFilhoB()
        };
        cliente.mostrarFilhos(filhos);
    }
}
