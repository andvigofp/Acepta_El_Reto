package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class EnQueVolumen {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        for (int i = leer.nextInt(); i > 0; i--) {
            System.out.println(leer.nextInt()/100);
        }
    }
}
