package utilitario;

import java.util.Scanner;

public class Teclado {
    
    private static Scanner scanner = new Scanner(System.in);

    public Teclado() {
    }

    public static int lerInteiro(){
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public static String lerString(){
        return scanner.nextLine();
    }
    
    public static double lerDouble() {
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        return saldo;
    }
}
