import org.junit.Test;
import play.mvc.Result;
import play.test.WithApplication;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.*;

/**
 * Created by amey on 4/16/16.
 */
public class RouteTest extends WithApplication {

    @Test
    public void testDirectorsRoutes() {
        Result result = route(fakeRequest(GET, "/directors"));
        assertThat(result.status()).isEqualTo(200);

        result = route(fakeRequest(POST, "/api/directors"));
        assertThat(result.status()).isEqualTo(200);

        result = route(fakeRequest(GET, "/directors/1"));
        assertThat(result.status()).isEqualTo(200);

        result = route(fakeRequest(POST, "/directors/1"));
        assertThat(result.status()).isEqualTo(200);

        result = route(fakeRequest(POST, "/directors/1/delete"));
        assertThat(result.status()).isEqualTo(200);
    }

}