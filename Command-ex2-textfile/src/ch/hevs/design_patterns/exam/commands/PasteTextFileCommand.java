package ch.hevs.design_patterns.exam.commands;

import ch.hevs.design_patterns.exam.ch.hevs.design_patterns.exam.receiver.TextFile;

public class PasteTextFileCommand implements Command {

    @Override
    public void execute(TextFile textFile) {
        textFile.paste();
    }
}
