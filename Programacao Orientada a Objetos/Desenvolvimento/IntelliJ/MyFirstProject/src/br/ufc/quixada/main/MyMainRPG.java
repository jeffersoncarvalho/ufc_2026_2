package br.ufc.quixada.main;

import br.ufc.quixada.rpg.*;
import br.ufc.quixada.rpg.Character;


//classe cliente
public class MyMainRPG {

    public static void main(String args[]){

        //criando os objetos
        Character k = new Knight();
        Character m = new Mage();
        Character a = new Archer();
        a.setName("Robin");
        Character a1 = new Archer();
        a1.setName("Legolas");

        //criando um array estático com 4 posições
        Character[] characters = new Character[7];

        //alimentando o array com os objetos criados
        characters[0] = k;
        characters[1] = m;
        characters[2] = a;
        characters[3] = a1;
        characters[4] = k;
        characters[5] = k;
        characters[6] = k;

        //criando um objeto do TIPO Battle
        Battle b = new Battle();

        //chamando o método "batle(Character characters[])"
        //b.battle(characters);
        b.enhacedBattle(characters);
    }
}
