package WörterRaten;

import java.util.Scanner;

public class WörterRaten {

    public static void main(String[] args) {

        //String[] words = new String[1];
        String word = "hallo";

        char[] letters = word.toCharArray();
        char[] guessedWord = new char[letters.length];
        Scanner sc = new Scanner(System.in);

        while (true){
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
            for (char result:guessedWord) {
                System.out.print(result);
            }
            System.out.println();
        }
    }
}

