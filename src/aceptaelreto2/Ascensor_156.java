package aceptaelreto2;

import java.util.Scanner;

public class Ascensor_156 {

    public static void main(String[] args) {//Run-time error (RTE), result bé
        Scanner lec = new Scanner(System.in);
        int numPis, pis, pisAnterior;
        while (true) {
            numPis = lec.nextInt();
            int cont = 0;
            if (numPis != -1) {
                pisAnterior = numPis;
                while (true) {
                    pis = lec.nextInt();
                    if (pis != -1) {
                        int resta = (pisAnterior - pis);
                        if (resta < 0) {
                            resta *= -1;
                        }
                        cont += resta;
                        pisAnterior = pis;
                    } else {
                        break;
                    }
                }
                System.out.println(cont);
            } else {
                break;
            }
        }
    }
}
