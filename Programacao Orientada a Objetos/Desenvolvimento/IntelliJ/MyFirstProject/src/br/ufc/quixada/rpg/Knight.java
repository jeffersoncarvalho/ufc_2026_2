package br.ufc.quixada.rpg;

public class Knight extends Character{

    public Knight() {
        this.setDamage(25);
    }

    public String attack(){

        String out = "";
        out += "\nEnemyBoss ENERGY: " + EnemyBoss.ENERGY;
        if((EnemyBoss.ENERGY - this.getDamage()) < 0) {
            out += "Inimigo já derrotado! Não há necessidade de ataque.";
            out += "\n======================================";
            //return out; não é uma boa prática
        }else {
            EnemyBoss.ENERGY = EnemyBoss.ENERGY - this.getDamage();
            out += "\nCavaleiro atacou o EnemyBoss com dano " + this.getDamage();
            out += "\nEnemyBoss ENERGY: " + EnemyBoss.ENERGY;
            out += "\n======================================";
        }
        return out;
    }

    public void printMyName(){
        System.out.println("Name: " + this.getName());
        System.out.println("Name: " + this.getDamage());
    }
}
