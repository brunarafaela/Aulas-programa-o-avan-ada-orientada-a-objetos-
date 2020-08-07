package com.bruna.model.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	public List <Cidade> findByLatitudeAndLongitude (String latitude, String longitude);
	
	public List <Cidade> queryByNome (String nome);
	
	public List <Cidade> findByNomeIgnoreCase (String nome);
}
