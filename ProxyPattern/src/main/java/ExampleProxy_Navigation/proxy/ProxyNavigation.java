package ExampleProxy_Navigation.proxy;

import ExampleProxy_Navigation.client.User;
import ExampleProxy_Navigation.real_subject.RealNavigation;
import ExampleProxy_Navigation.subject.Navigation;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyNavigation implements Navigation {
//    @uml.property name = "realNavigation"

    private RealNavigation realNavigation;
    private List<String> listOfRestrictedURL = new ArrayList<String>(Arrays.asList("https://intranet.hevs.ch",
                                                                                    "https://intranet.technopole.che/"));

    @Override
    public void navigate(User user, String url) throws IOException, URISyntaxException {
        boolean access = controlURL(url);

        if(access || user.isAdmin()) {
            realNavigation = new RealNavigation();
            realNavigation.navigate(user, url);
        }
        else {
            JOptionPane.showMessageDialog(null, "You do not have access to " +url
                                                            + " , please contact the computer science service");
        }
    }

    private boolean controlURL(String url){
        return !listOfRestrictedURL.contains(url);
    }

}
