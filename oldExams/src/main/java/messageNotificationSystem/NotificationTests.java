package messageNotificationSystem;

import messageNotificationSystem.composite.Individual;
import messageNotificationSystem.composite.Recepient;
import messageNotificationSystem.composite.RecepientGroup;
import messageNotificationSystem.decorator.*;

import java.time.LocalDateTime;

public class NotificationTests {
    public static void main(String[] args) {
        // Setting the company hierarchy:
        Recepient marc = new Individual("Marc");
        Recepient matthieu = new Individual("Matthieu");
        Recepient luc = new Individual("Luc");
        Recepient jean = new Individual("Jean");

        RecepientGroup humanressourceDepartment = new RecepientGroup();
        humanressourceDepartment.add(marc);
        humanressourceDepartment.add(matthieu);

        RecepientGroup itDepartment = new RecepientGroup();
        itDepartment.add(luc);
        itDepartment.add(jean);

        RecepientGroup company = new RecepientGroup();
        company.add(itDepartment);
        company.add(humanressourceDepartment);

        // Setting the notification mecanisms:
        // Creating a message
        System.out.println("------- 1ST NOTIFICATION --------");
        Notifier notifier = new CoreNotifier();
        notifier.send(new Message("IT IS TIME TO EAT."), marc);

        System.out.println("------- 2ND NOTIFICATION --------");
        notifier = new SMSDecorator(notifier);
        notifier.send(new Message("DO YOU WANT TO JOIN DINNER?"), humanressourceDepartment);

        System.out.println("------- 3RD NOTIFICATION --------");
        notifier = new WhatsAppDecorator(new TelegramDecorator(notifier));
        notifier.send(new Message("WE ARE GOING TO PLAY FOOTBALL!"), company);

    }
}
