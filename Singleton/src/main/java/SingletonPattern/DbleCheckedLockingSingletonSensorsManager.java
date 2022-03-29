package SingletonPattern;

public class DbleCheckedLockingSingletonSensorsManager extends SingletonSensorManager{
    private volatile static DbleCheckedLockingSingletonSensorsManager uniqueInstance ;

    private DbleCheckedLockingSingletonSensorsManager() {}

    public static DbleCheckedLockingSingletonSensorsManager getInstance() {
        if(uniqueInstance == null) {
            synchronized (DbleCheckedLockingSingletonSensorsManager.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DbleCheckedLockingSingletonSensorsManager();
                }
            }
        }

        return uniqueInstance;
    }
}
