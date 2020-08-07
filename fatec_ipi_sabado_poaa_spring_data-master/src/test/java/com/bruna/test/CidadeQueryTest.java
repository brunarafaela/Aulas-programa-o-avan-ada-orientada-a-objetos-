package com.bruna.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bruna.model.bean.Cidade;
import com.bruna.model.repository.CidadeRepository;


@RunWith (SpringRunner.class)
@SpringBootTest
public class CidadeQueryTest {

	@Autowired
	private CidadeRepository repo;
	
	@Test
	public void testFindByNome () {
		System.out.println(repo.queryByNome("São Bernardo do Campo"));
	}
	
	@Test
	public void testFindByNomeComIgnoreCase () {
		System.out.println(repo.findByNomeIgnoreCase("SÃO CAETANO DO SUL"));
	}
	
	@Test
	public void testFindByLatitudeELongitude () { 
		System.out.println(repo.findByLatitudeAndLongitude ("-23.6666", "-46.5322"));
	}
	
	@Test
	public void testBuscaPorId() {
		Optional <Cidade> c = repo.findById(1L);
				System.out.println(c.get());
	}
	
	@Test 
	public void testQuantidade() {
		System.out.println("Count:" +  repo.count());
	}

}
