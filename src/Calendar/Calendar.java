
package Calendar;

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        System.out.println("Press 1 to create a calendar");
        int sc = scannerInput();
        while (sc ==1){
            System.out.println("Welchen Monat willst du darstellen (1 für Jänner, 2 für Februar, 3 für März, ...");
            int month = scannerInput();

            System.out.println("An welchem tag soll der Monat starten (1 für Montag, 2 für Dienstag, 3 für Mittwoch, ...");
            int startingOfMonth = scannerInput()-1;

            if (month >0 && month <13 && startingOfMonth >= 0 && startingOfMonth < 7){
                createCalendar(month, startingOfMonth);
            }else{
                System.out.println("You picked a wrong number");
            }

            System.out.println("");
            System.out.println("Press 3 to continue, Press 4 to end");

            int sc2 = scannerInput();

            if (sc2 == 4){
                sc =2;
            }
        }
    }

    public static int scannerInput(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    public static void createCalendar(int month, int startingOfMonth){

        String[] Days = {"MO", "DI", "MI", "DO", "FR", "SA", "SO"};

        int amountOfDays = 0;

        switch (month){
            case 1: amountOfDays = 31; break;
            case 2: amountOfDays = 28; break;
            case 3: amountOfDays = 31; break;
            case 4: amountOfDays = 30; break;
            case 5: amountOfDays = 31; break;
            case 6: amountOfDays = 30; break;
            case 7: amountOfDays = 31; break;
            case 8: amountOfDays = 31; break;
            case 9: amountOfDays = 30; break;
            case 10: amountOfDays = 31; break;
            case 11: amountOfDays = 30; break;
            case 12: amountOfDays = 31; break;
        }

        System.out.println(amountOfDays);

        int temporary = 0;

        while (temporary <7) {
            if (temporary == 0){
                System.out.print("| ");
            } else{
                System.out.print(" | ");
            }
            System.out.print(Days[temporary]);
            temporary+=1;

            if (temporary == 7){
                System.out.println(" |");
            }
        }
        temporary = 0;

        while (temporary < amountOfDays + startingOfMonth + 7 - (amountOfDays + startingOfMonth)%7) {
            if (temporary%7 == 0){
                System.out.print("| ");
            }else{
                System.out.print(" | ");
            }

            if (temporary < startingOfMonth || temporary > amountOfDays+startingOfMonth-1){
                System.out.print("  ");
            }else{
                System.out.print(temporary-startingOfMonth+1);
            }
            if (temporary-startingOfMonth+1<10 && temporary >= startingOfMonth){
                System.out.print(" ");
            }
            temporary+=1;

            if (temporary%7 == 0){
                System.out.println(" |");
            }
        }
    }
}


