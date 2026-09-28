package br.ufc.quixada.rpg;

//tabuleiro do jogo
public class GameBoard {

    private Knight knight;

    public Knight getKnight() {
        return knight;
    }

    public GameBoard() {
        this.knight = new Knight();
    }
}
