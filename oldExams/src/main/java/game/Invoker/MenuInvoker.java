package game.Invoker;

import game.Command.CmdEnd;
import game.Command.CmdMove;
import game.Command.CmdSetWinner;
import game.Command.Command;
import game.Context.ValaisGame;

import java.util.ArrayList;
import java.util.List;

public class MenuInvoker {
    public List<Command> commands = new ArrayList<Command>();

    public MenuInvoker(ValaisGame valaisGame) {
        commands.add(new CmdEnd(valaisGame));
        commands.add(new CmdSetWinner(valaisGame));
        commands.add(new CmdMove(valaisGame));
    }

    public void callItem(int index) {
        commands.get(index).execute();
    }
}

