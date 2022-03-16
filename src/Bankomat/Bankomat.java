
package Bankomat;

import java.util.Scanner;

public class Bankomat {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");

            System.out.println("Was möchtest du tun:");


            int Kontostand = 0;

            boolean isTrue = true;


            while (isTrue) {
                int selection = sc.nextInt();

                if(selection == 1) {
                    System.out.println("Wie viel möchten sie einzahlen:");
                    selection = sc.nextInt();
                    Kontostand += selection;
                    System.out.println("Sie haben " + selection + " € eingezahlt");

                }else if(selection == 2) {
                    System.out.println("Wie viel möchten sie abheben:");
                    selection = sc.nextInt();

                    if(Kontostand>=selection) {
                        Kontostand -= selection;
                        System.out.println("Sie haben " + selection + " € abgehoben");
                    }else {
                        System.out.println("Zu wenig Geld");
                    }


                }else if(selection == 3) {
                    System.out.println("Ihr Kontostand: " + Kontostand + " €");


                }else if(selection == 4) {
                    System.out.println("BEENDET");
                    isTrue = false;
                }

            }





        }


}
