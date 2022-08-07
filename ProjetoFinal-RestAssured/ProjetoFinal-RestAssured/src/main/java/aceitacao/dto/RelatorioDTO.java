package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class RelatorioDTO{

	private String nomePet;
	private Integer idPessoa;
	private String cidade;
	private String estado;
	private String nomePessoa;
	private String numeroContato;
	private String email;
	private String cep;
	private String pais;

}