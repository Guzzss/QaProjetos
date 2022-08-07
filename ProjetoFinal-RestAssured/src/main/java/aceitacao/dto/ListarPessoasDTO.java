package aceitacao.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class ListarPessoasDTO{

	private int size;
	private int totalPages;
	private int page;
	private List<PessoaDTO> content;
	private int totalElements;

}