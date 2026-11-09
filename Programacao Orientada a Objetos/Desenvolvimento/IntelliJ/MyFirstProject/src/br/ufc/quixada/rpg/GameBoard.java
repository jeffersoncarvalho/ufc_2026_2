package br.ufc.quixada.rpg;

import br.ufc.quixada.entities.Gold;
import br.ufc.quixada.gui.HUDPanel;

import java.util.ArrayList;

//tabuleiro do jogo
public class GameBoard {

    private Knight knight;
    private ArrayList<Gold> golds = new ArrayList<Gold>();
    private HUDPanel hudPanelReference;

    public GameBoard() {
        this.knight = new Knight();
        this.knight.setX(100);
        this.knight.setY(100);
        this.generateGolds();
    }

    public void setHudPanelReference(HUDPanel hudPanelReference) {
        this.hudPanelReference = hudPanelReference;
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

    private int distance(int x1, int x2, int y1, int y2){
        int d = (int) Math.sqrt(
                (x1 - x2)*(x1 - x2)+(y1 - y2)*(y1 - y2)
        );
        return d;
    }

    public void calculateGoldCollision(){
        int positionToRemove = -1;
        int i = 0;
        for(Gold ouro:this.getGolds()){
            int d = distance(ouro.getX(), knight.getX(),
                             ouro.getY(), knight.getY());
            if( d <= 10){
                //System.out.println("COLISÃO");
                positionToRemove = i;
                this.hudPanelReference.addPoint();
                break;

            }
            i++;
        }

        if(positionToRemove >=0){
            this.getGolds().remove(positionToRemove);
        }
    }

}
