package aceptaelreto2;

import java.util.Scanner;

public class PersistenciaMultiNums_182 {//Accepted (AC)

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);
        int numCasos = lec.nextInt();
        int num;
        for (int i = 0; i < numCasos; i++) {
            num = lec.nextInt();
            if (num < 0 || num > Math.pow(2, 31)) {
                break;
            } else {
                String numString = String.valueOf(num);
                int cont = 0;
                int newNum = 1;
                while (numString.length() > 1) {
                    for (int j = 0; j < numString.length(); j++) {
                        char character = numString.charAt(j);
                        newNum *= Character.getNumericValue(character);
                    }
                    numString = String.valueOf(newNum);
                    newNum = 1;
                    cont++;
                }
                System.out.println(cont);
            }
        }
    }
}
