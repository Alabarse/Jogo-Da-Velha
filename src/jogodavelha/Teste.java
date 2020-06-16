package jogodavelha;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        int posição = 0;
        int posição2 = 0;
        String xOUo;
        String tabuleiro[][] = new String [3][3];
        tabuleiro[0][0] = "0,0";
        tabuleiro[0][1] = "0,1";
        tabuleiro[0][2] = "0,2";
        
        tabuleiro[1][0] = "1,0";
        tabuleiro[1][1] = "1,1";
        tabuleiro[1][2] = "1,2";
        
        tabuleiro[2][0] = "2,0";
        tabuleiro[2][1] = "2,1";
        tabuleiro[2][2] = "2,2";
        while (cont <= 6) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println();
            }
                System.out.println("Digite a posição que quer jogar; ");
                posição = input.nextInt();
                posição2 = input.nextInt();
                tabuleiro[posição][posição2] = "x";
        }
      }
    }

