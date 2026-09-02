package br.ufc.quixada.main;

import br.ufc.quixada.rpg.Archer;
import br.ufc.quixada.rpg.Character;
import br.ufc.quixada.rpg.Knight;
import br.ufc.quixada.rpg.Mage;


//classe cliente
public class MyMainRPG {

    public static void main(String args[]){
        Character k = new Knight();
        Character m = new Mage();
        Character a = new Archer();


        /*k.name = "Sir Arthur";
        k.hp = 100;
        k.defense = 50;
        k.damage = 80;*/

        k.setName("Sir Florence");
        k.setDamage(-60);
        k.setDefense(30);
        k.setHp(100);
        //System.out.println("Nome: " + k.getName());
        System.out.println(k);
        //System.out.println(k.toString());

    }
}
