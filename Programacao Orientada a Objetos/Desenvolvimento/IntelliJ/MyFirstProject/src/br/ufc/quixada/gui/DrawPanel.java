package br.ufc.quixada.gui;

import br.ufc.quixada.rpg.GameBoard;

import javax.swing.*;
import java.awt.*;

//responsável em renderizar os sprites
public class DrawPanel extends JPanel {

    private GameBoard gameBoard; //o painel de desenho ele tem noção do tabuleiro do jogo

    public DrawPanel(GameBoard gameBoard){
        //Dimension d = new Dimension(500,500);
        this.setPreferredSize(new Dimension(500,500)); //passando um objeto anônimo do tipo Dimension
        this.setBackground(Color.WHITE);
        this.gameBoard = gameBoard;
    }

    @Override
    public void paint(Graphics g) {
        //repassando para a super classe, o objeto g que será usado aqui
        super.paint(g);

        g.setColor(Color.RED);
        g.fillOval(this.gameBoard.getKnight().getX(), this.gameBoard.getKnight().getY(), 20, 20);

    }
}
