/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto2;

import java.util.Scanner;

/**
 *
 * @author pepus
 */
public class RadaresDeTramo_112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        int distanciaMetres, velocitatMax, segons;

        while (lec.hasNextInt()) {
            distanciaMetres = lec.nextInt();
            velocitatMax = lec.nextInt();
            segons = lec.nextInt();
            double velConstantKmH, velEntre20;
            if (distanciaMetres != 0 && velocitatMax != 0 && segons != 0 && distanciaMetres > 0 && velocitatMax > 0 && segons > 0) {
                if (distanciaMetres < 0 || velocitatMax < 0 || segons < 0) {
                    System.out.println("ERROR");
                } else {
                    velConstantKmH = (double) distanciaMetres / segons * 3.6;
                    velEntre20 = (double) ((velocitatMax * 20) / 100) + velocitatMax;
                    if (velConstantKmH <= velocitatMax) {
                        System.out.println("OK");
                    } else if (velConstantKmH >= velEntre20) {
                        System.out.println("PUNTOS");
                    } else if (velConstantKmH > velocitatMax && velConstantKmH < velEntre20) {
                        System.out.println("MULTA");
                    }
                }
            } else {
                break;
            }
        }
    }
}
