package aceitacao.dto.jogadorDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class JogadoresListadoDTO {

    private Integer idJogador;
    private String nomeJogador;
    private String email;
}
