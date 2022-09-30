public class Board {

    private char board[][];
    private int size = 3;
    private char xSign, ySign;

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
        if (x < 0 || x >= size || y < 0 || y >= size || board[x][y] != ' ') {
            return IMPOSSIBLE_MOVE;
        }
        //check rows if there is 'XXX' or 'YYY'
        if{

        }
        //check columns if there is 'XXX' or 'YYY'
        if {

        }//check diagonal1 ( [0][0] - [2][2] ) if there is 'XXX' or 'YYY'
        if (){

        }//check diagonal2 ( [2][0] - [0][2] ) if there is 'XXX' or 'YYY'
        if (){

        }
        return x;
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







