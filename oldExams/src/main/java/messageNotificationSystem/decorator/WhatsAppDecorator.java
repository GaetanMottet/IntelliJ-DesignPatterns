package messageNotificationSystem.decorator;

import messageNotificationSystem.Message;
import messageNotificationSystem.composite.Recepient;

public class WhatsAppDecorator extends NotifierDecorator {
    private Notifier notifier;

    public WhatsAppDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Message message, Recepient recepient) {
        notifier.send(message.complete("Sent with WhatsApp / "), recepient);
    }
}
