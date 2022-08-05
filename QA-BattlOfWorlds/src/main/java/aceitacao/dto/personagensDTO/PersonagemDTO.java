package aceitacao.dto.personagensDTO;

import aceitacao.dto.classePersonagem.ClassePersonagemDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class PersonagemDTO {

    private String nomePersonagem;
    private Integer id;
    private Integer idJogador;
    private ClassePersonagemDTO classePersonagem;

}
