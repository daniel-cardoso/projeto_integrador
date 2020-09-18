package com.procausas.redeProCausas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.procausas.redeProCausas.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByTemaDescricaoContainingIgnoreCase (String temaDescricao);

}
