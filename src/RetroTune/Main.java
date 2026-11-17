package RetroTune;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("       RETROTUNE");
            System.out.println("     AFINADOR DE VIOLAO");
            System.out.println("==============================");

            System.out.println("1 - Corda Mi (E2)");
            System.out.println("2 - Corda La (A2)");
            System.out.println("3 - Corda Re (D3)");
            System.out.println("4 - Corda Sol (G3)");
            System.out.println("5 - Corda Si (B3)");
            System.out.println("6 - Corda Mi (E4)");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma corda: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Mi (E2): 82.41 Hz");
                    break;

                case 2:
                    System.out.println("La (A2): 110.00 Hz");
                    break;

                case 3:
                    System.out.println("Re (D3): 146.83 Hz");
                    break;

                case 4:
                    System.out.println("Sol (G3): 196.00 Hz");
                    break;

                case 5:
                    System.out.println("Si (B3): 246.94 Hz");
                    break;

                case 6:
                    System.out.println("Mi (E4): 329.63 Hz");
                    break;

                case 0:
                    System.out.println("Encerrando RetroTune...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 0);

        teclado.close();

    }
}