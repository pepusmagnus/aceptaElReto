package aceptaelreto2;

import java.util.Scanner;

public class LosSaltosMario_158 {

    public static void main(String[] args) {//Accepted (AC
        Scanner lec = new Scanner(System.in);
        int numSalts, salt, saltAnterior;
        int casos = lec.nextInt();
        for (int i = 0; i < casos; i++) {
            numSalts = lec.nextInt();
            int contP = 0;
            int contN = 0;
            if (numSalts > 0 && numSalts <= 1000000000) {
                saltAnterior = lec.nextInt();
                for (int j = 1; j < numSalts; j++) {
                    salt = lec.nextInt();
                    if (salt > saltAnterior) {
                        contP++;
                    } else if (salt < saltAnterior) {
                        contN++;
                    }
                    saltAnterior = salt;
                }
                System.out.println(contP + " " + contN);
            } else {
                break;
            }
        }
    }
}
