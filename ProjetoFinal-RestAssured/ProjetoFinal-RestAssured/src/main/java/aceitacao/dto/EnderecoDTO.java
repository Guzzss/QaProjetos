package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class EnderecoDTO{
	private Integer idPessoa;
	private String tipo;
	private String cidade;
	private String estado;
	private String complemento;
	private Integer numero;
	private String logradouro;
	private String cep;
	private String pais;
	private Integer idEndereco;
}