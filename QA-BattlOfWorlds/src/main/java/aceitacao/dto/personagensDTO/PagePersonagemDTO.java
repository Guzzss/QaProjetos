package aceitacao.dto.personagensDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PagePersonagemDTO<PersonagemPageDTO> {
    private Long totalElements;
    private Integer totalPages;
    private Integer page;
    private Integer size;
    private List<PersonagemPageDTO> content;
}
