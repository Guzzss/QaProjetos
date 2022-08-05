package aceitacao.dto.personagensDTO;

import aceitacao.dto.classePersonagem.ClassePersonagemCreateDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class PersonagemPageDTO {

    private Integer id;

    private String nomePersonagem;

    private ClassePersonagemCreateDTO classePersonagemCreateDTO;
}
