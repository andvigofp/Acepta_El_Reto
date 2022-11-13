package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Cuadro_con_cerillas {
    public static void main(String[] args) {
        int numCasos, h, v;
        Scanner leer = new Scanner(System.in);
        numCasos = leer.nextInt();

        while (numCasos--!=0) {
            h = leer.nextInt();
            v = leer.nextInt();
            System.out.println(v*(h+1) + h *(v+1));
        }
        leer.close();
    }
}
