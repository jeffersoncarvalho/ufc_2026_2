package br.ufc.quixada.rpg;

public class Character {

    //  DECLARANDO variáveis de instância/objeto
    protected String name;
    private int hp;
    private int damage;
    private int defense;

    public String attack(){
        return "Ataque Genérico!";
    }

   public String toString(){
        String out = "\nName: " + this.name;
        out +=  "\nHP: " + this.hp;
        out += "\nDamage: " + this.damage;
        out += "\nDefense: " + this.defense;
        return out;
     }
}
