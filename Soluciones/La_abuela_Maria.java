package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class La_abuela_Maria {
    public static void main(String[] args) {
        int numCasos , num, suma = 0, i;
        int[] superiores = new int[6];
        Scanner leer = new Scanner(System.in);
        numCasos = leer.nextInt();
        boolean flag = true;

        while (numCasos--!=0){

            for (i = 0; i < 6; i++) {
                superiores[i] = leer.nextInt();
            }
            for (i = 0; i < 6; i++) {
                num = leer.nextInt();
                if (i == 0) {
                    suma = num + superiores[i];
                    flag = true;
                } else if (superiores[i] + num != suma) {
                    flag = false;

                }
            }

            if (flag)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}
