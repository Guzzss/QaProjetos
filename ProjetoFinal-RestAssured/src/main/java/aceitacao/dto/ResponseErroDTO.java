package aceitacao.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class ResponseErroDTO {
	private List<String> errors;
	private String timestamp;
	private Integer status;
}