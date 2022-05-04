package Arrays;

import java.util.Random;

public class Exercise02 {

    public static void main(String[] args) {
        int[] randomNumbers = new int[50];
        int generateNumber =0;
        Random random = new Random();
        int result = 0;

        for (int i = 0; i < randomNumbers.length; i++){
            generateNumber = random.nextInt(100);
            randomNumbers[i] = generateNumber;
            result += randomNumbers[i];
            System.out.println(randomNumbers[i]);
        }
        System.out.println(result);

    }
}
