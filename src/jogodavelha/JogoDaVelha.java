package jogodavelha;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelhaPOO {
    private static String tabuleiro[][] = new String[3][3];
    private static int posicao;
    private static boolean doisJogadores = false;
    private static boolean vitoria = false;
    private static boolean vitoriaP2 = false;

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
        System.out.println("----------");
    }
    
    public static void DecisãoDoJogador() {
    Scanner input = new Scanner(System.in);
        System.out.println("Vez do jogador.");
        posicao = input.nextInt();
        if (tabuleiro[0][0] != "o") {
            if (posicao == 1) {
                tabuleiro[0][0] = "x";
           }else if (tabuleiro[0][0].equalsIgnoreCase("o")) {
                System.out.println("Não pode jogar ai !");
                input.next();
        }
            }
        
        if (tabuleiro[1][0] != "o") {
            if (posicao == 2 ) {
                tabuleiro[1][0] = "x";
            }else if (tabuleiro[1][0] == "o"){
                System.out.println("Não pode jogar ai !");
                input.next();
            }
        }
        
        if (tabuleiro[2][0] != "o") {
            if (posicao == 3) {
                tabuleiro[2][0] = "x";
            }else if (tabuleiro[2][0] == "o"){
                System.out.println("Não pode jogar ai !");
                input.next();
            }
        }
        
        if (tabuleiro[0][1] != "o") {
            if (posicao == 4) {
                tabuleiro[0][1] = "x";
            }else if (tabuleiro[0][1] == "o") {
                System.out.println("Não pode jogar ai !");
                input.next();
            }
        }
        
        if (tabuleiro[1][1] != "o") {
            if (posicao == 5 ) {
                tabuleiro[1][1] = "x";
            }else if (tabuleiro[1][1] == "o"){
                System.out.println("Não pode jogar ai !");
                input.next();
            }
        }
        
        if (tabuleiro[2][1] != "o") {
            if (posicao == 6 ) {
                tabuleiro[2][1] = "x";
            }else if (tabuleiro[2][1] == "o"){
                System.out.println("Não pode jogar ai !");
                input.next();
            } 
        }
        
        if (tabuleiro[0][2] != "o") {
            if (posicao == 7 ) {
                tabuleiro[0][2] = "x";
            }else if (tabuleiro[0][2] == "o"){
                    System.out.println("Não pode jogar ai !");
                    input.next();
            }
                }
        
        
        if (tabuleiro[1][2] != "o") {
            if (posicao == 8 ) {
                tabuleiro[1][2] = "x";
            }else if (tabuleiro[1][2] == "o"){
                System.out.println("Não pode jogar ai !");
                input.next();
            }
        }
        
        
        if (tabuleiro[2][2] != "o") {
            if ((posicao == 9)) {
                tabuleiro[2][2] = "x";
            }else if (tabuleiro[2][2] == "o"){
            System.out.println("Não pode jogar ai !");
            input.next();
        }
        }
        
    }
    
    public static void JogadaDaMaquina() {
        Random random = new Random();
        int valorAleatorio = random.nextInt(9) + 0;
        if (doisJogadores == false) {
            if (valorAleatorio == 0) {
                if (tabuleiro[0][0] != "x" && tabuleiro[0][0] != "o") {
                    tabuleiro[0][0] = "o";
                }else {
                    JogadaDaMaquina();
                }
            }
                
            if (valorAleatorio == 1) {
                if (tabuleiro[1][0] != "x" && tabuleiro[1][0] != "o") {
                    tabuleiro[1][0] = "o";
                }else {
                    JogadaDaMaquina();
                }        
            }
            
            if (valorAleatorio == 2) {
                if (tabuleiro[2][0] != "x" && tabuleiro[2][0] != "o") {
                    tabuleiro[2][0] = "o";
                }else {
                    JogadaDaMaquina();
                }   
            }
            
            if (valorAleatorio == 3) {
                if (tabuleiro[0][1] != "x" && tabuleiro[0][1] != "o") {
                    tabuleiro[0][1] = "o";
                }else {
                    JogadaDaMaquina();
                }   
            }
            
            if (valorAleatorio == 4) {
                if (tabuleiro[1][1] != "x" && tabuleiro[1][1] != "o") {
                    tabuleiro[1][1] = "o";
                }else {
                    JogadaDaMaquina();
                }   
            }
            
            if (valorAleatorio == 5) {
                if (tabuleiro[2][1] != "x" && tabuleiro[2][1] != "o") {
                    tabuleiro[2][1] = "o";
                }else {
                    JogadaDaMaquina();
                }   
            }
            
            if (valorAleatorio == 6) {
                if (tabuleiro[0][2] != "x" && tabuleiro[0][2] != "o") {
                    tabuleiro[0][2] = "o";
                }else {
                    JogadaDaMaquina();
                }   
            }
            
            if (valorAleatorio == 7) {
                if (tabuleiro[1][2] != "x" && tabuleiro[1][2] != "o") {
                    tabuleiro[1][2] = "o";
                }else {
                    JogadaDaMaquina();
                }   
            }
            
            if (valorAleatorio == 8) {
                if (tabuleiro[2][2] != "x" && tabuleiro[2][2] != "o") {
                    tabuleiro[2][2] = "o";
                }else {
                    JogadaDaMaquina();
                }   
            }
            
                System.out.println("Maquina jogando...");
            }
        }
    
    
    public static void CondicaoDeVitoria() {
        if (tabuleiro[0][0].equals("x") && tabuleiro[1][0].equals("x") && tabuleiro[2][0].equals("x")) {
            System.out.println("Jogador 1 Vencedor!"); 
            vitoria = true;
        }else if (tabuleiro[0][1].equals("x") && tabuleiro[1][1].equals("x") && tabuleiro[2][1].equals("x")) {
            System.out.println("Jogador 1 Vencedor");
            vitoria = true;
        }else if (tabuleiro[0][2].equals("x") && tabuleiro[1][2].equals("x") && tabuleiro[2][2].equals("x")) {
            System.out.println("Jogador 1 Vencedor");
            vitoria = true;
        }else if (tabuleiro[0][0].equals("x") && tabuleiro[0][1].equals("x") && tabuleiro[0][2].equals("x")) {
            System.out.println("Jogador 1 Vencedor");
            vitoria = true;
        }else if (tabuleiro[1][0].equals("x") && tabuleiro[1][1].equals("x") && tabuleiro[1][2].equals("x")) {
            System.out.println("Jogador 1 Vencedor");
            vitoria = true;
        }else if (tabuleiro[2][0].equals("x") && tabuleiro[2][1].equals("x") && tabuleiro[2][2].equals("x")) {
            System.out.println("Jogador 1 Vencedor");
            vitoria = true;
        }else if (tabuleiro[0][0].equals("x") && tabuleiro[1][1].equals("x") && tabuleiro[2][2].equals("x")) {
            System.out.println("Jogador 1 Vencedor");
            vitoria = true;
        }else if (tabuleiro[0][2].equals("x") && tabuleiro[1][1].equals("x") && tabuleiro[2][0].equals("x")) {
            System.out.println("Jogador 1 Vencedor");
            vitoria = true;
        }
    }
    
    public static void CondicaoDeVitoriaP2() {
        if (tabuleiro[0][0].equals("o") && tabuleiro[1][0].equals("o") && tabuleiro[2][0].equals("x")) {
            System.out.println("Jogador 2 Vencedor!"); 
            vitoriaP2 = true;
        }else if (tabuleiro[0][1].equals("o") && tabuleiro[1][1].equals("o") && tabuleiro[2][1].equals("x")) {
            System.out.println("Jogador 2 Vencedor");
            vitoriaP2 = true;
        }else if (tabuleiro[0][2].equals("o") && tabuleiro[1][2].equals("o") && tabuleiro[2][2].equals("x")) {
            System.out.println("Jogador 2 Vencedor");
            vitoriaP2 = true;
        }else if (tabuleiro[0][0].equals("o") && tabuleiro[0][1].equals("o") && tabuleiro[0][2].equals("x")) {
            System.out.println("Jogador 2 Vencedor");
            vitoriaP2 = true;
        }else if (tabuleiro[1][0].equals("o") && tabuleiro[1][1].equals("o") && tabuleiro[1][2].equals("x")) {
            System.out.println("Jogador 2 Vencedor");
            vitoriaP2 = true;
        }else if (tabuleiro[2][0].equals("o") && tabuleiro[2][1].equals("o") && tabuleiro[2][2].equals("x")) {
            System.out.println("Jogador 2 Vencedor");
            vitoriaP2 = true;
        }else if (tabuleiro[0][0].equals("o") && tabuleiro[1][1].equals("o") && tabuleiro[2][2].equals("x")) {
            System.out.println("Jogador 2 Vencedor");
            vitoriaP2 = true;
        }else if (tabuleiro[0][2].equals("o") && tabuleiro[1][1].equals("o") && tabuleiro[2][0].equals("x")) {
            System.out.println("Jogador 2 Vencedor");
            vitoriaP2 = true;
        }
    }
    
    
    public static void main(String[] args) {
        int cont = 0;
        JogoDaVelha();
        while (cont <= 5) {
        CondicaoDeVitoria();
        CondicaoDeVitoriaP2();
        if (vitoria == true && vitoriaP2 == false) {
            MontagemDoTabuleiro();
            break;
        }
        if (vitoriaP2 == true && vitoria == false) {
            MontagemDoTabuleiro();
            break;
        }
        MontagemDoTabuleiro();
        DecisãoDoJogador();
        JogadaDaMaquina();
        cont++;
        }
        if (vitoriaP2 && vitoria == false) {
            System.out.println("Deu velha");
        }
    }
}
