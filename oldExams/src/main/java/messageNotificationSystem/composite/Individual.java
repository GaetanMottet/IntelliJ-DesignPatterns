package messageNotificationSystem.composite;

import messageNotificationSystem.Message;

public class Individual implements Recepient {
    String name;

    public Individual(String name) {
        this.name = name;
    }

    @Override
    public void receives(Message message) {
        System.out.println(name + " receives a message " + message);
    }
}
