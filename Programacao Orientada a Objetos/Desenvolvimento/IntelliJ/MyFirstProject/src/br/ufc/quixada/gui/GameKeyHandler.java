package br.ufc.quixada.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameKeyHandler extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_UP:
                System.out.println("CIMA");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("BAIXO");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("ESQUERDA");
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("DIREITA");
                break;
        }
    }
}
