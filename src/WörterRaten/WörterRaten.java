package WörterRaten;

import java.util.Random;
import java.util.Scanner;

public class WörterRaten {

    public static void main(String[] args) {

        boolean isRunning = true;

        String[] words = {"hallo", "gehen", "laufen", "schule","bruttosozialprodukt","gegen"};

        int numberOfWords = 0;
        Random random = new Random();
        numberOfWords = random.nextInt(words.length);

        String word = words[numberOfWords];

        char[] letters = word.toCharArray();
        char[] guessedWord = new char[letters.length];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[0] = letters[0];
            guessedWord[guessedWord.length-2] = letters[letters.length-2];
            if (guessedWord[0] == letters[i]){
                System.out.print(guessedWord[0]);
            }else if (guessedWord[guessedWord.length-2] == letters[i]){
                System.out.print(guessedWord[guessedWord.length-2]);
            }else{
                System.out.print("*");
            }
        }

        for (int i = 0; i < guessedWord.length; i++) {
            if (letters[i]==guessedWord[0] && 0!=i){
                guessedWord[i]=guessedWord[0];
            }
            if (letters[i]==guessedWord[guessedWord.length-2]&& guessedWord.length-2!=i){
                guessedWord[i]=guessedWord[guessedWord.length-2];
            }
        }

        while (isRunning){
            System.out.println();
            System.out.println("Welchen Buchstaben willst du aufdecken:");
            String guess = sc.next();
            char[] inputLetter = guess.toCharArray();

                for (int i = 0; i < guessedWord.length; i++) {
                    if (inputLetter[0]==letters[i]){
                        guessedWord[i]=inputLetter[0];
                    }else if(guessedWord[i]!=letters[i]){
                        guessedWord[i]='*';
                    }
                }

            //Ausgabe des Wortes
            for (char result:guessedWord) {
                System.out.print(result);
            }
            System.out.println();

            //Abfragen ob das Wort erraten Wurde
            int finished = 0;
            for (int i = 0; i < guessedWord.length; i++) {
                if (guessedWord[i]!='*'){
                    finished+=1;
                }
            }
            if (finished== guessedWord.length){
                System.out.println("Du hast das Wort erraten");
                isRunning = false;
            }
        }
    }
}

