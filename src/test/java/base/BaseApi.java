package base;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Utils;
import static io.restassured.RestAssured.given;

public class BaseApi {
    public Response response;
    public RequestSpecification resquest;
    public String url = "http://localhost:8080";
    public String urlSolicitacaoToken = "http://localhost:8080/token";
    public Utils utils = new Utils();
    private String token;

    public String solicitaToken(){
        String body = String.format("Teste");
        Response response = given().with().log().all().log().all().
                header("Content-Type", "application;x-www-form-urlencoded").
                body(body).
                get(urlSolicitacaoToken).
                then().
                extract().
                response();
        this.token = response.path("acess_token");
        return token;
    }

    public void MontarHeader(){
        resquest = given()
                .header("Content-Type", "application/json");
              //.header("Authorization", "Bearer" + token);
    }

}

