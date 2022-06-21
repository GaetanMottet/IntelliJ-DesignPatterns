package ExampleProxy_Navigation;

import ExampleProxy_Navigation.client.User;
import ExampleProxy_Navigation.proxy.ProxyNavigation;
import ExampleProxy_Navigation.subject.Navigation;

import java.io.IOException;
import java.net.URISyntaxException;

public class Launch {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String url1 = "https://intranet.hevs.ch";
        String url2 = "https://www.nzz.ch";

        User admin = new User(true);
        User student = new User(false);

        Navigation proxyNavigation = new ProxyNavigation();

        //proxyNavigation.navigate(admin, url1);
        proxyNavigation.navigate(student, url1);
    }
}
