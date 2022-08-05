package aceitacao.dto.batalhaDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class BatalhaDTO {
    private Integer idCenario;
    private Integer idPersonagem;
    private Integer idBoss;
    private String status;
    private Integer roundBatalha;
    private Integer idBatalha;

}
