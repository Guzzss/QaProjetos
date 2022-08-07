package aceitacao;

import aceitacao.dto.jogadorDTO.*;
import aceitacao.service.JogadorService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JogadorAceitacao {

     JogadorService jogadorService = new JogadorService();

        public String lerJson(String caminhojson) throws IOException {
            return new String(Files.readAllBytes(Paths.get(caminhojson)));
        }

    @Test
    public void postJogador() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/Jogador.json");

        CadastroDTO resultService = jogadorService.adicionarUser(jsonBody);

        Assert.assertEquals(resultService.getNomeJogador(), "Batata2");
        Assert.assertEquals(resultService.getEmail(), "gustavo_teichmann@outlook.com");
        Assert.assertEquals(resultService.getSenha(), resultService.getSenha());
    }

    @Test
    public void getListaDeJogadores() {
        Object idJogadorIndiceZero = 24;

        JogadoresListadoDTO[] resultService = jogadorService.getListaDeJogadores();
        Assert.assertEquals(resultService[0].getNomeJogador(), "strinwg");
        Assert.assertEquals(resultService[0].getIdJogador(), idJogadorIndiceZero);
        Assert.assertEquals(resultService[0].getEmail(), "string@gmail.com");
        Assert.assertEquals(resultService[1].getNomeJogador(), "novoPlayer");
    }

    @Test
    public void getRelatorioJogadores() {
        RelatorioJogadoresDTO[] resultService = jogadorService.relatorioJogadores();
        Assert.assertEquals(resultService[0].getNomeJogador(), "legolas123");
        Assert.assertEquals(resultService[0].getEmail(), "string@gmail.com");
        Assert.assertEquals(resultService[0].getTipoClassePersonagem(), "GUERREIRO");
        Assert.assertEquals(resultService[1].getNomeJogador(), "lego123");
        Assert.assertEquals(resultService[1].getEmail(), "string@gmail.com");
        Assert.assertEquals(resultService[1].getTipoClassePersonagem(), "GUERREIRO");
    }


    @Test
    public void getRelatorioJogadoresPorId() {
        Object idJogador = 13;
        Object qtdePersonagens = 1;
        RelatorioJogadoresDTO[] resultService = jogadorService.relatorioJogadoresPorId(13);
        Assert.assertEquals(resultService[0].getIdJogador(), idJogador);
        Assert.assertEquals(resultService[0].getNomeJogador(), "gustavoTeste");
        Assert.assertEquals(resultService[0].getEmail(), "gustavo_teichmann@outlook.co");
        Assert.assertEquals(resultService[0].getQuantidadePersonagems(), qtdePersonagens);
        Assert.assertEquals(resultService[0].getTipoClassePersonagem(), "ELFO");
    }

    @Test
    public void getJogadorLogado() {
        JogadorLogadoDTO resultService = jogadorService.getJogadorLogado();
        Assert.assertEquals(resultService.getNomeJogador(), "testandoput1");
        Assert.assertEquals(resultService.getEmail(), "gustavo_teichmann@outlook.com");
    }


    @Test
    public void deleteJogadorLogado() {
        Response resultService = jogadorService.deleteJogadorLogado();
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

//    @Test
//    public void putJogador() throws IOException {
//        String jsonBody = lerJson("src/test/resources/data/JogadorPut.json");
//
//        JogadorPutDTO resultService = jogadorService.putJogadorLogado(jsonBody);
//
//        Assert.assertEquals(resultService.getNomeJogador(), "testandoput2");
//        Assert.assertEquals(resultService.getEmail(), "gustavo_teichmann@outlook.com");
//    }
}
