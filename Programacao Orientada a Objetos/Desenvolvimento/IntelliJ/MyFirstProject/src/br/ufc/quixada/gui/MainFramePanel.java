package br.ufc.quixada.gui;

import br.ufc.quixada.rpg.GameBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFramePanel extends JFrame {

    private DrawPanel drawPanel; //declaração de variável
    private GameBoard gameBoard; //declaração do tabuleiro

    public MainFramePanel(){
        //estou chamando o construtor da minha super classe direta!
        //eu só posso invocar o super() dentro do meu construtor!
        super("Projeto Game Versão 0.1");
        Container container = this.getContentPane(); //inicializando o organizador de sub janelas
        container.setLayout(new BorderLayout()); //política de organização do elementos no container

        //inserindo as subjanelas
        this.gameBoard = new GameBoard(); //alocando memória para um GameBoard
        this.drawPanel = new DrawPanel(this.gameBoard); //criando o objeto
        container.add(this.drawPanel, BorderLayout.CENTER);

        //evento do teclado
        this.addKeyListener(new GameKeyHandler(this.gameBoard, this.drawPanel));


        //configurações finais da janela principal
        this.setVisible(true); //mostra a janela principal
        this.setResizable(false); //impede que a janela seja maximizada
        this.pack(); //comprime os espaços entre as subjanelas

        //evento de finalizar uma janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );*/

    }
}
