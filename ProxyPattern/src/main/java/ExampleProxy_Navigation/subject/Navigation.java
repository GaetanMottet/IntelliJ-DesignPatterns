package ExampleProxy_Navigation.subject;

import ExampleProxy_Navigation.client.User;

import java.io.IOException;
import java.net.URISyntaxException;

public interface Navigation {
    void navigate(User user, String url) throws IOException, URISyntaxException;
}
