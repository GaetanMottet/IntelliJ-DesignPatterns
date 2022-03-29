public class SingletonClient {
    public static void main(String[] args) {
        SingletonBasic singleton = SingletonBasic.getInstance();
        System.out.println(singleton.getDescription());
    }
}
