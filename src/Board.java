import java.util.Scanner;
public class Board {

    public final static int IMPOSSIBLE_MOVE = 1;
    public static final int PLAYER_1_WINS = 2;
    public static final int PLAYER_2_WINS = 3;
    public static final int ITS_A_TIE = 4;
    public static final int NOT_DONE_YET = 5;
    public char board[][];

    public Player player1;
    public Player player2;

    private int count;
    public int boardSize = 3;
    private char p1Sign;
    private char p2Sign;
    int round =0;

    public Board(Player p1, Player p2, int boardSize) {
        board = new char[boardSize][boardSize];
        resetBoard();

        this.boardSize = boardSize;
        this.player1 = p1;
        this.player2 = p2;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public void resetBoard(){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void nextRound(){
        resetBoard();
        round++;
    }

    public int getRound() {
        return round;
    }

    public Board(char p1Sign, char p2Sign) {
        board = new char[boardSize][boardSize];
       // Scanner s = new Scanner(System.in);
       System.out.println("What size doe you want the board to be?");// build a variable board
       // boardSize = s.nextInt();
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                board[i][j] = ' ';
            }
        }
        this.p1Sign = p1Sign;
        this.p2Sign = p2Sign;
    }

    public int move(char sign, int x, int y){
        if (x < 0 || x >= boardSize || y < 0 || y>= boardSize || board[x][y] != ' '){
            return IMPOSSIBLE_MOVE;
        }

        board[x][y] = sign;
        count++;
        // Check Row
        if(board[x][0] == board[x][1] && board[x][0] == board[x][2]){
            return sign == p1Sign ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // Check Col
        if(board[0][y] == board[1][y] && board[0][y] == board[2][y]){
            return sign == p1Sign ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // First Diagonal
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            return sign == p1Sign ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // Second Diagonal
        if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]){
            return sign == p1Sign ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        if(count == boardSize * boardSize){
            return ITS_A_TIE;
        }
        return  NOT_DONE_YET;
    }

    public void print() {
        System.out.println("---------------");
        for(int i =0; i < boardSize; i++){
            for(int j =0; j < boardSize; j++){
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------");
    }
}
