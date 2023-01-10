package br.com.anakarolini.clientepetservico.cliente.application.api;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.anakarolini.clientepetservico.cliente.domain.Sexo;
import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@CPF
	@Column(unique = true)
	private String cpf; 
	@NotNull
	private String endereco;
}