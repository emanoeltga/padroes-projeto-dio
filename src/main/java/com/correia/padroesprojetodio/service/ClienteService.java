package com.correia.padroesprojetodio.service;

import com.correia.padroesprojetodio.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. 
 * podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author correia
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
