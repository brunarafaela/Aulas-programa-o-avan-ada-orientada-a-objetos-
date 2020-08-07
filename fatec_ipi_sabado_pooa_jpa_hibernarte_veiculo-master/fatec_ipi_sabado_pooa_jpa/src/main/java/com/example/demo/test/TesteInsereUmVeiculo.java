package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.repository.JPAUtil;

public class TesteInsereUmVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		Veiculo v = new Veiculo();
		v.setModelo("Fusca");
		v.setMarca("Volks");
		v.setCor("Azul");

		manager.persist(v);

		transaction.commit();
		
		System.out.println(v);
		
		manager.close();
		JPAUtil.close();

	}

}