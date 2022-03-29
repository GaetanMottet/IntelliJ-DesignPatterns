public class ConcreteCommand implements Command {

    //usually we'll have plenty of differents ConcreteCommand
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }

    @Override
    public void undo() {

    }
}
