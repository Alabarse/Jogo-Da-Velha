package jogodavelha;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    
    public static void main(String[] args) {
        Random random = new Random();
        int valorAleatorio = random.nextInt(9) ;
        System.out.println(valorAleatorio);
    }
    
}
