package br.ufc.quixada.gui;

import javax.swing.*;
import java.awt.*;

public class HUDPanel extends JPanel {

    private int points;
    private JLabel pointsLabel = new JLabel("0");

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoint(){
        this.points = this.points + 1;
        this.pointsLabel.setText(""+this.points);
        //System.out.println(this.points);
    }

    public HUDPanel(){
        this.setLayout(new FlowLayout());
        this.add(new JLabel("PONTOS: "));
        this.add(this.pointsLabel);
        this.add(new JLabel("LIFE: "));
        this.add(new JLabel("3"));
        this.add(new JLabel("VIDAS: "));
        this.add(new JLabel("3"));

    }
}
