package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class PessoaComContatosDTO {

	private Integer idPessoa;
	private List<ContatoDTO> contatos;
	private String cpf;
	private String nome;
	private String dataNascimento;
	private String email;

}