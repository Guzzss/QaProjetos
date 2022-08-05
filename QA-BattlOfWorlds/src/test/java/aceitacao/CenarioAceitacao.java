package aceitacao;

import aceitacao.dto.CenarioDTO.CenarioDTO;
import aceitacao.service.CenarioService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CenarioAceitacao {

    CenarioService cenarioService = new CenarioService();

    public String lerJson(String caminhojson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhojson)));
    }

    @Test
    public void postCenario() throws IOException {
        Object idCenario = 22;
        String jsonBody = lerJson("src/test/resources/data/Cenario.json");

        CenarioDTO resultService = cenarioService.adicionarCenario(jsonBody);

        Assert.assertEquals(resultService.getNomeCenario(), "testeQa");
        Assert.assertEquals(resultService.getIdCenario(), idCenario);
    }

    @Test
    public void putCenario() throws IOException {
        Object idCenario = 19;
        String jsonBody = lerJson("src/test/resources/data/CenarioPut.json");

        CenarioDTO resultService = cenarioService.putCenario(19, jsonBody);

        Assert.assertEquals(resultService.getNomeCenario(), "testeQaEditado");
        Assert.assertEquals(resultService.getIdCenario(), idCenario);
    }

    @Test
    public void getCenarios() {
        CenarioDTO[] resultService = cenarioService.getCenario("LUZ");
        Assert.assertEquals(resultService[0].getTipoReino(), "LUZ");
    }

    @Test
    public void deleteCenario() {
        Response resultService = cenarioService.deleteCenario(13);
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }

}
