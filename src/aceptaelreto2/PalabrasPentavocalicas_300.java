package aceptaelreto2;

import java.util.Scanner;

public class PalabrasPentavocalicas_300 {

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);
        String paraula;
        int numCasos = lec.nextInt();
        for (int i = 0; i < numCasos; i++) {
            paraula = lec.next();
            if (paraula.length() >= 30) {
                break;
            } else {
                if (paraula.contains("a") && paraula.contains("e") && paraula.contains("i")
                        && paraula.contains("o") && paraula.contains("u")) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
