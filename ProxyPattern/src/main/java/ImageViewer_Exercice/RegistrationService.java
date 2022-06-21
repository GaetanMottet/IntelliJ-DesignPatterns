package ImageViewer_Exercice;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    private static List<User> registeredUsers = new ArrayList<User>();

    public static void register(User user) {
        registeredUsers.add(user);
        System.out.println(user.getName() + " is registered \n");
    }

    public static boolean isRegistered(User user) {
        return registeredUsers.contains(user);
    }

}
