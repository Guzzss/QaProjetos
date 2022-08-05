package aceitacao.service;

import aceitacao.dto.bossDTO.BossDTO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BossService {

    public BossDTO adicionarBoss(String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/boss/adiciona";
        //  REST-ASSURED
        BossDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .log().all().header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .body(jsonBody)
                .when() // Quando
                .post(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(BossDTO.class);
        return result;
    }

    public BossDTO putBoss(Integer idBoss, String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/boss/editar?id=" + idBoss;
        //  REST-ASSURED
        BossDTO result = given() // Dado
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
                .extract().as(BossDTO.class);
        return result;
    }
    public BossDTO[] getBoss() {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/boss/listar";
        //  REST-ASSURED
        BossDTO[] result = given() // Dado
                .contentType(ContentType.JSON)
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .when() // Quando
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(BossDTO[].class);
        return result;
    }

    public Response deleteBoss(Integer idBoss) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/boss/deletar?id=" + idBoss;
        //  REST-ASSURED
        Response result = given() // Dado
                .contentType(ContentType.JSON)
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
