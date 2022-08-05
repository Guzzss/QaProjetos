package aceitacao.service;

import aceitacao.dto.personagensDTO.PagePersonagemDTO;
import aceitacao.dto.personagensDTO.PersonagemDTO;
import aceitacao.dto.personagensDTO.PersonagemPageDTO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PersonagemService {

    public PersonagemDTO adicionarPersonagem(String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/personagem/adicionarPersonagem";
        PersonagemDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY2LCJyb2xlcyI6WyJST0xFX1BMQVlFUiJdLCJpYXQiOjE2NTk1NTUxMjcsImV4cCI6MTY1OTY0MTUyN30.49Mi5Si8WS7E_YxlJvwCRwnbNswhdFo_ysXdbsipX7I")
                .log().all()
                .body(jsonBody)
                .when() // Quando
                .post(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PersonagemDTO.class);
        return result;
    }

    public PersonagemDTO adicionarClasse(Integer idPersonagem, String tipoClassePersonagem) {
        String baseUrl = "   https://battle-of-worlds.herokuapp.com/personagem/novoPersonagemClasse?idPersonagem=" + idPersonagem + "&tipoClassePersonagem=" + tipoClassePersonagem;
        PersonagemDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY2LCJyb2xlcyI6WyJST0xFX1BMQVlFUiJdLCJpYXQiOjE2NTk1NTUxMjcsImV4cCI6MTY1OTY0MTUyN30.49Mi5Si8WS7E_YxlJvwCRwnbNswhdFo_ysXdbsipX7I")
                .log().all()
                .when() // Quando
                .post(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PersonagemDTO.class);
        return result;
    }


    public PersonagemDTO putPersonagem(Integer idPersonagem, String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/personagem/editar?idPersonagem=" + idPersonagem;
        PersonagemDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY2LCJyb2xlcyI6WyJST0xFX1BMQVlFUiJdLCJpYXQiOjE2NTk1NTUxMjcsImV4cCI6MTY1OTY0MTUyN30.49Mi5Si8WS7E_YxlJvwCRwnbNswhdFo_ysXdbsipX7I")
                .body(jsonBody)
                .when() // Quando
                .put(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PersonagemDTO.class);
        return result;
    }

    public PersonagemDTO[] getListPersonagens (){ // STAFF
        String baseUrl = "https://battle-of-worlds.herokuapp.com/personagem/list";

        //  REST-ASSURED
        PersonagemDTO[] result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PersonagemDTO[].class);
        return result;
    }

    public Response deletePersonagem (Integer idPersonagem){ // STAFF
        String baseUrl = "https://battle-of-worlds.herokuapp.com/personagem/deletar?idPersonagem=" + idPersonagem;

        //  REST-ASSURED
        Response result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .delete(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public PagePersonagemDTO<PersonagemPageDTO> PageDePersonagens(Integer paginas, Integer registros) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/personagem/listarTodos?paginas=" + paginas + "&registros=" + registros;
        PagePersonagemDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PagePersonagemDTO.class);
        return result;
    }
}

