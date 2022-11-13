package Aceptaelreto;


import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Ajedrez_asistido_por_computador {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int fila, columna;
        fila = leer.nextInt();
        columna = leer.nextInt();;
        while (fila !=0 && columna !=0) {
            char filaletra= (char) ('i' - fila);
            System.out.println(filaletra+ "" +columna);
            fila = leer.nextInt();
            columna = leer.nextInt();
        }
    }
}






