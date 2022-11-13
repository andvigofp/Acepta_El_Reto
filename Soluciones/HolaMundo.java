package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class HolaMundo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeros = leer.nextInt();
        for (int i=0; i < numeros; i++) {
            System.out.println("Hola mundo.");
        }
    }
}
