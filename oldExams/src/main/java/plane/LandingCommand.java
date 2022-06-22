package plane;

public class LandingCommand implements Command {

	
	
	public LandingCommand(Plane plane) {
		super();
		this.plane = plane;
	}

	@Override
	public void execute() {
		plane.landing();
	}

	/**
	 * @uml.property  name="plane"
	 * @uml.associationEnd  inverse="landingCommand:Plane"
	 */
	private Plane plane;

}
