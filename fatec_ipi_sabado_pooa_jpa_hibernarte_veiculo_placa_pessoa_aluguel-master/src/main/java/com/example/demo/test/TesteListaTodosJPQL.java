package com.example.demo.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.repository.JPAUtil;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Veiculo");
		List <Veiculo> Veiculos = query.getResultList();
		for (Veiculo v: Veiculos) {
			System.out.println(v);
		}

		manager.close();
		JPAUtil.close();
	}

}
