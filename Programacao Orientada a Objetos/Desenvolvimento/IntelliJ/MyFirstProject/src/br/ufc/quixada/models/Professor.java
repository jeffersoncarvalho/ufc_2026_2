package br.ufc.quixada.models;
import br.ufc.quixada.utils.Titles;

public class Professor {

    private String name;
    private Titles title;
    private String university;

    public Professor() {
        this.name = "";
        this.title = Titles.DOCTORATE;
        this.university = "";
    }
}
