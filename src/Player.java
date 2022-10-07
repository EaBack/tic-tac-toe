public class Player {

    private  String name;
    private char playerSign;

    public Player(String name, char playerSign) {
        this.name = name;
        this.playerSign = playerSign;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public char getPlayerSign() {
        return playerSign;
    }

    public void setPlayerSign(char playerSign) {
            this.playerSign = playerSign;

    }
}
