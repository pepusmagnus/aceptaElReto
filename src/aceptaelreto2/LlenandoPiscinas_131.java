/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto2;

import java.util.Scanner;

public class LlenandoPiscinas_131 {

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);
        int myPiscina, myBarreno, myPerdua, veiPiscina, veiBarreno, veiPerdua;
        while (true) {
            myPiscina = lec.nextInt();
            myBarreno = lec.nextInt();
            myPerdua = lec.nextInt();
            veiPiscina = lec.nextInt();
            veiBarreno = lec.nextInt();
            veiPerdua = lec.nextInt();
            if ((myPiscina != 0 || veiPiscina != 0) && (myPiscina >= 1 && myPiscina <= 1000000000)
                    && (myBarreno >= 1 && myBarreno <= 1000000000) && (myPerdua >= 1 && myPerdua <= 1000000000)
                    && (veiPiscina >= 1 && veiPiscina <= 1000000000) && (veiBarreno >= 1
                    && veiBarreno <= 1000000000) || (veiPerdua >= 1 && veiPerdua <= 1000000000)) {
                int myCont = 0;
                int myTravels = 0;
                int veiCont = 0;
                int veiTravels = 0;
                int myRest = myBarreno - myPerdua;
                int veiRest = veiBarreno - veiPerdua;
                if (myRest <= 0) {
                    myTravels = 1000000000;
                } else if (veiRest <= 0) {
                    veiTravels = 1000000000;
                } else {
                    while (myCont <= myPiscina) {
                        myCont += myRest;
                        myTravels++;
                    }
                    while (veiCont <= veiPiscina) {
                        veiCont += veiRest;
                        veiTravels++;
                    }
                }
                if (myTravels > veiTravels) {
                    System.out.println("VECINO " + veiTravels);
                } else if (myTravels < veiTravels) {
                    System.out.println("YO " + myTravels);
                } else {
                    System.out.println("EMPATE" + myTravels);
                }
            } else {
                break;
            }
        }
    }
}
