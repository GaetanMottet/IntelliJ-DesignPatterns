package messageNotificationSystem.decorator;

import messageNotificationSystem.Message;
import messageNotificationSystem.composite.Recepient;

public interface Notifier {
    void send(Message message, Recepient recepient);
}
