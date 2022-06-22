package messageNotificationSystem.decorator;

import messageNotificationSystem.Message;
import messageNotificationSystem.composite.Recepient;

public class CoreNotifier implements Notifier {
    @Override
    public void send(Message message, Recepient recepient) {
        recepient.receives(message.complete("Sent on the computer / "));
    }
}
