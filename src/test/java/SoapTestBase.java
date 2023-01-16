import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.fail;

public class SoapTestBase {
    private static String baseURI = "http://sopromat-pc/";
    private static XmlMapper mapper = new XmlMapper();
//    private static String envelope = "<Envelope><Header></Header><Body></Body></Envelope>";

    @Test
    public void authTest() {
        User user = new User();
        user.username = "molottva";
        user.userpass = "1";

        Token token = new SecurityService().login(user);

        assertNotNull(token);
    }

    class SecurityService {
        private static String URI = baseURI + "api/securityservice";
        private static RequestSpecification specification = new RequestSpecBuilder()
                .setBaseUri(baseURI + "api/securityservice")
                .setContentType("text/xml")
                .build();

        public Token login(User user) {
            String body = "";
            try {
                body = mapper.writeValueAsString(user);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                fail("Mapper error");
            }

            String request = "<Envelope><Header></Header><Body>" + body + "</Body></Envelope>";
            String response = given()
                    .spec(specification)
                    .body(request)
                    .when()
                    .post()
                    .then()
                    .statusCode(200)
                    .extract().asString();

            int indexOne = response.indexOf("<return>");
            int indexTwo = response.indexOf("</return>") + 9;
            String responseBody = response.substring(indexOne, indexTwo)
                    .replaceAll("return", "Token");
//            response = response.replaceAll("return", "Token");
            Token token = null;
            try {
                token = mapper.readValue(responseBody, Token.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                fail("Mapper error");
            }
            return token;
        }
    }
}