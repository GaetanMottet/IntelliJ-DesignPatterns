package ch.hevs.design_patterns.exam.commands;

import ch.hevs.design_patterns.exam.ch.hevs.design_patterns.exam.receiver.TextFile;

public interface Command {
    void execute(TextFile text);
}
