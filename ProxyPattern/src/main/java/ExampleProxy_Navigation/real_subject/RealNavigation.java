package ExampleProxy_Navigation.real_subject;

import ExampleProxy_Navigation.client.User;
import ExampleProxy_Navigation.subject.Navigation;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class RealNavigation implements Navigation {
    @Override
    public void navigate(User user, String url) throws IOException, URISyntaxException {
        Desktop d = Desktop.getDesktop();

        d.browse(new URI(url));
    }
}
