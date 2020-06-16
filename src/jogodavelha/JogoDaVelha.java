package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tabuleiro[][] = new String [3][3];
        // Mostrando posições para o usuario
        tabuleiro[0][0] = "0,0";
        tabuleiro[0][1] = "0,1";
        tabuleiro[0][2] = "0,2";
        
        tabuleiro[1][0] = "1,0";
        tabuleiro[1][1] = "1,1";
        tabuleiro[1][2] = "1,2";
        
        tabuleiro[2][0] = "2,0";
        tabuleiro[2][0] = "2,1";
        tabuleiro[2][0] = "2,2";
        
        // Montando o tabuleiro e colhendo as posições dadas pelo jogador
        for(int k = 0; k < 6; k++) {            
            for(int i = 0; i < tabuleiro.length; i++) {
                for (int j=0; i < tabuleiro[i].length; j++) {
                    System.out.println(tabuleiro[i][j] + "|" + tabuleiro[i][j]);
                    System.out.println("Digite a posição desejada");    
                    int posição1 = input.nextInt();
                    int posição2 = input.nextInt();
                    System.out.println("X ou O?");
                    tabuleiro[posição1][posição2] = input.next();
                    System.out.println(tabuleiro[i][j] + "");
                }
            
            }
        }
            
    }
    
}
