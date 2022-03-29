public class SingletonBasic {  // /!\ This is NOT thread Safe !!!
    private static SingletonBasic uniqueInstance;

    private SingletonBasic() {}

    public static SingletonBasic getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonBasic();
        }

        return uniqueInstance ;
    }

    public String getDescription() {
        return "I'm a basic and NOT thread safe Singleton.";
    }
}
