import java.util.Scanner;

public class Player {

    private static String name;
    static char playerSign;

    public Player(String name, char playerSign) {
        this.name = name;
        this.playerSign = playerSign;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        }
    }

    public char getPlayerSign() {
        return playerSign;
    }

    public void setPlayerSign(char playerSign) {
        if (playerSign != '\0') {
            this.playerSign = playerSign;
        }
    }
}
