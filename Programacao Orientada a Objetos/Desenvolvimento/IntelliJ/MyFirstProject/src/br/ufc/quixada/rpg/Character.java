package br.ufc.quixada.rpg;

public class Character {
    //  DECLARANDO variáveis de instância/objeto
    private String name;
    private int hp;
    private int damage;
    private int defense;

    //construtor???

    //gets e sets
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp(){
        return this.hp;
    }

    public void setDamage(int damage){
        if(damage < 0 || damage > 100){
            this.damage = 0;
            System.out.println("ERRO: Valor de Dano incorreto! Apenas números positivos menores ou igual a 100!");
        }else {
            this.damage = damage;
        }
    }
    public int getDamage(){
        return this.damage;
    }

    public void setDefense(int defense){
        this.defense = defense;
    }
    public int getDefense(){
        return this.defense;
    }

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
