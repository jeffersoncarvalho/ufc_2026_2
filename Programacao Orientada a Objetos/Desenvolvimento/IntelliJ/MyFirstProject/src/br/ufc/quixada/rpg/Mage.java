package br.ufc.quixada.rpg;

public class Mage extends Character{

    public Mage() {
        this.setDamage(15);
    }

    public String attack(){
        String out = "";
        out += "\nEnemyBoss ENERGY: " + EnemyBoss.ENERGY;
        EnemyBoss.ENERGY = EnemyBoss.ENERGY - this.getDamage();
        out += "\nMago atacou o EnemyBoss com dano " + this.getDamage();
        out += "\nEnemyBoss ENERGY: " + EnemyBoss.ENERGY;
        out += "\n======================================";
        return out;
    }
}
