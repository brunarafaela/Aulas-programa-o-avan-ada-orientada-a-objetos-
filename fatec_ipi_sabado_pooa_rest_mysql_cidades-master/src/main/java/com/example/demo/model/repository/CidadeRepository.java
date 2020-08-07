package com.example.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	 @Query
	    ("SELECT c FROM Cidade c WHERE c.latitude = ?1 AND c.longitude = ?2")
	public Cidade getByLatiLongi(String latitude, String longitude);

	 @Query
	    ("SELECT c FROM Cidade c WHERE c.nome LIKE ?1%")
	 public List<Cidade> getByLetra(String nome);

}
