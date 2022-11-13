package aceptaelreto2;

import java.util.Scanner;

public class SalvadosPorEl9_572 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        double nota;
        int numCasos = lec.nextInt();
        for (int i = 0; i < numCasos; i++) {
            boolean zeroTrobat = false;
            boolean nouTrobat = false;
            for (int j = 0; j < 5; j++) {
                nota = lec.nextDouble();
                if (nota < 0.0 || nota > 10.0) {
                    break;
                } else {
                    if (nota == 0.0) {
                        zeroTrobat = true;
                    } else if (nota >= 9.0) {
                        nouTrobat = true;
                    }
                }
            }
            if (zeroTrobat && nouTrobat) {
                System.out.println("MEDIA");
            } else if (zeroTrobat) {
                System.out.println("SUSPENSO DIRECTO");
            } else {
                System.out.println("MEDIA");
            }
        }
    }
}
