package br.ufc.quixada.revisao.interfaces;

public class CalculadoraCientifica implements ICalculadora{
    @Override
    public float somar(float x, float b) {
        return x + b;
    }

    @Override
    public float subtrair(float x, float b) {
        return x - b;
    }
}
