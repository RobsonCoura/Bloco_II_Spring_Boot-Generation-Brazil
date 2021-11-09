package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public java.util.List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
