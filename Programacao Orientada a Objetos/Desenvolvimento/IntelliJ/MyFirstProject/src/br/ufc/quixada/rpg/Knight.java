package br.ufc.quixada.rpg;

public class Knight extends Character{

    public String attack(){
        return "Ataque do Cavaleiro!";
    }

    public void printMyName(){
        System.out.println("Name: " + this.getName());
        System.out.println("Name: " + this.getDamage());
    }
}
