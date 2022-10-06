import java.util.Random;

public class Computerplayer extends Player{

    public Computerplayer(String name, char playerSign) {
        super(name, playerSign);
    }

    static void computer(char[][] board) { // create the computer player
        Random rand = new Random();
        int computerTurn;
        while(true) {//create a random move generator for the computer
            computerTurn = rand.nextInt(9) + 1;
            if (Board.isMoveValid(board, Integer.toString(computerTurn))) { // check if the move is valid
                break;
            }
        }
        System.out.println("Computer chose " + computerTurn);//printing out what the computer did
        Board.move(board, Integer.toString(computerTurn), 'C');
    }
}
