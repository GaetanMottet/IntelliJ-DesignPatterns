package ExampleProxy_Navigation;

import java.io.IOException;
import java.net.URISyntaxException;

public interface Navigation {
    void navigate(User user, String url) throws IOException, URISyntaxException;
}
