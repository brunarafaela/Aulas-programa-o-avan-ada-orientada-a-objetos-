package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Placa;
import com.example.demo.repository.JPAUtil;

public class TesteRemoveUmVeiculoComPlaca {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa p = manager.find(Placa.class, 1L);
		manager.remove(p);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}