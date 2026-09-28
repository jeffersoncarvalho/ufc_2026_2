package br.ufc.quixada.rpg;

public class Knight extends Character{

    private int x;
    private int y;

    public Knight() {
        this.setDamage(25);
        this.x = 250;
        this.y = 250;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
