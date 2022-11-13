/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto2;

import java.util.Scanner;

public class SumaDeDigitos_140 {

    public static void main(String[] args) {//Accepted (AC)

        Scanner lec = new Scanner(System.in);
        int num;
        while (true) {
            num = lec.nextInt();
            if (num < 0 || num > 1000000000) {
                break;
            } else {
                String numString = String.valueOf(num);
                String nouString = "";
                int cont = 0;
                for (int i = 0; i < numString.length(); i++) {
                    if (i == numString.length() - 1) {
                        nouString += numString.charAt(i) + " = ";
                        cont += Character.getNumericValue(numString.charAt(i));
                    } else {
                        nouString += numString.charAt(i) + " + ";
                        cont += Character.getNumericValue(numString.charAt(i));
                    }
                }

                System.out.println(nouString + cont);
            }
        }
    }

}
