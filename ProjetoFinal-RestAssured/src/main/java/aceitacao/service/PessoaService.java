package aceitacao.service;

import aceitacao.dto.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PessoaService {

    String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ2ZW1zZXItYXBpIiwianRpIjoiNDAwIiwiY2FyZ29zIjpbXSwiaWF0IjoxNjU5NzQyMTExLCJleHAiOjE2NTk4Mjg1MTF9.oKgvU4plC6XSnZh07TGbGk7EiIjwYCGJeyu8S7am2jw";

    String baseUrl = "http://dbc-pessoa-api.herokuapp.com";

    public PessoaDTO postPessoaComSucesso(String jsonBody) {
        String url = baseUrl + "/pessoa";
        PessoaDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .log().all()
                .body(jsonBody)
                .when() // Quando
                .post(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PessoaDTO.class);
        return result;
    }

    public ResponseErroDTO postPessoaSemSucesso(String jsonBody) {
        String url = baseUrl + "/pessoa";
        ResponseErroDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .log().all()
                .body(jsonBody)
                .when() // Quando
                .post(url)
                .then() // Então
                .log()
                .all()
                .statusCode(400) // Extração do resultado
                .extract().as(ResponseErroDTO.class);
        return result;
    }

    public PessoaDTO putPessoaComSucesso(Integer idPessoa, String jsonBody) {
        String url = baseUrl + "/pessoa/" + idPessoa;
        PessoaDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .log().all()
                .body(jsonBody)
                .when() // Quando
                .put(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PessoaDTO.class);
        return result;
    }

    public ResponseErroDTO putPessoaSemSucesso(Integer idPessoa, String jsonBody) {
        String url = baseUrl + "/pessoa/" + idPessoa;
        ResponseErroDTO result = given() // Dado
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .log().all()
                .body(jsonBody)
                .when() // Quando
                .put(url)
                .then() // Então
                .log()
                .all()
                .statusCode(400) // Extração do resultado
                .extract().as(ResponseErroDTO.class);
        return result;
    }

    public Response deletePessoaComSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/" + idPessoa;
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .delete(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public Response deletePessoaSemSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/" + idPessoa;
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .delete(url)
                .then() // Então
                .log()
                .all()
                .statusCode(404) // Extração do resultado
                .extract().response();
        return result;
    }

    public PessoaDTO[] getPessoaByNameComSucesso(String name) {
        String url = baseUrl + "/pessoa/byname?nome=" + name;
        PessoaDTO[] result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PessoaDTO[].class);
        return result;
    }

    public Response getPessoaByNameSemSucesso(String name) {
        String url = baseUrl + "/pessoa/byname?nome=" + name;
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(404) // Extração do resultado
                .extract().response();
        return result;
    }

    public PessoaDTO getPessoaByCpfComSucesso(String cpf) {
        String url = baseUrl + "/pessoa/" + cpf + "/cpf";
        PessoaDTO result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PessoaDTO.class);
        return result;
    }

    public Response getPessoaByCpfSemSucesso(String cpf) {
        String url = baseUrl + "/pessoa/" + cpf + "/cpf";
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(404) // Extração do resultado
                .extract().response();
        return result;
    }

    public ListarPessoasDTO getListarPessoasComSucesso(Integer pagina, Integer tamanhoDasPaginas) {
        String url = baseUrl + "/pessoa?pagina=" + pagina + "&tamanhoDasPaginas=" + tamanhoDasPaginas;
        ListarPessoasDTO result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(ListarPessoasDTO.class);
        return result;
    }

    public Response getListarPessoasSemSucesso(Integer pagina, Integer tamanhoDasPaginas) {
        String url = baseUrl + "/pessoa?pagina=" + pagina + "&tamanhoDasPaginas=" + tamanhoDasPaginas;
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(500) // Extração do resultado
                .extract().response();
        return result;
    }

    public Response getRelatorioSemIdComSucesso() {
        String url = baseUrl + "/pessoa/relatorio";
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public RelatorioDTO[] getRelatorioPorIdComSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/relatorio?idPessoa=" + idPessoa;
        RelatorioDTO[] result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(RelatorioDTO[].class);
        return result;
    }

    public Response getRelatorioPorIdSemSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/relatorio?idPessoa=" + idPessoa;
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(404) // Extração do resultado
                .extract().response();
        return result;
    }

    public PessoaDTO[] getPessoaByDataNascimentoComSucesso(String data, String dtFinal) {
        String url = baseUrl + "/pessoa/data-nascimento?data=" + data + "&dtFinal=" + dtFinal;
        System.out.println(url);
        PessoaDTO[] result = given() // Dado
                .header("Authorization", token)
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200)
                .extract().as(PessoaDTO[].class);
        return result;
    }

    public Response getPessoaListaComEnderecosComSucesso() {
        String url = baseUrl + "/pessoa/lista-com-enderecos";
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public PessoaComEnderecoDTO[] getPessoaListaComEnderecosPorIdComSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/lista-com-enderecos?idPessoa=" + idPessoa;
        PessoaComEnderecoDTO[] result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PessoaComEnderecoDTO[].class);
        return result;
    }

    public Response getPessoaListaComEnderecosPorIdSemSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/lista-com-enderecos?idPessoa=" + idPessoa;
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(404) // Extração do resultado
                .extract().response();
        return result;
    }

    public Response getPessoaListaComContatosSemIdComSucesso() {
        String url = baseUrl + "/pessoa/lista-com-contatos";
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public PessoaComContatosDTO[] getPessoaListaComContatosPorIdComSucesso(Integer IdPessoa) {
        String url = baseUrl + "/pessoa/lista-com-contatos?idPessoa=" + IdPessoa;
        PessoaComContatosDTO[] result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PessoaComContatosDTO[].class);
        return result;
    }

    public Response getPessoaListaComContatosPorIdSemSucesso(Integer IdPessoa) {
        String url = baseUrl + "/pessoa/lista-com-contatos?idPessoa=" + IdPessoa;

        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(404) // Extração do resultado
                .extract().response();
        return result;
    }

    public Response getPessoaListaCompletaComSucesso() {
        String url = baseUrl + "/pessoa/lista-completa";
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().response();
        return result;
    }

    public PessoaCompletaDTO[] getPessoaListaCompletaPorIdComSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/lista-completa?idPessoa=" + idPessoa;
        PessoaCompletaDTO[] result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(200) // Extração do resultado
                .extract().as(PessoaCompletaDTO[].class);
        return result;
    }

    public Response getPessoaListaCompletaPorIdSemSucesso(Integer idPessoa) {
        String url = baseUrl + "/pessoa/lista-completa?idPessoa=" + idPessoa;
        Response result = given() // Dado
                .header("Authorization", token)
                .log().all()
                .when() // Quando
                .get(url)
                .then() // Então
                .log()
                .all()
                .statusCode(404) // Extração do resultado
                .extract().response();
        return result;
    }
}


