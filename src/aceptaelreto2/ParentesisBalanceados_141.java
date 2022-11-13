package aceptaelreto2;

import java.util.Scanner;

public class ParentesisBalanceados_141 {

    public static void main(String[] args) {//WA pero resultat OK

        Scanner lec = new Scanner(System.in);
        String cadena;
        while (lec.hasNextLine()) {
            cadena = lec.nextLine();
            if (cadena.length() <= 10000) {
                int contParentObert = 0;
                int contParentTancat = 0;
                int contCorchObert = 0;
                int contCorchTancat = 0;
                int contClauObert = 0;
                int contClauTancat = 0;
                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = cadena.charAt(i);
                    switch (caracter) {
                        case '(':
                            contParentObert++;
                            break;
                        case ')':
                            contParentTancat++;
                            break;
                        case '[':
                            contCorchObert++;
                            break;
                        case ']':
                            contCorchTancat++;
                            break;
                        case '{':
                            contClauObert++;
                            break;
                        case '}':
                            contClauTancat++;
                            break;
                    }
                }
                if (contParentObert == contParentTancat && contCorchObert == contCorchTancat
                        && contClauObert == contClauTancat) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                break;
            }
        }
    }
}
