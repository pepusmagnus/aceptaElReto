package aceptaelreto2;

import java.util.Scanner;

public class RebotandoParchis_407 {

    public static void main(String[] args) {//Accepted (AC)
        Scanner lec = new Scanner(System.in);
        int tauler, posicio, tirada;
        while (true) {
            tauler = lec.nextInt();
            posicio = lec.nextInt();
            tirada = lec.nextInt();
            boolean limitTrobat = true;
            if ((tirada == 0 && posicio == 0 && tirada == 0)
                    || (posicio < 1 && tirada < 1 && posicio > tauler
                    && posicio > tauler && tauler > 10000)) {
                break;
            } else {
                if (posicio + tirada > tauler) {
                    System.out.println(tauler - (posicio + tirada - tauler));
                } else {
                    System.out.println(posicio + tirada);
                }
            }
        }
    }
}
