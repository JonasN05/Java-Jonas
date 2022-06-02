package Test;

import java.util.Random;

public class Example1 {

    public static void main(String[] args) {
        int number1;
        int number2;

        Random random = new Random();
        number1 = random.nextInt(1001);
        number2 = random.nextInt(1001);

        if (number1>number2){
            for (int i = number1; i >= number2; i--) {
                System.out.println(number1);
                number1 = number1 -1;
            }
        }else if(number2>number1){
            for (int i = number2; i >= number1; i--) {
                System.out.println(number2);
                number2 = number2 -1;
            }
        }else{
            System.out.println(number1);
        }
    }
}
