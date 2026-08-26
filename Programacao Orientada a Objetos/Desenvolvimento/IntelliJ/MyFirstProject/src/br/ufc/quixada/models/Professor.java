package br.ufc.quixada.models;

import br.ufc.quixada.utils.Title;

public class Professor {

    private String name;
    private String university;
    private String course;
    private Title title;

    //CONSTRUTOR PADRÃO
    public Professor() {
        this.name = "Fulano de Tal";
        this.university = "UFC";
        this.course = "Sistemas de Informação";
        this.title = Title.MESTRADO;
    }

    //SOBRECARGA DE CONSTRUTOR / OVERLOADING
    public Professor(String name, String university, String course, Title title) {
        this.name = name;
        this.university = university;
        this.course = course;
        this.title = title;
    }

    //SOBRESCRITA / OVERWRITING / OVERRIDING
    public String toString(){
        String out = "Nome: " + this.name;
        out += "\nUniversidade: " + this.university;
        out += "\nCurso: " + this.course;
        out += "\nTítulo: " + this.title;

        return out;
    }
}
