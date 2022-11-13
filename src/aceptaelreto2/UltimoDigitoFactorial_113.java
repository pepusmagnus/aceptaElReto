package aceptaelreto2;

import java.util.Scanner;

public class UltimoDigitoFactorial_113 {

    public static void main(String[] args) {//WA pero resultat ok

        Scanner lec = new Scanner(System.in);
        int numCasos = lec.nextInt();
        int num;
        for (int i = 0; i < numCasos; i++) {
            num = lec.nextInt();
            if (num > 0) {
                int cont = 1;
                for (int j = 2; j <= num; j++) {
                    cont *= j;
                }
                System.out.println(cont % 10);
            } else {
                break;
            }
        }
    }
}
