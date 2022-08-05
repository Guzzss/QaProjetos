package aceitacao.dto.batalhaDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class RelatorioDeBatalha {

    private HeaderDTO headers;
    private List<RelatorioBatalhaBodyDTO> body;
    private Integer statusCodeValue;
    private String statusCode;

}
