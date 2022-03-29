package SingletonPattern;

public class SimpleSingletonSensorsManager extends SingletonSensorManager{
    private static SimpleSingletonSensorsManager uniqueInstance ;

    private SimpleSingletonSensorsManager() {}
    public static SimpleSingletonSensorsManager getInstance() {
        if(uniqueInstance==null) {
            uniqueInstance = new SimpleSingletonSensorsManager() ;
        }
        return uniqueInstance;
    }
}
