package aceitacao.dto.bossDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class BossDTO {
    private String nomeBoss;
    private Double vidaBoss;
    private Double ataqueBoss;
    private Double defesaBoss;
    private Integer idBoss;

}

