package br.ufc.quixada.revisao.interfaces;

public class ClienteInterface {

    static void main() {
        ICalculadora c = new CalculadoraCientifica();
        System.out.println(c.somar(20,10));
        System.out.println(c.subtrair(20,10));
    }
}
