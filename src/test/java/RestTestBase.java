import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class RestTestBase {
    private static RequestSpecification specification;
    private static String baseURI = "http://sopromat-pc/pm/devprom_webtest/api/v1";
    private static String authKey = "bbefe1e6544b80b801808bc4e2b70325";
    //Включение игнорирования неизвестных полей в JSON при десериализации в Object
//    private static ObjectMapper mapper = new ObjectMapper()
//            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    @BeforeClass
    public static void initSpec(){
        specification = new RequestSpecBuilder()
                .setBaseUri(baseURI)
                .addHeader("Devprom-Auth-Key", authKey)
                .setContentType(ContentType.JSON)
                .build();
    }

    @Test
    private void getAndPostIssue() {
        Issue testIssue = new Issue();
        testIssue.Caption = "API test";
        testIssue.Description = "Description";
        testIssue.Priority = "2";

        Issue[] before = given()
                .spec(specification)
                .when()
                .get("/issues")
                .then()
                .statusCode(200)
                .extract().as(Issue[].class);

        Issue postIssue = given()
                .spec(specification)
                .body(testIssue)
                .when()
                .post("/issues")
                .then()
                .statusCode(200)
                .extract().as(Issue.class);

        Issue[] after = given()
                .spec(specification)
                .when()
                .get("/issues")
                .then()
                .statusCode(200)
                .extract().as(Issue[].class);

        assertEquals(before.length + 1, after.length);
//        assertEquals(postIssue, testIssue);
//        assertEquals(after[after.length - 1], testIssue);
        assertEquals(after[after.length - 1], postIssue);
    }
}