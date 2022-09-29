public class player {

    private String name;//player has a name
    private char symbol;//player has a symbol to play with

    public player(String name, char symbol){//be able to create a new player
        setName(name);
        setSymbol(symbol);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
