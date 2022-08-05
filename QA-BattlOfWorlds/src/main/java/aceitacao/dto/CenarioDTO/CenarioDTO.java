package aceitacao.dto.CenarioDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.joda.time.DateTime;

import java.util.Date;

@Data
@JsonIgnoreProperties
public class CenarioDTO {

    private String nomeCenario;
    private String tipoReino;
    private Date horario;
    private Integer idCenario;
}
