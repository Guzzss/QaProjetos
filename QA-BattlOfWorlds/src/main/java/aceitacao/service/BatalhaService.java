package aceitacao.service;

import aceitacao.dto.batalhaDTO.BatalhaDTO;
import aceitacao.dto.batalhaDTO.BatalhaPageDTO;
import aceitacao.dto.batalhaDTO.RelatorioDeBatalha;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class BatalhaService {

    public BatalhaDTO adicionarBatalha(String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/batalha/iniciar";
        //  REST-ASSURED
        BatalhaDTO result = given() // Dado
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
                .extract().as(BatalhaDTO.class);
        return result;
    }

    public Response fugir(Integer idBatalha) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/batalha/fugir?idBatalha=" + idBatalha;
        //  REST-ASSURED
        Response result = given() // Dado
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .when() // Quando
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public Response defender(Integer idBatalha) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/batalha/defender?idBatalha=" + idBatalha;
        //  REST-ASSURED
        Response result = given() // Dado
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .when() // Quando
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public Response atacar(Integer idBatalha) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/batalha/atacar?idBatalha=" + idBatalha;
        //  REST-ASSURED
        Response result = given() // Dado
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .when() // Quando
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public Response deleteBatalha(Integer idBatalha) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/batalha/deletar?id=" + idBatalha;
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

    public List<BatalhaPageDTO> PageDeBatalhas(Integer paginas, Integer registros) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/batalha/listarTodos?paginas=" + paginas + "&registros=" + registros;
        List<BatalhaPageDTO> result = new ArrayList<>(
                given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().body().jsonPath().getList("content", BatalhaPageDTO.class));
        return result;
    }

    public RelatorioDeBatalha RelatorioDeBatalhas(Integer idBatalha) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/batalha/relatorio-batalha?idBatalha=" + idBatalha;
        RelatorioDeBatalha result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(RelatorioDeBatalha.class);
        return result;

    }
}

