package SingletonPattern;

public class EagerSingletonSensorsManager extends SingletonSensorManager{
    private static EagerSingletonSensorsManager uniqueInstance = new EagerSingletonSensorsManager();

    private EagerSingletonSensorsManager() {}

    public static EagerSingletonSensorsManager getInstance() {
        return uniqueInstance;
    }
}
