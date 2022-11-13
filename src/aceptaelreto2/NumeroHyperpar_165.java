package aceptaelreto2;

import java.util.Scanner;

public class NumeroHyperpar_165 {

    public static void main(String[] args) {//Accepted (AC)

        Scanner lec = new Scanner(System.in);
        int num;
        while (true) {
            num = lec.nextInt();
            if (num < 0 || num > 1000000000) {
                break;
            } else {
                boolean isHyperPar = true;
                String numString = String.valueOf(num);
                for (int i = 0; i < numString.length(); i++) {
                    char caracter = numString.charAt(i);
                    if (Character.getNumericValue(caracter) % 2 != 0) {
                        isHyperPar = false;
                        break;
                    }
                }
                if (isHyperPar) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
