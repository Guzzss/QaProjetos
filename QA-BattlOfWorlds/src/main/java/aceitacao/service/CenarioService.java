package aceitacao.service;

import aceitacao.dto.CenarioDTO.CenarioDTO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CenarioService {

    public CenarioDTO adicionarCenario(String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/cenario";
        //  REST-ASSURED
        CenarioDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .body(jsonBody)
                .when() // Quando
                .post(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(CenarioDTO.class);
        return result;
    }

    public CenarioDTO putCenario(Integer idCenario, String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/cenario/editarCenario?id=" + idCenario;
        //  REST-ASSURED
        CenarioDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .body(jsonBody)
                .when() // Quando
                .put(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(CenarioDTO.class);
        return result;
    }

    public CenarioDTO[] getCenario(String tipoReino) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/cenario/porReino?tipoReino=" + tipoReino;
        //  REST-ASSURED
        CenarioDTO[] result = given() // Dado
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .when() // Quando
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(CenarioDTO[].class);
        return result;
    }

    public Response deleteCenario(Integer idCenario) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/cenario/" + idCenario;
        //  REST-ASSURED
        Response result = given() // Dado
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .when() // Quando
                .delete(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }
}
