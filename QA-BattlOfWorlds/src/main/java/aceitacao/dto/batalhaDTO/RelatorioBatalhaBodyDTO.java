package aceitacao.dto.batalhaDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class RelatorioBatalhaBodyDTO {

    private Integer idBatalha;
    private Integer roundBatalha;
    private String nomeBoss;
    private Double vidaBoss;
    private String tipoReino;
    private String nomePersonagem;
    private String tipoClassePersonagem;
    private Double vidaPersonagem;
}
