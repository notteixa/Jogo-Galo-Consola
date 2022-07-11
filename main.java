package jogo;

import java.util.Scanner;

public class JOGO {

    public static void main(String[] args) {

        int escolha = 0;
        escolha = Menu();
        Scanner entrada = new Scanner(System.in);
        Players VsP = new Players();
        Bot VsB = new Bot();

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                VsP.VsPlayer();
                break;

            case 2:
                 VsB.VsBot();

                 break;

            default:
                System.out.println("Opção inválida.");

        }
    }

    private static int Menu() {

        int escolha = 0;

        System.out.println("1-Jogador vs Jogador");
        System.out.println("2-Jogador vs Computador");
        System.out.println("3-Sair");

        return escolha;

    }

}
