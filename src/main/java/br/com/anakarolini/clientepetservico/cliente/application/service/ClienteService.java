package br.com.anakarolini.clientepetservico.cliente.application.service;

import br.com.anakarolini.clientepetservico.cliente.application.api.ClienteRequest;
import br.com.anakarolini.clientepetservico.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}