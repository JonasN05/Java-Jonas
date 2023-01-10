package Arrays;

import java.util.Random;
import java.util.Scanner;

public class CaesarEncryption {

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            encrypt();
            decrypt();
        }
    }


    public static void encrypt() {

        System.out.println("Welches Wort willst du verschlüsseln");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] caesar = word.toCharArray();

        for (int i = 0; i < caesar.length; i++) {
            int numberOfLetter = caesar[i];
            int newLetter;

            if (numberOfLetter == 90) {
                newLetter = 66;
            } else if (numberOfLetter == 122) {
                newLetter = 98;
            } else if (numberOfLetter == 89) {
                newLetter = 65;
            } else if (numberOfLetter == 121) {
                newLetter = 97;
            } else {
                System.out.println(numberOfLetter);
                System.out.println(caesar[i]);
                newLetter = numberOfLetter + 2;
            }

            char letterForArray = (char) newLetter;

            System.out.println(letterForArray);
            caesar[i] = letterForArray;
        }

        String str = new String(caesar);
        System.out.println(str);

    }

    public static void decrypt() {

        System.out.println("Welches Wort willst du entschlüsseln");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] caesar = word.toCharArray();

        for (int i = 0; i < caesar.length; i++) {
            int numberOfLetter = caesar[i];
            int newLetter;

            if (numberOfLetter == 66) {
                newLetter = 90;
            } else if (numberOfLetter == 98) {
                newLetter = 122;
            } else if (numberOfLetter == 65) {
                newLetter = 89;
            } else if (numberOfLetter == 97) {
                newLetter = 121;
            } else {
                System.out.println(numberOfLetter);
                System.out.println(caesar[i]);
                newLetter = numberOfLetter - 2;
            }

            char letterForArray = (char) newLetter;

            System.out.println(letterForArray);
            caesar[i] = letterForArray;
        }

        String str = new String(caesar);
        System.out.println(str);

    }

}


