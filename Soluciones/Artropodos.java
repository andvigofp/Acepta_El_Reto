package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Artropodos {
    public static void main(String[] args) {
        int numCasos, num6, num8, num10, numBichos, num2;
        Scanner leer = new Scanner(System.in);
        numCasos = leer.nextInt();

        for (long i =0; numCasos > 0; numCasos--){
        num6 = leer.nextInt();
        num8 = leer.nextInt();
        num10 = leer.nextInt();
        numBichos = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println(6*num6+ 8* num8+ 10 * num10 + 2 * num2 * numBichos);
        }


    }
}
