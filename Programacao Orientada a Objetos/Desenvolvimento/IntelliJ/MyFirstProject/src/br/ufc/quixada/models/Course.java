package br.ufc.quixada.models;

public class Course {

    private Professor professor;
    private Student students[];

    public Course() {
        this.students = new Student[10];
        this.professor = null;
    }
}
