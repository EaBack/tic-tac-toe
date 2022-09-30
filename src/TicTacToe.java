import java.util.Scanner;

public class TicTacToe {

    private static String player1;
    private static String player2;
    private Board board;
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        


        /*{

        }

         */

    }
    private static void playerInput(int number) {// created method to get players input
        Scanner userInput = new Scanner(System.in);
// getting players names/input
        System.out.println("Hi, welcome to tictactoe, 3-in-a-row!");
        System.out.println("Who will be player " + number + "? (write down you name)");
        String name = userInput.nextLine();
        System.out.println("Who will be player " + number +  "? (write down your sign)");
        char sign = userInput.next().charAt(0);
        Player p = new Player(name,sign);
        return p;
    }

}