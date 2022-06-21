package CarGame;

public class Game { //would be the invoker
    private Command[] myCommands = new Command[4] ;
    private Command key ;

    public void setCommand(int key,Command command) {
        myCommands[key] = command ;
    }

    public void pushKey(int i) {
        myCommands[i].puschKey();
        key = myCommands[i];
    }

    public void undo() {
        key.undo();
    }
}
