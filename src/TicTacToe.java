import java.util.Scanner;

public class TicTacToe {

    private Player player1, player2;
    private Board board;
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.gameOn();

        }

    public void gameOn() {//gameOn start playing the game)
            Scanner sc = new Scanner(System.in);
            player1 = playerInput(1);
            player2 = playerInput(2);
            while(player1.getSign() == player2.getSign()){
                System.out.println("That sign is already taken, choose a different one.");
                char sign = sc.next().charAt(0);
                player2.setSign(sign);
            }
            //print the board
            board = new Board();//previous content player1.getSign(), player2.getSign()
            //Play the game
            boolean player1Turn = true;// player 1 starts the game and we create turnbase
            int status = Board.NOT_DONE_YET;
            while (status == Board.NOT_DONE_YET || status == Board.IMPOSSIBLE_MOVE) {
                if(player1Turn){
                    System.out.println("It's " + player1.getName() + "'s turn");
                    System.out.println("Enter x-coordinate: ");
                    int x = sc.nextInt();
                    System.out.println("Enter y-coordinate: ");
                    int y = sc.nextInt();
                    status = board.moves(player1.getSign(), x, y);
                    if(status != Board.IMPOSSIBLE_MOVE){
                        player1Turn = false;
                        board.printBoard();
                    }else {System.out.println("Impossible Move !! Please Try Again.");
                    }
                }else{
                    System.out.println("It's " + player2.getName() + "'s turn");
                    System.out.println("Enter x-coordinate: ");
                    int x = sc.nextInt();
                    System.out.println("Enter y-coordinate: ");
                    int y = sc.nextInt();
                    status = board.moves(player2.getSign(), x, y);
                    if(status != Board.IMPOSSIBLE_MOVE){
                        player1Turn = true;
                        board.printBoard();
                    }else {System.out.println("Impossible Move !! Please Try Again.");
                    }
                }

            }
        }
    private Player playerInput(int number) {// created method to get players input
        Scanner userInput = new Scanner(System.in);
// getting players names/input
        System.out.println("Hi, welcome to tictactoe, 3-in-a-row!");
        System.out.println("Rule recap: the first one to have 3 signs in a row wins the game.");
        System.out.println("If nobody is able to get 3-in-a-row and the bord is full, it's a tie!");
        System.out.println("Who will be player " + number + "? (write down you name)");
        String name = userInput.nextLine();
        System.out.println("Select your sign player " + number +  ". (write down your sign)");
        char sign = userInput.next().charAt(0);
        Player p = new Player(name,sign);
        return p;
    }

}