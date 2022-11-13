package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class OtraPagina {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont, num;

        cont = leer.nextInt();

        while (cont-- !=0) {
            num = leer.nextInt();
            System.out.println(num %2 == 0 ? num + 1 : num -1);
        }
    }
}
