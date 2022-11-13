package aceptaelreto2;

import java.util.Scanner;

public class Triangulos_180 {//Accepted (AC)

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);
        int numCasos, a, b, c;
        numCasos = lec.nextInt();
        for (int i = 0; i < numCasos; i++) {
            a = lec.nextInt();
            b = lec.nextInt();
            c = lec.nextInt();
            if (a < 0 || a > Math.pow(2, 15) - 1 || b < 0 || b > Math.pow(2, 15) - 1 || b < 0
                    || b > Math.pow(2, 15) - 1) {
                break;
            } else {
                if (a + b > c && a + c > b && b + c > a) {
                    if (a >= b && a >= c) {
                        if (Math.pow(a, 2) < (Math.pow(c, 2) + Math.pow(b, 2))) {
                            System.out.println("ACUTANGULO");
                        } else if (Math.pow(a, 2) == (Math.pow(c, 2) + Math.pow(b, 2))) {
                            System.out.println("RECTANGULO");
                        } else if (Math.pow(a, 2) > (Math.pow(c, 2) + Math.pow(b, 2))) {
                            System.out.println("OBTUSANGULO");
                        }
                    } else if (b >= a && b >= c) {
                        if (Math.pow(b, 2) < (Math.pow(c, 2) + Math.pow(a, 2))) {
                            System.out.println("ACUTANGULO");
                        } else if (Math.pow(b, 2) == (Math.pow(c, 2) + Math.pow(a, 2))) {
                            System.out.println("RECTANGULO");
                        } else if (Math.pow(b, 2) > (Math.pow(c, 2) + Math.pow(a, 2))) {
                            System.out.println("OBTUSANGULO");
                        }
                    } else if (c >= b && c >= a) {
                        if (Math.pow(c, 2) < (Math.pow(a, 2) + Math.pow(b, 2))) {
                            System.out.println("ACUTANGULO");
                        } else if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
                            System.out.println("RECTANGULO");
                        } else if (Math.pow(c, 2) > (Math.pow(a, 2) + Math.pow(b, 2))) {
                            System.out.println("OBTUSANGULO");
                        }
                    }
                } else {
                    System.out.println("IMPOSIBLE");
                }
            }
        }
    }
}
