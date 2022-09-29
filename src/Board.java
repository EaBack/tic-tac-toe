public class Board {
    private char board[][]; // create a grid with rows and columns
    private int boardSize = 3; //max size is 3 for the board
    private char player1Symbol, player2Symbol;

    public Board() {//defining the board and forming the grid
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = ' ';
            }
        }
        this.player1Symbol = player1Symbol;
        this.player2Symbol = player2Symbol;
    }

    //how to place a move
    //rules ( make a switch then declare every case,
    //what is an invalid move?
    /*when does player1 win?
    - when there are three same symbols on a row
    - when there are three same symbols on a columns
    -when there are three same symbols on diagonal from 0,0 to 2,2
    - when there are three same symbols on  diagonal from 2,0 to 0,2
    //When is it a tie?
     */

    public int move(char symbol, int x, int y) {
        return 0;
    }

    switch(move){
        case 1: //when a row has 3 same symbols
            Row();
            break;
        case 2: //when a colums has 3 same symbols
            Columns();
            break;
        case 3: //when diagonal1 0.0 has 3 same symbols
            (Diagonal);
            break;
        case 4: //when diagonal2 2.0 has 3 same symbols
            Diagonal();
            break;


    }


    //how to print the board in console?


    public void print() {
        System.out.println("---------------");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.println("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------");
    }
}