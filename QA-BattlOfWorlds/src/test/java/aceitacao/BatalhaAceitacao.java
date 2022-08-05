package aceitacao;

import aceitacao.dto.batalhaDTO.BatalhaDTO;
import aceitacao.dto.batalhaDTO.BatalhaPageDTO;
import aceitacao.dto.batalhaDTO.RelatorioDeBatalha;
import aceitacao.service.BatalhaService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BatalhaAceitacao {

    BatalhaService batalhaService = new BatalhaService();

    public String lerJson(String caminhojson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhojson)));
    }


    @Test
    public void postBatalha() throws IOException {
        Object idCenario = 19;
        String jsonBody = lerJson("src/test/resources/data/Batalha.json");

        BatalhaDTO resultService = batalhaService.adicionarBatalha(jsonBody);

        Assert.assertEquals(resultService.getStatus(), "Em andamento");
        Assert.assertEquals(resultService.getIdCenario(), idCenario);
    }

    @Test
    public void fugir() {
        Response resultService = batalhaService.fugir(25);
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void defender() {
        Response resultService = batalhaService.defender(22);
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void atacar() {
        Response resultService = batalhaService.atacar(22);
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void deleteBatalha() {
        Response resultService = batalhaService.deleteBatalha(25);
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

    @Test
    public void PageDeBatalhas() {
        List<BatalhaPageDTO> resultService = batalhaService.PageDeBatalhas(0, 1);
    }

    @Test
    public void relatorioDeBatalhas() {
        Object StatusCodeValue = 200;
        RelatorioDeBatalha resultService = batalhaService.RelatorioDeBatalhas(22);
        Assert.assertEquals(resultService.getStatusCodeValue(), StatusCodeValue);
        Assert.assertEquals(resultService.getStatusCode(), "OK");
    }
}
