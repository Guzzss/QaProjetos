package aceitacao;

import aceitacao.dto.*;
import aceitacao.service.PessoaService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PessoaAceitacao {

    PessoaService pessoaService = new PessoaService();

    public String lerJson(String caminhojson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhojson)));
    }

    @Test
    public void postPessoaComSucesso() throws IOException {

        PessoaDTO resultService = adicionarPessoaJson();
        Assert.assertEquals(resultService.getIdPessoa(), resultService.getIdPessoa());
        Assert.assertEquals(resultService.getNome(), "Gabriel Luppi");
        Assert.assertEquals(resultService.getDataNascimento(), "2003-12-08");
        Assert.assertEquals(resultService.getCpf(), "56448825002");
        Assert.assertEquals(resultService.getEmail(), "gabriel.luppi@dbccompany.com.br");
        pessoaService.deletePessoaComSucesso(resultService.getIdPessoa());
    }

    @Test
    public void postPessoaSemSucesso() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/PessoaPostSemSucesso.json");
        Object status = 400;
        List<String> errors = new ArrayList<>(List.of("nome: must not be blank"));

        ResponseErroDTO resultService = pessoaService.postPessoaSemSucesso(jsonBody);
        Assert.assertEquals(resultService.getStatus(), status);
        Assert.assertEquals(resultService.getErrors(), errors);
    }

    @Test
    public void putPessoaComSucesso() throws IOException {
        String jsonBodyPut = lerJson("src/test/resources/data/PessoaPut.json");
        PessoaDTO pessoaDTO = adicionarPessoaJson();
        PessoaDTO resultService = pessoaService.putPessoaComSucesso(pessoaDTO.getIdPessoa(), jsonBodyPut);

        Assert.assertEquals(resultService.getIdPessoa(), pessoaDTO.getIdPessoa());
        Assert.assertEquals(resultService.getNome(), "Gustavo Teichmann");
        Assert.assertEquals(resultService.getDataNascimento(), "2003-12-08");
        Assert.assertEquals(resultService.getCpf(), "56448825002");
        Assert.assertEquals(resultService.getEmail(), "gustavo.teichmann@dbcCompany.com");
        pessoaService.deletePessoaComSucesso(resultService.getIdPessoa());
    }

    @Test
    public void putPessoaSemSucesso() throws IOException {
        PessoaDTO pessoaDTO = adicionarPessoaJson();
        String jsonBody = lerJson("src/test/resources/data/PessoaPutSemSucesso.json");
        Object status = 400;
        List<String> errors = new ArrayList<>(List.of("dataNascimento: must not be null"));

        ResponseErroDTO resultService = pessoaService.putPessoaSemSucesso(pessoaDTO.getIdPessoa(), jsonBody);
        Assert.assertEquals(resultService.getStatus(), status);
        Assert.assertEquals(resultService.getErrors(), errors);
    }

    @Test
    public void deletePessoaComSucesso() throws IOException {
        PessoaDTO pessoaDTO = adicionarPessoaJson();
        Response resultService = pessoaService.deletePessoaComSucesso(pessoaDTO.getIdPessoa());
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void deletePessoaSemSucesso() {
        Response resultService = pessoaService.deletePessoaSemSucesso(33333333);
        Assert.assertEquals(resultService.getStatusCode(), 404);
    }

    @Test
    public void getPessoasByNameComSucesso() {
        PessoaDTO[] resultService = pessoaService.getPessoaByNameComSucesso("Gabriel");
        Assert.assertEquals(resultService[0].getNome(), "Gabriel Luppi");
        Assert.assertEquals(resultService[6].getNome(), "Gabriel Luppi");
        Assert.assertEquals(resultService[7].getNome(), "Gabriel Luppi");
        Assert.assertEquals(resultService[9].getNome(), "Gabriel Luppi");
    }

    @Test
    public void getPessoasByNameSemSucesso() {
        Response resultService = pessoaService.getPessoaByNameSemSucesso("sfsdghsdhfgjnfgsh");
        Assert.assertEquals(resultService.getStatusCode(), 404);
    }

    @Test
    public void getPessoasByCpfComSucesso() {
        PessoaDTO resultService = pessoaService.getPessoaByCpfComSucesso("12345678911");
        Assert.assertEquals(resultService.getCpf(), "12345678911");
    }

    @Test
    public void getPessoasByCpfSemSucesso() {
        Response resultService = pessoaService.getPessoaByCpfSemSucesso("sfsdghsdhfgjnfgsh");
        Assert.assertEquals(resultService.getStatusCode(), 404);
    }

    @Test
    public void getListarPessoasComSucesso() {
        ListarPessoasDTO resultService = pessoaService.getListarPessoasComSucesso(0, 10);
        Assert.assertEquals(resultService.getSize(), 10);
        Assert.assertEquals(resultService.getPage(), 0);
        Assert.assertEquals(resultService.getContent().get(0).getNome(), "Eduardo Miranda");
    }

    @Test
    public void getListarPessoasSemSucesso() {
            Response resultService = pessoaService.getListarPessoasSemSucesso(0, 0);
            Assert.assertEquals(resultService.getStatusCode(), 500);
    }

    @Test
    public void getRelatorioSemIdComSucesso() {
        Response resultService = pessoaService.getRelatorioSemIdComSucesso();
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void getRelatorioPorIdComSucesso() throws IOException {
        PessoaDTO pessoaDTO = adicionarPessoaJson();
        RelatorioDTO[] resultService = pessoaService.getRelatorioPorIdComSucesso(pessoaDTO.getIdPessoa());
        Assert.assertEquals(resultService[0].getNomePessoa(), "Gabriel Luppi");
        Assert.assertEquals(resultService[0].getEmail(), "gabriel.luppi@dbccompany.com.br");
        Assert.assertEquals(resultService[0].getIdPessoa(), pessoaDTO.getIdPessoa());
        Assert.assertEquals(resultService[0].getEstado(), null);
        pessoaService.deletePessoaComSucesso(pessoaDTO.getIdPessoa());
    }

    @Test
    public void getRelatorioPorIdSemSucesso() {
        Response resultService = pessoaService.getRelatorioPorIdSemSucesso(33333333);
        Assert.assertEquals(resultService.getStatusCode(), 404);
    }

//    @Test
//    public void getPessoaByDataNascimentoComSucesso() {
//        PessoaDTO[] resultService = pessoaService.getPessoaByDataNascimentoComSucesso("23/02/2003", "23/02/2007");
//    }

    @Test
    public void getPessoaListaComEnderecosComSucesso() {
        Response resultService = pessoaService.getPessoaListaComEnderecosComSucesso();
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void getPessoaListaComEnderecosPorIdComSucesso() throws IOException {
        PessoaDTO pessoaDTO = adicionarPessoaJson();
        PessoaComEnderecoDTO[] resultService = pessoaService.getPessoaListaComEnderecosPorIdComSucesso(pessoaDTO.getIdPessoa());
        Assert.assertEquals(resultService[0].getNome(), "Gabriel Luppi");
        Assert.assertEquals(resultService[0].getDataNascimento(), "2003-12-08");
        pessoaService.deletePessoaComSucesso(pessoaDTO.getIdPessoa());
    }

    @Test
    public void getPessoaListaComEnderecosPorIdSemSucesso() {
        Response resultService = pessoaService.getPessoaListaComEnderecosPorIdSemSucesso(33333333);
        Assert.assertEquals(resultService.getStatusCode(), 404);
    }

    @Test
    public void getPessoaListaComContatosSemIdComSucesso() {
        Response resultService = pessoaService.getPessoaListaComContatosSemIdComSucesso();
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void getPessoaListaComContatosPorIdComSucesso() {
        PessoaComContatosDTO[] resultService = pessoaService.getPessoaListaComContatosPorIdComSucesso(724);
        Object idContato = 129;
        Assert.assertEquals(resultService[0].getNome(), "João Andrey");
        Assert.assertEquals(resultService[0].getCpf(), "12345678911");
        Assert.assertEquals(resultService[0].getContatos().get(0).getTipoContato(), "RESIDENCIAL");
        Assert.assertEquals(resultService[0].getContatos().get(0).getTelefone(), "(66)66666-6666");
        Assert.assertEquals(resultService[0].getContatos().get(0).getDescricao(), "wts");
        Assert.assertEquals(resultService[0].getContatos().get(0).getIdContato(), idContato);
    }

    @Test
    public void getPessoaListaComContatosPorIdSemSucesso() {
        Response resultService = pessoaService.getPessoaListaComContatosPorIdSemSucesso(939849343);
        Assert.assertEquals(resultService.getStatusCode(), 404);

    }

    @Test
    public void getPessoaListaCompletaComSucesso() {
        Response resultService = pessoaService.getPessoaListaCompletaComSucesso();
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void getPessoaListaCompletaPorIdComSucesso() {
        Object idEndereco = 418;
        Object idPessoa = 1;

        PessoaCompletaDTO[] resultService = pessoaService.getPessoaListaCompletaPorIdComSucesso(1);
        Assert.assertEquals(resultService[0].getNome(), "Gabriel Luppi");
        Assert.assertEquals(resultService[0].getCpf(), "56448825002");
        Assert.assertEquals(resultService[0].getIdPessoa(), idPessoa);

        Assert.assertEquals(resultService[0].getEnderecos().get(0).getTipo(), "COMERCIAL");
        Assert.assertEquals(resultService[0].getEnderecos().get(0).getIdEndereco(), idEndereco);
        Assert.assertEquals(resultService[0].getEnderecos().get(0).getCidade(), "Porto Alegre");
        Assert.assertEquals(resultService[0].getEnderecos().get(0).getEstado(), "RS");
        Assert.assertEquals(resultService[0].getEnderecos().get(0).getPais(), "Brasil");
    }

    @Test
    public void getPessoaListaCompletaPorIdSemSucesso() {
        Response resultService = pessoaService.getPessoaListaCompletaPorIdSemSucesso(939849343);
        Assert.assertEquals(resultService.getStatusCode(), 404);
    }

    public PessoaDTO adicionarPessoaJson() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/pessoaPost.json");
        return pessoaService.postPessoaComSucesso(jsonBody);
    }

}

