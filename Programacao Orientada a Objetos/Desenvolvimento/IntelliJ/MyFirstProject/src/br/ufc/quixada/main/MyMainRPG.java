package br.ufc.quixada.main;

import br.ufc.quixada.rpg.Archer;
import br.ufc.quixada.rpg.Character;
import br.ufc.quixada.rpg.Knight;
import br.ufc.quixada.rpg.Mage;


public class MyMainRPG {

    public static void main(String args[]){
        Character k = new Knight();
        Character m = new Mage();
        Character a = new Archer();

        /*k.name = "Sir Arthur";
        k.hp = 100;
        k.defense = 50;
        k.damage = 80;*/

        System.out.println(k);
        //System.out.println(k.toString());

    }
}
