
package ErsteBeispiele.Bankomat;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        System.out.println("Was möchtest du tun:");


        int bankBalance = 0;
        String choice;

        boolean isTrue = true;


        while (isTrue) {
            int selection = sc.nextInt();

            if (selection == 1) {
                System.out.println("Wie viel möchten sie einzahlen:");
                selection = sc.nextInt();
                bankBalance += selection;
                System.out.println("Sie haben " + selection + " € eingezahlt");

            } else if (selection == 2) {
                System.out.println("Wie viel möchten sie abheben:");
                selection = sc.nextInt();

                if (bankBalance >= selection) {
                    bankBalance -= selection;
                    System.out.println("Sie haben " + selection + " € abgehoben");
                } else {
                    System.out.println("Zu wenig Geld");
                    System.out.println("Möchten sie ihr Konto überziehen? Y = Yes   N = No");

                    choice = sc.next();

                    if (choice.equals("Y")) {
                        bankBalance -= selection;
                        System.out.println("Sie haben " + selection + " abgehoben");
                    }

                }


            } else if (selection == 3) {
                System.out.println("Ihr Kontostand: " + bankBalance + " €");


            } else if (selection == 4) {
                System.out.println("BEENDET");
                isTrue = false;
            }

        }


    }


}
