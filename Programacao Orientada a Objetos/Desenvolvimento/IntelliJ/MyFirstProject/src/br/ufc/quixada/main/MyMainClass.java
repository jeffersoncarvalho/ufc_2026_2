package br.ufc.quixada.main;

import br.ufc.quixada.models.Professor;
import br.ufc.quixada.models.Student;
import br.ufc.quixada.rpg.Archer;
import br.ufc.quixada.rpg.Knight;
import br.ufc.quixada.rpg.Mage;
import br.ufc.quixada.utils.Title;
import br.ufc.quixada.rpg.Character;

public class MyMainClass {

    static void main() {

        Character k = new Knight();
        Character a = new Archer();
        Character m = new Mage();

        System.out.println(k.attack());
        System.out.println(a.attack());
        System.out.println(m.attack());


        /*Professor p1 = new Professor();
        Professor p2 = new Professor("Jefferson", "UFC", "Sistemas de Informação", Title.DOUTORADO);

        System.out.println("Professor 01:\n " + p1);
        System.out.println("======================");
        System.out.println("Professor 02:\n " + p2);*/

        /*
        Student s1 = new Student("Jefferson", 5.6f, 8.0f);
        s1.printInformation();
        System.out.println("A média é: " + s1.calculateAverage());
        */
    }
}
