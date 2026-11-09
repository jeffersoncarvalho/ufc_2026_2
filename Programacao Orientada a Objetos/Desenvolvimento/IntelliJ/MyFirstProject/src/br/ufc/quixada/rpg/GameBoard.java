package br.ufc.quixada.rpg;

import br.ufc.quixada.entities.Gold;

import java.util.ArrayList;

//tabuleiro do jogo
public class GameBoard {

    private Knight knight;
    private ArrayList<Gold> golds = new ArrayList<Gold>();

    public GameBoard() {
        this.knight = new Knight();
        this.knight.setX(100);
        this.knight.setY(100);
        this.generateGolds();
    }

    public ArrayList<Gold> getGolds() {
        return golds;
    }

    private void generateGolds() {
        int min = 20;
        int max = 480;
        for(int i =0; i<10; i++){
            int x = (int)(Math.random() * (max - min + 1)) + min;
            int y = (int)(Math.random() * (max - min + 1)) + min;
            Gold gold = new Gold();
            gold.setX(x);
            gold.setY(y);
            this.golds.add(gold);
        }
    }

    public Knight getKnight() {
        return knight;
    }


}
