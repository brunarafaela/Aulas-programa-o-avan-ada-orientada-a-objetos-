package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.VeiculoRepository;
import com.example.demo.model.utils.Calculadora;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Veiculo veiculo) {
		veiculoRepo.save(veiculo);
	}
	
	public List <Veiculo> listarTodos(){
		List<Veiculo> lista = veiculoRepo.findAll();
	for (Veiculo veiculo : lista ) {
		veiculo.setAutonomia(calculadora.Autonomia(veiculo.getTanque(), veiculo.getMedida()));
	}
	return lista;
	}
	
}
