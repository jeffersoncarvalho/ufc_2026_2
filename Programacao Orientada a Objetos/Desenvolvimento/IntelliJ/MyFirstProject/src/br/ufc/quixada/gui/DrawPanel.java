package br.ufc.quixada.gui;

import javax.swing.*;
import java.awt.*;

//responsável em renderizar os sprites
public class DrawPanel extends JPanel {

    public DrawPanel(){
        //Dimension d = new Dimension(500,500);
        this.setPreferredSize(new Dimension(500,500)); //passando um objeto anônimo do tipo Dimension
        this.setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        //repassando para a super classe, o objeto g que será usado aqui
        super.paint(g);

        g.setColor(Color.RED);
        g.fillOval(250, 150, 20,20);

    }
}
