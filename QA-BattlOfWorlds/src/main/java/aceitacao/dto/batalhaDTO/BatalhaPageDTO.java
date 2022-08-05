package aceitacao.dto.batalhaDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class BatalhaPageDTO {

    private Integer idBatalha;

    private String status;

    private Integer roundBatalha;
}
