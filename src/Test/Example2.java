package Test;

import java.util.Random;

public class Example2 {

    public static void main(String[] args) {

        int sum = 0;

        while (true){

            int number;
            Random random = new Random();
            number = random.nextInt(11);

            sum = sum + number;

            if (number == 5){
                break;
            }

        }
        System.out.println(sum);
    }
}
