package br.com.anakarolini.clientepetservico.cliente.application.repository;

import br.com.anakarolini.clientepetservico.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}