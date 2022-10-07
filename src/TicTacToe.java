import java.util.Scanner;

public class TicTacToe {
    private static Board board;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //input from players
        Player player1 = takePlayerInput(1);
        Player player2 = takePlayerInput(2);
        while(player1.getPlayerSign() == player2.getPlayerSign()){
            System.out.println("That sign is occupied, please try again.");
            char playerSign = scan.next().charAt(0);
            player2.setPlayerSign(playerSign);
        }//Build the board
        //System.out.println("Which size square would you like to play? for example 4 = 4x4 square");// under construction
        //int boardSize = scan.nextInt();
        board = new Board(player1, player2,3);
        System.out.println("Round number: " + board.getRound());

        initGame(scan);//start the game

        boolean respons = true;
        do {// loop to initiate play again
          //System.out.println("1. Entering while loop ");
            System.out.println("2. Would you like to play again? yes/no ");
            String play = scan.next();
            if (play.equals("yes")){
                System.out.println("1. Scanner input was yes");
                System.out.println("2. Let's play again");
                System.out.println("3. Get ready for round number " + board.round + " !|");
                respons = false;
            }else if (play.equals("no")) {
                System.out.println("1. Scanner input was no");
                System.out.println("2. Ok, thanks and have a wonderfull day.");
                break;
            }
        } while (respons);
        System.out.println("Round number: " + board.getRound());
        initGame(scan);
        board.nextRound();
//        board.nextRound() => återställer brädet, sätter round till nästa runda (round + 1)

    }

        //start the game
    public static void initGame(Scanner scan){

        System.out.println("Here you can see how to use the positions");
        System.out.println( "|[0,0]||[0,1]||[2,2]|");
        System.out.println( "|[1,0]||[1,1]||[1,2]|");
        System.out.println( "|[2,0]||[2,1]||[2,2]|");
        System.out.println( "Och större när man väljer annan storlek");
        board.print();

        // play the game
        boolean player1Turn = true;
        int status = Board.NOT_DONE_YET;
        while(status == Board.NOT_DONE_YET || status == Board.IMPOSSIBLE_MOVE) {
            if (player1Turn) {

                System.out.println("Player 1 " + board.player1.getName() + "'s turn");
                System.out.println("Enter 0-2 for the position of x: ");
                int x = scan.nextInt();
                System.out.println("Enter 0-2 for the position of y: ");
                int y = scan.nextInt();
                status = board.move(board.player1.getPlayerSign(), x, y);
                if (status != Board.IMPOSSIBLE_MOVE) {
                    player1Turn = false;
                    board.print();
                } else {
                    System.out.println("Impossible move, please try again.");
                }
            } else {
                System.out.println("Player 2 " + board.player2.getName() + "'s turn");
                System.out.println("Enter 0-2 for the position of x: ");
                int x = scan.nextInt();
                System.out.println("Enter 0-2 for the position of y: ");
                int y = scan.nextInt();
                status = board.move(board.player2.getPlayerSign(), x, y);
                if (status != Board.IMPOSSIBLE_MOVE) {
                    player1Turn = true;
                    board.print();
                } else {
                    System.out.println("Impossible move, please try again.");
                }
            }
        }
        if(status == Board.PLAYER_1_WINS){
            System.out.println("Player - " + board.player1.getName() +" wins !!");
        }else if(status == Board.PLAYER_2_WINS){
            System.out.println("Player - " + board.player2.getName() +" wins !!");
        }else{
            System.out.println("Draw !!");
        }
        System.out.println("Round ended");
    }

    private static Player takePlayerInput(int number) {
        Scanner scanner = new Scanner(System.in);
  //      System.out.println("Which size square would you like to play? for example 4 = 4x4 square");
    //    board.boardSize = scanner.nextInt();
        System.out.println("Enter Player " + number + "'s name");
        String name = scanner.nextLine();
        System.out.println("Enter Player " + number + "'s sign");
        char playerSign = scanner.next().charAt(0);
        Player p = new Player(name, playerSign);
        System.out.println("Name player " + number + " is " + name + " and player " + number + " sign is: " + playerSign);
        return p;
    }
}



