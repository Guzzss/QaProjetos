package aceitacao;

import aceitacao.dto.personagensDTO.PagePersonagemDTO;
import aceitacao.dto.personagensDTO.PersonagemDTO;
import aceitacao.dto.personagensDTO.PersonagemPageDTO;
import aceitacao.service.PersonagemService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PersonagemAceitacao {

    PersonagemService personagemService = new PersonagemService();

    public String lerJson(String caminhojson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhojson)));
    }

    @Test
    public void postPersonagem() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/PostPersonagem.json");

        PersonagemDTO resultService = personagemService.adicionarPersonagem(jsonBody);

        Assert.assertEquals(resultService.getNomePersonagem(), "55555");
    }

    @Test
    public void postClassePersonagem() {

        Integer idPersonagem = 49;
        String classePersonaegm = "MAGO";

        PersonagemDTO resultService = personagemService.adicionarClasse(idPersonagem, classePersonaegm);

        Assert.assertEquals(resultService.getClassePersonagem().getTipoClassePersonagem(), "MAGO");
        Assert.assertEquals(resultService.getId(), idPersonagem);

    }

    @Test
    public void putPersonagem() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/PostPersonagem.json");

        Integer idPersonagem = 49;

        PersonagemDTO resultService = personagemService.putPersonagem(idPersonagem, jsonBody);

        Assert.assertEquals(resultService.getNomePersonagem(), "555555");
    }

    @Test
    public void getListaDePersonagens() {
        Object ID = 68;
        PersonagemDTO[] resultService = personagemService.getListPersonagens();
        Assert.assertEquals(resultService[0].getIdJogador(), ID);
        Assert.assertEquals(resultService[0].getNomePersonagem(), "excluirrrr");
    }

    @Test
    public void getPageDePersonagens() {
        Object page = 0;
        Object size = 1;
        Object totalPages = 20;
        PagePersonagemDTO<PersonagemPageDTO> resultService = personagemService.PageDePersonagens(0, 1);
        Assert.assertEquals(resultService.getPage(), page);
        Assert.assertEquals(resultService.getSize(), size);
        Assert.assertEquals(resultService.getTotalPages(), totalPages);
    }

    @Test
    public void deletePersonagem() {
        Integer idPersonagem = 47;

        Response resultService = personagemService.deletePersonagem(idPersonagem);
        Assert.assertEquals(resultService.getStatusCode(), 200);
    }
}
