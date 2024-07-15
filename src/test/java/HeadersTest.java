import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HeadersTest {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        // Send POST request
        String postUrl = "http://localhost:8080/hi";
        NameRequest nameRequest = new NameRequest();
        nameRequest.setName("JohnDoe");

        HttpHeaders postHeaders = new HttpHeaders();
        postHeaders.set("Content-Type", "application/json");
        HttpEntity<NameRequest> postEntity = new HttpEntity<>(nameRequest, postHeaders);

        ResponseEntity<Void> postResponse = restTemplate.postForEntity(postUrl, postEntity, Void.class);

        // Extract username from response headers
        String username = postResponse.getHeaders().getFirst("username");

        // Send GET request with username header
        String getUrl = "http://localhost:8080/hi";
        HttpHeaders getHeaders = new HttpHeaders();
        getHeaders.set("username", username);
        HttpEntity<String> getEntity = new HttpEntity<>(getHeaders);

        ResponseEntity<String> getResponse = restTemplate.exchange(getUrl, HttpMethod.GET, getEntity, String.class);

        System.out.println("Response: " + getResponse.getBody());
    }

    static class NameRequest {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
