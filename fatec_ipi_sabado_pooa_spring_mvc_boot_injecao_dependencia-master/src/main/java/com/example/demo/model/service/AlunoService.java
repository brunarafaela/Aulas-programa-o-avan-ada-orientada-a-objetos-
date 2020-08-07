package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.bean.Aluno;
import com.example.demo.model.repository.AlunoRepository;
import com.example.demo.model.utils.Calculadora;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Aluno aluno) {
		alunoRepo.save(aluno);
	}
	
	public List <Aluno> listarTodos(){
		List<Aluno> lista = alunoRepo.findAll();
	for (Aluno aluno : lista ) {
		aluno.setMediaFinal(calculadora.calculaMedia(aluno.getNota1(), aluno.getNota2()));
	}
	return lista;
	}
	
}
