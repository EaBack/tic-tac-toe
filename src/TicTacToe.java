import java.util.Scanner;

public class TicTacToe {

    private static String player1;
    private static String player2;
    private Board board;
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();


        Scanner userInput = new Scanner(System.in);

// getting players names/input
        System.out.println("Hi, welcome to tictactoe, 3-in-a-row!");
        System.out.println("Who will be player 1 ( X )? (write down you name)");
        player1 = userInput.nextLine();
        System.out.println("Who will be player 2 ( O )? (write down you name)");
        player2 = userInput.nextLine();


    }

}