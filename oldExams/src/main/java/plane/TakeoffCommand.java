package plane;

public class TakeoffCommand implements Command {

	public TakeoffCommand(Plane plane) {
		super();
		this.plane = plane;
	}

	@Override
	public void execute() {
		plane.takeoff();
	}

	private Plane plane;

}
