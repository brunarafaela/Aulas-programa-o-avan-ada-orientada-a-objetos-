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
public class CidadeTest {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Test
	public void testInsertCidade1() {
		Cidade c = new Cidade ();
		c.setNome("São Caetano do Sul");
		c.setLatitude("-23.6226");
		c.setLongitude("-46.5489");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}
	
	
	@Test
	public void testInsertCidade2() {
		Cidade c = new Cidade ();
		c.setNome("São Bernardo do Campo");
		c.setLatitude("-23.6944");
		c.setLongitude("-46.5654");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}
	
	
	@Test
	public void testInsertCidade3() {
		Cidade c = new Cidade ();
		c.setNome("Santo André");
		c.setLatitude("-23.6666");
		c.setLongitude("-46.5322");
		c = cidadeRepository.save(c);
		System.out.println(c.getId());
	}
}
