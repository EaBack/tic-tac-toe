public class Player {

    private String name;//player has a name
    private char sign;//player has a symbol to play with

    public Player(String name, char sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        }
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        if(sign != '\0')
            this.sign = sign;
    }
}