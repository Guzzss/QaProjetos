package aceitacao.dto.classePersonagem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class ClassePersonagemDTO {
    private Integer id;
    private String tipoClassePersonagem;
    private Double vidaPersonagem;
    private Double defesaPersonagem;
    private Double ataquePersonagem;
}
