package plane;

public class StartAutoPilotCommand implements Command {

	public StartAutoPilotCommand(Plane plane) {
		super();
		this.plane = plane;
	}

	@Override
	public void execute() {
		plane.startautopilot();
	}

	private Plane plane;

}
