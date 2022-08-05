package aceitacao.dto.batalhaDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageBatalhaDTO<BatalhaPageDTO> {

    private Long totalElements;
    private Integer totalPages;
    private Integer page;
    private Integer size;
    private List<BatalhaPageDTO> content;
}
