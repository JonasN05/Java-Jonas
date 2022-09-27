package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        int[][] playField = new int[3][3];

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");

        Scanner sc = new Scanner(System.in);
        int player = 1;

        System.out.println();
        System.out.println("Enter your choice Player " + player);
        String input = sc.next();
        String[] values = input.split(",");

        for (String a:values) {
            System.out.println(a);
        }

        int xCoordinate = Integer.parseInt(values[0]);
        int yCoordinate = Integer.parseInt(values[1]);

    }

    public static void createPlayField(){

    }


    public static void enterChoice(){

    }

}
