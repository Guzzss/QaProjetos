package aceitacao.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class PessoaComEnderecoDTO{

	private Integer idPessoa;
	private List<EnderecoDTO> enderecos;
	private String cpf;
	private String nome;
	private String dataNascimento;
	private String email;

}