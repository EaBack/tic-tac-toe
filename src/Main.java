import java.util.Scanner;

public class Main {
    //build a playing field and being able to maken moves ( board class )
    // defining players, what they do and how they act
    //rules of the game / game play
    public static void main(String[] args){

        char [][] board = { {' ',' ',' '},// defining the board as an array of arrays
                            {' ',' ',' '},
                            {' ',' ',' '}};
        String player1;
        String player2;
        char symbolChoice = X, O;
        char p1Symbol;
        char p2Symbol;

        printBoard(board);//method to call upon board


        //getting user input in place
        Scanner userRespons = new Scanner(System.in);

        //player1 name
        System.out.println("Hi, welcom to tictactoe, 3-in-a-row!");
        System.out.println("Who will be player 1? (write down you name)");
        player1 = userRespons.nextLine();
        System.out.println("Who will be player 2? (write down you name)");
        player2 = userRespons.nextLine();

        //player1 symbol choice
        System.out.println("Welcome " + player1 + ", which symbol would you like to use in the game? (choose between X or O )");
        p1Symbol = userRespons.nextLine();
        //player2 symbol choice
        //write an if statement that will filter out the other symbol and assign it to player two
        if (p1Symbol == X ){
        p2Symbol = O;
            System.out.println("So " +player2 + ", you will play with " + p2Symbol+".");
        }else {
            p2Symbol = X;
            System.out.println(player2 + ", you will play with " + p2Symbol+".");
        }


        //System.out.println("Welcome " + player2 + ", which symbol would you like to use in the game? (choose between X or O )");
        //String p2Symbol = userRespons.nextLine();

        System.out.println("Ok " + player1 + " and " + player2 + " let's get going and play this game!");

        //start playing the game
        /* System.out.println("Where would you like to place your symbol? ( choose 1 - 9 )");
        String playerChoice = userRespons.nextLine();
        System.out.println(playerChoice);
        */



    }

    private static void printBoard(char[][] board) {//constructing the board and printing it to the console
        System.out.println(" " + board[0][0] +" " +"| " + board[0][1] +" " + "|" + " " + board[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[1][0] +" " +"| " + board[1][1] +" " + "|" + " " + board[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[2][0] +" " + "| " + board[2][1] + " " +"|" + " " + board[2][2]);
    }
}