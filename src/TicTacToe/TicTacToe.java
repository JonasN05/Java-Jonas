package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    static char[][] playField = new char[3][3];
    static int player = 0;
    static boolean running = true;
    static int counter = 0;
    static Scanner sc = new Scanner(System.in);
    static int newPlayer = 0;

    public static void main(String[] args) {

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");

        System.out.println();

        while(running){
            System.out.println("Enter your choice Player " + (player%2+1));
            String input = sc.next();
            String[] values = input.split(",");

            int xCoordinate = Integer.parseInt(values[0])-1;
            int yCoordinate = Integer.parseInt(values[1])-1;

            enterChoice(xCoordinate, yCoordinate);
        }
    }

    public static void createPlayField(){
        for (int row = 0; row < playField.length; row++) {
            for (int col = 0; col < playField.length; col++) {
                System.out.print(playField[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void enterChoice(int x, int y){
        if(player%2 == 1){
            if(playField[x][y]!='x' && playField[x][y]!='o'){
                playField[x][y] = 'x';
                createPlayField();
                if (isThereAWinner()){
                    System.out.println("Der Gewinner ist Spieler 1");
                    clearGame();
                    System.out.println("Welcher Spieler soll starten?");
                    int newPlayer = sc.nextInt();
                    if (newPlayer==1){
                        player = 1;
                    }else if (newPlayer==2){
                        player = 0;
                    }
                }
            }else{
                System.out.println("Das Feld wurde bereits besetzt");
                player = 0;
            }
        }else if(player%2 == 0){
            if(playField[x][y]!='x' && playField[x][y]!='o'){
                playField[x][y] = 'o';
                createPlayField();
                if (isThereAWinner()){
                    System.out.println("Der Gewinner ist Spieler 2");
                    clearGame();
                    System.out.println("Welcher Spieler soll starten?");
                    int newPlayer = sc.nextInt();
                    if (newPlayer==1){
                        player = 1;
                    }else if (newPlayer==2){
                        player = 0;
                    }
                }
            }else{
                System.out.println("Das Feld wurde bereits besetzt");
                player = 1;
            }
        }
        player += 1;
    }

    public static boolean isThereAWinner(){
        for (int i = 0; i < 3; i++) {
            if (playField[0][i]==playField[1][i]&&playField[0][i]==playField[2][i]&&playField[0][i]!='\u0000'){
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (playField[i][0]==playField[i][1]&&playField[i][0]==playField[i][2]&&playField[i][0]!='\u0000'){
                return true;
            }
        }
        if (playField[0][0] == playField[1][1] && playField[0][0] == playField[2][2] && playField[1][1] == playField[2][2] && playField[0][0] != '\u0000' && playField[1][1] !='\u0000' && playField[2][2] !='\u0000'){
        return true;
        }else if (playField[0][2] == playField[1][1] && playField[0][2] == playField[2][0] && playField[2][0] == playField[1][1] && playField[2][0] != '\u0000' && playField[0][2] !='\u0000' && playField[1][1] !='\u0000'){
        return true;
        }

        for (int row = 0; row < playField.length; row++) {
            for (int col = 0; col < playField.length; col++) {
                if(playField[row][col]=='o'||playField[row][col]=='x'){
                    counter += 1;
                }
            }System.out.println();
        }

        if(counter == 9){
            clearGame();
            System.out.println();
            System.out.println("Unentschieden");
            System.out.println();
            System.out.println("Welcher Spieler soll starten?");
            int newPlayer = sc.nextInt();
            if (newPlayer==1){
                player = 1;
            }else if (newPlayer==2){
                player = 0;
            }
        }
        counter = 0;
        return false;
    }

    public static void clearGame(){
        for (int row = 0; row < playField.length; row++) {
            for (int col = 0; col < playField.length; col++) {
                playField[row][col]='\u0000';
            }
        }
        System.out.println();
        System.out.println("Das Spielfeld wurde zurückgesetzt!");
    }
}
