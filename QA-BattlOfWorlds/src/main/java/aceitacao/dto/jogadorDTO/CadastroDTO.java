package aceitacao.dto.jogadorDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class CadastroDTO {

    private String nomeJogador;
    private String email;
    private String senha;
    private String idJogador;
}
