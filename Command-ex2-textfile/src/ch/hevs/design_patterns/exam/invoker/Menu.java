package ch.hevs.design_patterns.exam.invoker;

import ch.hevs.design_patterns.exam.ch.hevs.design_patterns.exam.receiver.TextFile;
import ch.hevs.design_patterns.exam.commands.Command;

public class Menu {
    private Command[] menuItems = new Command[5];

    public void setCommand(int key, Command command) {
        menuItems[key] = command;
    }

    public void callMenuItem(int key, TextFile textFile) {
        menuItems[key].execute(textFile);
    }

}
