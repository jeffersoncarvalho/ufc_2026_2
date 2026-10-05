package br.ufc.qx.jokenpo;

import java.util.Scanner;
import java.util.Enumeration;
public class Exec {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;
        // logica simples de vencedor ou ganhador looping
        while (continuar) {
            System.out.println(" Digite 0 - Papel");
            System.out.println(" Digite 1 - Pedra");
            System.out.println(" Digite 2 - Tesoura");


            System.out.println("Jogador 1 escolha sua jogada");

            int j1 = entrada.nextInt();

            System.out.println("Jogador 2 escolha sua jogada");
            int j2 = entrada.nextInt();

            if (j1 < 0 || j1 > 2 || j2 < 0 || j1 > 2) {
                System.out.println("Jogada inválida!");
                entrada.close();
                return;
            }

            if (j1 == j2) {
                System.out.println("Empate.");
            } else if ((j1 == 0 && j2 == 1) || (j1 == 1 && j2 == 2) || (j1 == 2 && j2 == 0)) {
                System.out.println("Jogador 1 venceu.");
            } else {
                System.out.println("Jogador 2 venceu.");
            }


            System.out.println("Digite [1] - Jogar Novamente | [2] Pra Sair");
            while (true) {
            int n = entrada.nextInt();
                if (n == 2) {
                    continuar = false;
                    break;
                } else if (n != 1 && n != 2) {
                    System.out.println("Comando Invalido");
                    System.out.println("Digite novamente");

                } else if (n == 1) {
                    break;
                }
            }
        }
    }
    
}
