import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SplitPlaygroundTest {

    private final SplitPlayground splitPlayground = new SplitPlayground();

    @Test
    public void testExtractUserToken_withAAT() {
        String authorization = "claims aat=exampleToken";
        String expected = "exampleToken";
        String result = splitPlayground.extractUserToken(authorization);
        assertEquals(expected, result);
    }

    @Test
    public void testExtractUserToken_withUserAuthorization() {
        String authorization = "claims user_authorization=exampleToken";
        String expected = "exampleToken";
        String result = splitPlayground.extractUserToken(authorization);
        assertEquals(expected, result);
    }

    @Test
    public void testExtractUserToken_invalidToken() {
        String authorization = "claims Bearer invalidToken";
        String result = splitPlayground.extractUserToken(authorization);
        assertNull(result);
    }

    @Test
    public void testExtractUserToken_noToken() {
        String authorization = "claims aat=";
        String result = splitPlayground.extractUserToken(authorization);
        assertEquals(null, result);
    }
}
