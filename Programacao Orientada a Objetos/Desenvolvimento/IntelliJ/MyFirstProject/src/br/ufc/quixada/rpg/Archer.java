package br.ufc.quixada.rpg;

public class Archer extends Character{

    public Archer() {
        this.setDamage(5);
    }

    public String attack(){

        String out = "";
        out += "\nEnemyBoss ENERGY: " + EnemyBoss.ENERGY;
        EnemyBoss.ENERGY = EnemyBoss.ENERGY - this.getDamage();
        out += "\nArqueiro " + this.getName() + " atacou o EnemyBoss com dano " + this.getDamage();
        out += "\nEnemyBoss ENERGY: " + EnemyBoss.ENERGY;
        out += "\n======================================";
        return out;
    }
}
