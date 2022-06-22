package messageNotificationSystem.decorator;

import messageNotificationSystem.Message;
import messageNotificationSystem.composite.Recepient;

public class TelegramDecorator extends NotifierDecorator {
    private Notifier notifier;

    public TelegramDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Message message, Recepient recepient) {
        notifier.send(message.complete("Encrypted and sent with Telegram / "), recepient);
    }
}
