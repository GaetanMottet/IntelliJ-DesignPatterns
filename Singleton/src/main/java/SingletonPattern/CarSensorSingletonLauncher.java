package SingletonPattern;

import SingletonPattern.Sensors.RoadConditionSensor;
import SingletonPattern.Sensors.SpeedSensor;
import SingletonPattern.Sensors.TemperatureSensor;

public class CarSensorSingletonLauncher {
    public CarSensorSingletonLauncher() {
    }

    public static void main(String[] args) {
        CarSensorSingletonLauncher launcher
                = new CarSensorSingletonLauncher();
        launcher.launch();
    }

    public void launch() {
        this.test(SimpleSingletonSensorsManager.getInstance());
        this.test(SynchSingletonSensorsManager.getInstance());
        this.test(EagerSingletonSensorsManager.getInstance());
        this.test(DbleCheckedLockingSingletonSensorsManager.getInstance());
    }

    private void test(SingletonSensorManager manager) {
        manager.addSensor(new TemperatureSensor());
        manager.addSensor(new SpeedSensor());
        manager.addSensor(new RoadConditionSensor());
        manager.printState();
    }
}
