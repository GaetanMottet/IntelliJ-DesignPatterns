public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }

        return uniqueInstance ;
    }

    public String getDescription() {
        return "I'm a synchronized Singleton, called 'Eager'. I'm thread safe Singleton but need a lot of time each time I'm called.";
    }
}
