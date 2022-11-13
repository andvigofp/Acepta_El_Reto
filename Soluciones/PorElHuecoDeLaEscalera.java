package Aceptaelreto;


import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */


public class PorElHuecoDeLaEscalera {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int casos = leer.nextInt();

        while (casos--!=0) {
            int pisos = leer.nextInt();
            int escalerasPisos = leer.nextInt();
            int pisosBajos = leer.nextInt();
            int extraPisos = leer.nextInt();
            int bajada = pisosBajos * escalerasPisos + extraPisos;
            int subida = bajada + (pisos * escalerasPisos);
            System.out.println(bajada + " " + subida);

        }
    }

}
