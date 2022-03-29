package CarGame;

public class Game { //would be the invoker
    private Command[] myCommands = new Command[4] ;

    public void setCommand(int key,Command command) {
        myCommands[key] = command ;
    }

    public void buttonWasPressed() {key.puschKey();}

    public void pushKey(int i) {
        this.myCommands
        key.puschKey(i);
    }

    public void undo() {
        key.undo();
    }
}
