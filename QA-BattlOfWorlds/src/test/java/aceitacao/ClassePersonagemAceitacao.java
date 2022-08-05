package aceitacao;

import aceitacao.dto.classePersonagem.ClassePersonagemGetDTO;
import aceitacao.service.ClassePersonagemService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassePersonagemAceitacao {

    ClassePersonagemService classePersonagemService = new ClassePersonagemService();

    @Test
    public void getClasses() {
        ClassePersonagemGetDTO[] resultService = classePersonagemService.getClasses();
        Assert.assertEquals(resultService[0].getTipoClassePersonagem(), "MAGO");
        Assert.assertEquals(resultService[1].getTipoClassePersonagem(), "GUERREIRO");
        Assert.assertEquals(resultService[2].getTipoClassePersonagem(), "GUERREIRO");
    }
}
