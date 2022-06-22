package game.Command;

import game.Context.ValaisGame;

public class CmdEnd implements Command {
    private ValaisGame valaisGame;
    
    public CmdEnd(ValaisGame valaisGame) {
        this.valaisGame = valaisGame;
    }

    @Override
    public void execute() {
        valaisGame.end();
    }
}
