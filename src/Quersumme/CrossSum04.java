package Quersumme;

import java.util.Scanner;

public class CrossSum04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int starting = sc.nextInt();

        while(starting == 1){

            int number = sc.nextInt();

            String stringNumber = Integer.toString(number);
            char[] numbers = stringNumber.toCharArray();

            int result = 0;
            for(int i = 0; i<numbers.length;i++){
                result += Character.getNumericValue(numbers[i]);
            }
            System.out.println(result);


            public static int quersumme(int zahl) {

                if (zahl <= 9){
                    return zahl;
                }else{
                    return zahl%10 + quersumme(zahl/10);
                }

            }
        }
    }
}
