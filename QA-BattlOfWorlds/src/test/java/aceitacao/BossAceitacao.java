package aceitacao;

import aceitacao.dto.bossDTO.BossDTO;
import aceitacao.service.BossService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BossAceitacao {

    BossService bossService = new BossService();
    public String lerJson(String caminhojson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhojson)));
    }

    @Test
    public void postBoss() throws IOException {
        Object idBoss = 18;
        String jsonBody = lerJson("src/test/resources/data/Boss.json");

        BossDTO resultService = bossService.adicionarBoss(jsonBody);

        Assert.assertEquals(resultService.getNomeBoss(), "Narigudo");
        Assert.assertEquals(resultService.getIdBoss(), idBoss);
    }

    @Test
    public void putBoss() throws IOException {
        Object idBoss = 15;
        String jsonBody = lerJson("src/test/resources/data/BossEditado.json");

        BossDTO resultService = bossService.putBoss(15, jsonBody);

        Assert.assertEquals(resultService.getNomeBoss(), "BossEditado");
        Assert.assertEquals(resultService.getIdBoss(), idBoss);
    }

    @Test
    public void getBosses() {
        BossDTO[] resultService = bossService.getBoss();
        Assert.assertEquals(resultService[0].getNomeBoss(), "BossSombrio");
        Assert.assertEquals(resultService[1].getNomeBoss(), "StarBoss");
        Assert.assertEquals(resultService[2].getNomeBoss(), "string");

    }

    @Test
    public void deleteBosses() {
        Response resultService = bossService.deleteBoss(2);
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }
}
