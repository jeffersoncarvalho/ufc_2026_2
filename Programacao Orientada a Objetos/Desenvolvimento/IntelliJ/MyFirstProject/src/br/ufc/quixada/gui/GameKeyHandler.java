package br.ufc.quixada.gui;

import br.ufc.quixada.rpg.GameBoard;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameKeyHandler extends KeyAdapter {

    private GameBoard gameBoard;
    private DrawPanel drawPanel;

    public GameKeyHandler(GameBoard gameBoard, DrawPanel drawPanel){
        this.gameBoard = gameBoard;
        this.drawPanel = drawPanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_UP:
                System.out.println("CIMA");
                this.gameBoard.getKnight().setY( this.gameBoard.getKnight().getY() - 5 );
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("BAIXO");
                this.gameBoard.getKnight().setY( this.gameBoard.getKnight().getY() + 5 );
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("ESQUERDA");
                this.gameBoard.getKnight().setX( this.gameBoard.getKnight().getX() - 5 );
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("DIREITA");
                this.gameBoard.getKnight().setX( this.gameBoard.getKnight().getX() + 5 );
                break;
        }//switch

        //avise ao painel de desenho para se redesenhar (repaint)
        this.drawPanel.repaint();
    }//keypressed
}//classe KeyHandler
