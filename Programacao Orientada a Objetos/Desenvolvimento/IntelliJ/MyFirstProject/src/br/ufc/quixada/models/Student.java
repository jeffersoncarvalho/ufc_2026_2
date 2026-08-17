package br.ufc.quixada.models;

public class Student {

    private String name;
    private float grade01;
    private float grade02;
    private boolean active;

    //construtor padrão
    public Student(){
        this.name = "Fulano de Tal";
        this.grade01 = 0.0f;
        this.grade02 = 0.0f;
        this.active = true;
    }

    //construtor sobrecarregado
    public Student(String name, float grade01, float grade02){
        this.name = name;
        this.grade01 = grade01;
        this.grade02 = grade02;
        this.active = true;
    }

    //método de cálculo da média
    public float calculateAverage(){
        float avg = (this.grade01 + this.grade02)/2.0f;
        return avg;
    }

    //método de impressão de informações
    public void printInformation(){
        System.out.println("Nome: " + this.name);
        System.out.println("Nota 01: " + this.grade01);
        System.out.println("Nota 02: " + this.grade02);
        System.out.println("Ativo: " + this.active);
    }

}
