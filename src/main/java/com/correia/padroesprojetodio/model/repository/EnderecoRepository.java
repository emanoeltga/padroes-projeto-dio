package com.correia.padroesprojetodio.model.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.correia.padroesprojetodio.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

	public Optional<Endereco> findByCep(String cep);
}
