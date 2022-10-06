import java.util.Scanner;
public class Board {
    static boolean gameOver(char[][] board) {// check if the game is finished
        //check the rows
        if (didPlayerWin(board, 'X')){
            printTheBoard(board);
            System.out.println("Player 1 wins");
            return true;
        }
        if (didPlayerWin(board, 'O')){
            printTheBoard(board);
            System.out.println("Player 2 wins");
            return true;
        }
        for(int i=0; i < board.length; i++){
            for (int j=0; j < board.length; j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }printTheBoard(board);
        System.out.println("It's a draw!");
        return true;
    }
    private static boolean didPlayerWin(char[][] board, char sign) {
        if ((board[0][0] == sign && board[0][1] == sign && board[0][2] == sign) ||
                (board[1][0] == sign && board[1][1] == sign && board[1][2] == sign) ||
                (board[2][0] == sign && board[2][1] == sign && board[2][2] == sign) ||
                //check the columns
                (board[0][0] == sign && board[1][0] == sign && board[2][0] == sign) ||
                (board[0][1] == sign && board[1][1] == sign && board[2][1] == sign) ||
                (board[0][2] == sign && board[1][2] == sign && board[2][2] == sign) ||
                //check diagonal 1
                (board[0][0] == sign && board[1][1] == sign && board[2][2] == sign) ||
                //check diagonal 2
                (board[0][2] == sign && board[1][1] == sign && board[2][0] == sign)){
            return true;
        }
        return false;
    }
    static boolean isMoveValid(char[][] board, String position){ // method to verify if the made move is valid
        switch(position){
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
            default:
                return false;
        }
    }
    static void move(char[][] board, String position, char sign) {
        switch(position){
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
                System.out.println("Me sa issa very sad");
        }
    }
    static void printTheBoard(char[][] board) { //printing out the board based on the declared car
        System.out.println("|"+ board[0][0] + "|" + board[0][1] + "|" + board[0][2]+"|");
        System.out.println("+-+-+-+");
        System.out.println("|"+ board[1][0] + "|" + board[1][1] + "|" + board[1][2]+"|");
        System.out.println("+-+-+-+");
        System.out.println("|"+ board[2][0] + "|" + board[2][1] + "|" + board[2][2]+"|");
    }
}

