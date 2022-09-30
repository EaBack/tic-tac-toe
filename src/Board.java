public class Board {

    private static final int IMPOSSIBLE_MOVE = 1;
    private static final int PLAYER_X_WINS = 2;
    private static final int PLAYER_Y_WINS = 3;
    private static final int ITS_A_TIE = 4;
    private static final int NOT_DONE_YET = 5;
    private char board[][];
    private int size = 3;
    private char xSign, ySign;
    private int count;

    //define board array
    public Board(char X, char Y) {
        char board[][] = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '.';
            }
        }
        this.xSign = X;
        this.ySign = Y;
    }

    //how to make a move
    //we need to set up rules, when does a player win, when it is a draw and when a move is invalid
    public int moves(char sign, int x, int y) {
        //impossible move
        board[x][y] = sign;
        count++;
        if (x < 0 || x >= size || y < 0 || y >= size || board[x][y] != ' ') {
            return IMPOSSIBLE_MOVE;
        }
        //check rows if there is 'XXX' or 'YYY'
        if (board[x][0] == board[x][1] && board[x][0] == board[x][2]){
            return sign == xSign ? PLAYER_X_WINS : PLAYER_Y_WINS;
        }
        //check columns if there is 'XXX' or 'YYY'
        if (board[0][y] == board[1][y] && board[0][y] == board[2][y]){
            return sign == xSign ? PLAYER_X_WINS : PLAYER_Y_WINS;
        }//check diagonal1 ( [0][0] - [2][2] ) if there is 'XXX' or 'YYY'
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            return sign == xSign ? PLAYER_X_WINS : PLAYER_Y_WINS;
        }//check diagonal2 ( [2][0] - [0][2] ) if there is 'XXX' or 'YYY'
        if (board[2][0] == board[1][1] && board[2][0] == board[0][2]){
            return sign == xSign ? PLAYER_X_WINS : PLAYER_Y_WINS;
        }
        if(count == size*size){
            return ITS_A_TIE;
        }
        return NOT_DONE_YET;
    }

    //print the board
    public void printBoard(){
        System.out.println("--------------");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(" " + board[i][j]);
            }
            System.out.println("--------------");
        }
    }

}







