package game.Command;

import game.Context.ValaisGame;

public class CmdMove implements Command {
    private ValaisGame valaisGame;

    public CmdMove(ValaisGame valaisGame) {
        this.valaisGame = valaisGame;
    }

    @Override
    public void execute() {
        valaisGame.move();
    }
}
