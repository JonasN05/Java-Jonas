package Quersumme;

import java.util.Scanner;

public class CrossSum04 {

    public static void main(String[] args) {
        System.out.println("Press 1 to start");
        Scanner sc = new Scanner(System.in);
        int starting = sc.nextInt();

        while(starting == 1){

            System.out.println("Set a number");
            int input = sc.nextInt();
            int firstValue = input;

            while (input > 9){
                int temporary = input;
                input = 0;
                while (temporary > 0) {
                    input += temporary % 10;
                    temporary /= 10;
                }
            }
            System.out.println("Set Value: " + firstValue);
            System.out.println("Result: " + input);
            System.out.println("Press 2 to exit press 1 to continue");

            int finished = sc.nextInt();
            if (finished==2){
                break;
            }
        }
    }
}
