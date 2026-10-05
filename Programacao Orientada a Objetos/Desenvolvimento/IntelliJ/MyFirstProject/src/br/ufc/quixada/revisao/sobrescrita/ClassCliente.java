package br.ufc.quixada.revisao.sobrescrita;

public class ClassCliente {

    public void mostrarFilhos(ClasseMae[] filhos){

        for(int i = 0; i < filhos.length; i++){
            System.out.println(filhos[i].metodo(""+i));
        }
    }
}
