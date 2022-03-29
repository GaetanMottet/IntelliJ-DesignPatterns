package ch.hevs.design_patterns.exam;

import ch.hevs.design_patterns.exam.ch.hevs.design_patterns.exam.receiver.TextFile;
import ch.hevs.design_patterns.exam.commands.*;
import ch.hevs.design_patterns.exam.invoker.Menu;

public class Main {

    static public String clipboard;

    public static void main(String[] args) {

        Menu menu = new Menu();
        TextFile text1 = new TextFile("Japon");
        TextFile text2 = new TextFile("Venise");

        menu.setCommand(0, new CloseTextFileCommand());
        menu.setCommand(1, new CopyTextFileCommand());
        menu.setCommand(2, new PasteTextFileCommand());
        menu.setCommand(3, new OpenTextFileCommand());
        menu.setCommand(4, new SaveTextFileCommand());

        menu.callMenuItem(1, text1);
        menu.callMenuItem(2, text2);
        menu.callMenuItem(0, text1);
        menu.callMenuItem(3, text1);
        menu.callMenuItem(4, text2);
    }

}
