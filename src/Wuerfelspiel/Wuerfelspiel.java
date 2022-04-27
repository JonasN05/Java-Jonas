package Wuerfelspiel;

import java.util.Scanner;

public class Wuerfelspiel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("Drücken sie die F Taste um zu Starten und zu Würfeln");

        while (isRunning) {
            String letterToStart = sc.next();

            if (letterToStart.equals("F")) {
                int score = 0;
                for (int i = 1; i <= 6; i++) {
                    double number = Math.random() * 6 + 1;
                    int playerNumber = (int) number;
                    System.out.println("Würfelzahl " + i + ": " + playerNumber);
                    score = score + playerNumber;
                }

                System.out.println("Deine Gesamtzahl: " + score);
                double botNumber = Math.random() * 30 + 6;
                int comNumber = (int) botNumber;

                System.out.println("Zahl des Computers: " + comNumber);

                if (comNumber < score) {
                    System.out.println("Du hast Gewonnen");
                } else if (comNumber > score) {
                    System.out.println("Du hast Verloren");
                } else {
                    System.out.println("Unentschieden");
                }

                System.out.println("press F to play again or press E for end");

            } else {
                isRunning = false;
            }

        }

    }

}
