package br.ufc.quixada.main;

import br.ufc.quixada.models.Student;

public class MyMainClass {

    static void main() {

        Student s1 = new Student("Jefferson", 5.6f, 8.0f);
        s1.printInformation();
        System.out.println("A média é: " + s1.calculateAverage());
    }
}
