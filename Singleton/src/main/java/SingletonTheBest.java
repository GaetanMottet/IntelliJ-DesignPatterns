public class SingletonTheBest {

    /*
    "Volatile" is used on variables that may be modified simultaneously by other threads.
    This warns the compiler to fetch them fresh each time, rather tha caching them in registers !
     */
    private volatile static SingletonTheBest uniqueInstance;

    private SingletonTheBest() {}

    public static SingletonTheBest getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonTheBest.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonTheBest();
                }
            }
        }

        return uniqueInstance;
    }
}
