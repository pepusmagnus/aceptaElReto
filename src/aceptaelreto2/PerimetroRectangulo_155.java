package aceptaelreto2;

import java.util.Scanner;

public class PerimetroRectangulo_155 {//Accepted (AC)

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int base, altura;
        while (true) {
            base = lec.nextInt();
            altura = lec.nextInt();
            if (base < 0 || altura < 0 || base > 100000000 || altura > 100000000) {
                break;
            } else {
                long resultat = (base * 2) + (altura * 2);
                System.out.println(resultat);
            }
        }
    }
}
