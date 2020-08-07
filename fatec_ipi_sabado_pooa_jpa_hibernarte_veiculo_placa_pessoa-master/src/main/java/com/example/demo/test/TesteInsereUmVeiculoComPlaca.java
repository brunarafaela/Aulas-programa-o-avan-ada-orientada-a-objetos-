package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Placa;
import com.example.demo.model.bean.Veiculo;
import com.example.demo.repository.JPAUtil;

public class TesteInsereUmVeiculoComPlaca {

	public static void main(String[] args) {

		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		Placa p = new Placa();
		p.setCidade("São Caetano do Sul");
		manager.persist(p);
		Veiculo v = new Veiculo();
		v.setModelo("Fusca");
		v.setMarca("Volkswagen");
		v.setCor("Azul");
		v.setAno(2021);
		v.setPlaca(p);
		manager.persist(v);

		transaction.commit();
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	}

	public static void fazAlgo() {
		try {

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}