package aceptaelreto2;

import java.util.Scanner;

public class VotacionesCapicua_500 {

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);
        
        int desde, fins;
        
        while (true) {
            desde = lec.nextInt();
            fins = lec.nextInt();
            if (desde == 0 && fins == 0) {
                break;
            } else {
                int N, aux, cifra, inverso;
                int cont = 0;
                for (int i = desde; i <= fins; i++) {
                    inverso = 0;
                    aux = i;
                    while (aux != 0) {
                        cifra = aux % 10;
                        inverso = inverso * 10 + cifra;
                        aux = aux / 10;
                    }
                    if (i == inverso) {
                        cont++;
                    }
                }
                System.out.println(desde + " " + fins + " " + cont);
            }
        }
    }
}
