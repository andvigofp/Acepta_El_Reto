package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Cocinando_huevos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int huevos, capacidad, coccion;
        do {
            huevos = leer.nextInt();
            capacidad = leer.nextInt();
            coccion = 10;

            if (huevos <= capacidad && huevos !=0 && capacidad !=0) {
                System.out.println(coccion);
            }else if (huevos !=0 && capacidad !=0) {
                do {
                    if(huevos > capacidad) {
                        huevos -=capacidad;
                        coccion +=10;
                    }

                }while(huevos > capacidad);
                System.out.println(coccion);
            }

        }while(huevos !=0 && capacidad!=0);
        }


            }



