import java.util.Scanner;

public class TicTacToe {
    private static Player player1;
    private static Player player2;

    public static void main(String[] args) {
        //declare the board
        char[][] board = {{' ', ' ', ' ',},
                {' ', ' ', ' ',},
                {' ', ' ', ' ',}};

        System.out.println("Welcome to TicTacToe, 3-in-a-row!");
        Scanner scanner = new Scanner(System.in);
        // Players input
        player1 = takePlayerInput(1);
        // to choose if you want to play against other human player or computer
        Scanner YesNo = new Scanner(System.in);
        System.out.println("Would you like to play against a friend? (y/n)");
        String player1Choice = YesNo.next();
        if (player1Choice.equals("y")) {
            player2 = takePlayerInput(2);
            while(player1.getPlayerSign() == player2.getPlayerSign()){
                System.out.println("Symbol Already taken !! Pick another symbol !!");
                char sign = scanner.next().charAt(0);
                player2.setPlayerSign(sign);
            }
            gameFlow(board,scanner);
        } else if (player1Choice.equals("n")) {
            gameFlow(board, scanner);
        }

        //gameFlow(board, scanner);
    }

    private static void gameFlow(char[][] board, Scanner scanner) {
        Board.printTheBoard(board);

        while (true) {
            //create the players turn
            playerTurn(board, scanner);
            if (Board.gameOver(board)) {
                break;
            }
            Board.printTheBoard(board);
            //player 2 or computer player
             /*anteckning
                         do {print want to write
                        string name = sc.nextLine();
                        if (name.equals("q)){
                        print iets; play = false
                        break;
                        }
                        }while (play = true );
                         */
            Computerplayer.computer(board);
            if (Board.gameOver(board)) {
                break;
            }
            Board.printTheBoard(board);

        }
        scanner.close();
    }

    private static Player takePlayerInput(int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player " + number + "'s name");
        String name = scanner.nextLine();
        System.out.println("Enter Player " + number + " sign");
        char playerSign = scanner.next().charAt(0);
        Player p = new Player(name, playerSign);
        System.out.println("Name player " + number + " is " + name + " and player " + number  + " sign is: " + playerSign);
        return p;
    }

    static void playerTurn(char[][] board, Scanner scanner) { // the human players turn
        String playerInput;
        while (true) {
            System.out.println(Player.getName() + " it's your turn. ");
            System.out.println("Choose your spot (1-9) to set a sign and press Enter.");
            playerInput = scanner.nextLine();
            if (Board.isMoveValid(board, playerInput)) {
                break;
            } else {
                System.out.println(playerInput + "  is not a valid move, please try again.");
            }
        }
        Board.move(board, playerInput, Player.playerSign);// calling on method move to place a move
    }
}
