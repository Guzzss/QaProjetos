package aceitacao.dto.classePersonagem;

import lombok.Data;

@Data
public class ClassePersonagemCreateDTO{
	private int ataquePersonagem;
	private String tipoClassePersonagem;
	private int vidaPersonagem;
	private int defesaPersonagem;
}