package jogodavelha;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelhaPOO {
    private static String tabuleiro[][] = new String[3][3];
    private static int posicao;
    private static boolean doisJogadores = false;

    public static void JogoDaVelha() {
        System.out.println("Escolha a modalidade");
        System.out.println("1 - Dois Jogadores");
        System.out.println("2 - vs Maquina");
        Scanner input = new Scanner(System.in);
        System.out.print("Opção: ");
        int resposta = input.nextInt();
        switch(resposta) {
            case 1:
                doisJogadores = true;
                break;
            case 2:
                doisJogadores = false;
                break;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[0][0] = "1";
                tabuleiro[0][1] = "4";
                tabuleiro[0][2] = "7";
                tabuleiro[1][0] = "2";
                tabuleiro[1][1] = "5";
                tabuleiro[1][2] = "8";
                tabuleiro[2][0] = "3";
                tabuleiro[2][1] = "6";
                tabuleiro[2][2] = "9";
                    }
		}
	}

    public static void MontagemDoTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
    public static void DecisãoDoJogador() {
    Scanner input = new Scanner(System.in);
        System.out.println("Vez do jogador.");
        posicao = input.nextInt();
        if (posicao == 1) {
            tabuleiro[0][0] = "x";
        }
        if (posicao == 2 ) {
            tabuleiro[1][0] = "x";
        }
        
        if (posicao == 3) {
            tabuleiro[2][0] = "x";
        }
        if (posicao == 4) {
            tabuleiro[0][1] = "x";
        }
        if (posicao == 5 ) {
            tabuleiro[1][1] = "x";
        }
        if (posicao == 6 ) {
            tabuleiro[2][1] = "x";
        }
        if (posicao == 7 ) {
            tabuleiro[0][2] = "x";
        }
        if (posicao == 8 ) {
            tabuleiro[1][2] = "x";
        }
            if ((posicao == 9)) {
            tabuleiro[2][2] = "x";
        }
    }
    
    public static void JogadaDaMaquina() {
        Random random = new Random();
        int valorAleatorio = random.nextInt(2) + 0;
        if (doisJogadores == false) {
            if (tabuleiro[0][0] != "x" || tabuleiro[0][0] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
                
            } 
            if (tabuleiro[0][1] != "x" || tabuleiro[0][1] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
                
            }
            if (tabuleiro[0][2] != "x" || tabuleiro[0][2] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
               
            } 
            if (tabuleiro[1][0] != "x" || tabuleiro[1][0] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
               
            }
            if (tabuleiro[1][1] != "x" || tabuleiro[1][1] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
             
            }
            if (tabuleiro[1][2] != "x" || tabuleiro[1][2] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
               
            }
            if (tabuleiro[2][0] != "x" || tabuleiro[2][0] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
               
            } 
            if (tabuleiro[2][1] != "x" || tabuleiro[2][1] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
               
            }
            if (tabuleiro[2][2] != "x" || tabuleiro[2][2] != "X") {
                tabuleiro[valorAleatorio][valorAleatorio] = "o";
            }else {
              
            }
        }
        System.out.println("Maquina jogando...");
        
    }
    
    
    public static void main(String[] args) {
        int cont = 0;
        JogoDaVelha();
        while (cont <= 5) {
        MontagemDoTabuleiro();
        DecisãoDoJogador();
        JogadaDaMaquina();
        cont++;
        }
    }
}
