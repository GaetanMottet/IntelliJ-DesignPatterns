package plane;

public interface Controller {
	void takeOff(Pilot pilot);
	void landing(Pilot pilot);
	void startAutoPilot(Pilot pilot);
}
