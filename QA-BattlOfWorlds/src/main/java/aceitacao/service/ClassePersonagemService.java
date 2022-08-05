package aceitacao.service;

import aceitacao.dto.classePersonagem.ClassePersonagemGetDTO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class ClassePersonagemService {

    public ClassePersonagemGetDTO[] getClasses() {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/classePersonagem";
        //  REST-ASSURED
        ClassePersonagemGetDTO[] result = given() // Dado
                .contentType(ContentType.JSON)
                .log().all()
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .when() // Quando
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(ClassePersonagemGetDTO[].class);
        return result;
    }
}
