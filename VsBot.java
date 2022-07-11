package jogo;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

public class Bot extends Players {

    public void VsBot() {

        Scanner ler = new Scanner(System.in);

        JV galo = new JV();
        String posicoes;
        int validar = 0, Jogar = 0;

        System.out.println("Jogo Do Galo");
        galo.Mostrar();
        while (true) {

            do {
                System.out.println("Jogador 1, qual a posicao que quer jogar? ");
                posicoes = ler.next();

                while (!galo.Verificar(posicoes)) {

                    System.out.println("Jogada Inválida, tente novamente!");
                    System.out.println("Jogador 1, informe uma posição: ");
                    posicoes = ler.next();

                    validar = 0;

                }

                galo.joga(posicoes, "X");
                validar = 1;

            } while (validar == 0);

            Jogar++;
            validar = 0;
            galo.Mostrar();

            if (!galo.vencer(Jogar).equals("null")) {
                break;

            }
            Random rand = new Random();
            int random = 0;
            do {
                System.out.println("Jogador 2, qual a posicao que quer jogar? ");
                random = rand.nextInt(9);
                posicoes = String.valueOf(random);

                while (!galo.Verificar(posicoes)) {

                    System.out.println("Jogada Inválida, tente novamente!");
                    System.out.println("Jogador 2, informe uma posição: ");
                    random = rand.nextInt(9);
                    posicoes = String.valueOf(random);

                    validar = 0;

                }

                galo.joga(posicoes, "O");
                validar = 1;

            } while (validar == 0);

            Jogar++;
            validar = 0;
            galo.Mostrar();

            if (!galo.vencer(Jogar).equals("null")) {
                break;

            }
        }

        System.out.println("O " + galo.vencer(Jogar) + " venceu ");

    }

}
