package game.Command;

import game.Context.ValaisGame;

public class CmdSetWinner implements Command {
    private ValaisGame valaisGame;

    public CmdSetWinner(ValaisGame valaisGame) {
        this.valaisGame = valaisGame;
    }

    @Override
    public void execute() {
        valaisGame.setWinner();
    }
}
