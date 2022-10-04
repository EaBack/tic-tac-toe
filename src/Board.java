public class Board {
    public static final int IMPOSSIBLE_MOVE = 1;
    public static final int PLAYER_X_WINS = 2;
    public static final int PLAYER_Y_WINS = 3;
    public static final int ITS_A_TIE = 4;
    public static final int NOT_DONE_YET = 5;
    private char board[][] = {{' ',' ',' '},
                              {' ',' ',' '},
                              {' ',' ',' '}};
    private int size = 3;
    private char xSign, ySign;
    private int count;


    //define board array
    /*public Board(char xSign, char ySign){
        board = new char[size][size];
        for(int i =0; i < size; i++){
            for(int j =0; j < size; j++){
                board[i][j] = ' ';
            }
        }
        this.xSign = xSign;
        this.ySign = ySign;
    }

     */

    //how to make a move
    //we need to set up rules, when does a player win, when it is a draw and when a move is invalid
   public static boolean didPlayerWin(char[][] board, char sign) {
        //check when a player has won
        if ((board[0][0] == sign && board[0][1] == sign && board[0][2] == sign) ||
        (board[1][0] == sign && board[1][1] == sign && board[1][2] == sign) ||
        (board[2][0] == sign && board[2][1] == sign && board[2][2] == sign) ||
        (board[0][0] == sign && board[1][0] == sign && board[2][0] == sign) ||
        (board[0][1] == sign && board[1][1] == sign && board[2][1] == sign) ||
        (board[0][2] == sign && board[1][2] == sign && board[2][2] == sign) ||
        (board[0][0] == sign && board[1][1] == sign && board[2][2] == sign) ||
        (board[0][2] == sign && board[1][1] == sign && board[2][0] == sign)){
        return true;
        }
        return false;
    }

    private static boolean validMove (char [][] board, String position){
        switch(position){//
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
        }
    }
    private static void move(char[][] board, String position, char sign) {
        switch (position) {//converting moves expected to single digit sign x/y.
            case "1":
                board[0][0] = sign;
                break;
            case "2":
                board[0][1] = sign;
                break;
            case "3":
                board[0][2] = sign;
                break;
            case "4":
                board[1][0] = sign;
                break;
            case "5":
                board[1][1] = sign;
                break;
            case "6":
                board[1][2] = sign;
                break;
            case "7":
                board[2][0] = sign;
                break;
            case "8":
                board[2][1] = sign;
                break;
            case "9":
                board[2][2] = sign;
                break;
            default:
                System.out.println(" Sad I am");// in case there is nog input
        }
    }

    //print the board
    public void printBoard() {
        System.out.println("---------------");
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("---------------");
    }

}







