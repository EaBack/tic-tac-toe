public class player {

    private String name;//player has a name
    private char symbol;//player has a symbol to play with

    public player(String name, char symbol){//be able to create a new player
        setName(name);
        setSymbol(symbol);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void setSymbol(char symbol) {
        if(symbol != '\0')
            this.symbol = symbol;
    }
}
