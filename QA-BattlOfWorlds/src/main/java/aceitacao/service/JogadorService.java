package aceitacao.service;

import aceitacao.dto.jogadorDTO.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class JogadorService {


    public CadastroDTO adicionarUser(String jsonBody) {
        String baseUrl = "https://battle-of-worlds.herokuapp.com/auth/cadastro";
        //  REST-ASSURED
        CadastroDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when() // Quando
                .post(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(CadastroDTO.class);
        return result;
    }

    public JogadorLogadoDTO getJogadorLogado (){
        String baseUrl = "https://battle-of-worlds.herokuapp.com/jogador/jogadorLogado";

        //  REST-ASSURED
        JogadorLogadoDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY2LCJyb2xlcyI6WyJST0xFX1BMQVlFUiJdLCJpYXQiOjE2NTk1NTUxMjcsImV4cCI6MTY1OTY0MTUyN30.49Mi5Si8WS7E_YxlJvwCRwnbNswhdFo_ysXdbsipX7I")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(JogadorLogadoDTO.class);
        return result;
    }

    public JogadoresListadoDTO[] getListaDeJogadores(){
        String baseUrl = "https://battle-of-worlds.herokuapp.com/jogador/listarTodos";

        //  REST-ASSURED
        JogadoresListadoDTO[] result = given() // Dado
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(JogadoresListadoDTO[].class);
        return result;
    }

    public RelatorioJogadoresDTO[] relatorioJogadores(){
        String baseUrl = "https://battle-of-worlds.herokuapp.com/jogador/relatorio";

        //  REST-ASSURED
        RelatorioJogadoresDTO[] result = given() // Dado
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(RelatorioJogadoresDTO[].class);
        return result;
    }

    public RelatorioJogadoresDTO[] relatorioJogadoresPorId(Integer id){
        String baseUrl = "https://battle-of-worlds.herokuapp.com/jogador/relatorio?id=" + id;

        //  REST-ASSURED
        RelatorioJogadoresDTO[] result = given() // Dado
                .header("Authorization" ,"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0")
                .get(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(RelatorioJogadoresDTO[].class);
        return result;
    }

    public Response deleteJogadorLogado (){
        String baseUrl = "https://battle-of-worlds.herokuapp.com/jogador/delete";

        //  REST-ASSURED
        Response result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY1LCJyb2xlcyI6WyJST0xFX1BMQVlFUiJdLCJpYXQiOjE2NTk1NTQ5ODQsImV4cCI6MTY1OTY0MTM4NH0.8pmVkCdZgUNyw7UlWiNQmS3jxkkSgWb5xXM4tC0lp5Y")
                .delete(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public JogadorPutDTO putJogadorLogado (String jsonBody){
        String baseUrl = "https://battle-of-worlds.herokuapp.com/jogador/atualiza";

        //  REST-ASSURED
        JogadorPutDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization" , "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY2LCJyb2xlcyI6WyJST0xFX1BMQVlFUiJdLCJpYXQiOjE2NTk1NTUxMjcsImV4cCI6MTY1OTY0MTUyN30.49Mi5Si8WS7E_YxlJvwCRwnbNswhdFo_ysXdbsipX7I")
                .body(jsonBody)
                .put(baseUrl)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(JogadorPutDTO.class);
        return result;
    }

}



// eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJiYXR0bGUtb2Ytd29ybGQiLCJqdGkiOjY4LCJyb2xlcyI6WyJST0xFX1NUQUZGIl0sImlhdCI6MTY1OTU3MDIxNiwiZXhwIjoxNjU5NjU2NjE2fQ.C9D8MstgjoCBTmKwiiHRQ0sn2SxFgDCAwEd2LmQW-i0