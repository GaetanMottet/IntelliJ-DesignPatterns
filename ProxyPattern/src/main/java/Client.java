public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(); // a new subject that is a proxy
        subject.request(); // the subject/proxy do the job
    }
}
