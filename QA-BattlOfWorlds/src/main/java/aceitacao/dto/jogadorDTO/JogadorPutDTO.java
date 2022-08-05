package aceitacao.dto.jogadorDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties

public class JogadorPutDTO {

    private String idJogador;
    private String nomeJogador;
    private String email;

}
