package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.bean.Aluno;
import com.example.demo.repository.AlunoRepository;


@Controller
public class AlunoController {

		//inversão de controle
	//injeção de dependência
	
		@Autowired
		private AlunoRepository alunoRepo;
		
		@GetMapping ("/alunos")
		public ModelAndView listarAlunos() {
			
			ModelAndView mv = new ModelAndView ("lista_alunos");
			List<Aluno> alunos = alunoRepo.findAll();
			mv.addObject(new Aluno());
			mv.addObject("alunos", alunos);
			return mv;
		}
		
		@PostMapping ("/alunos")
		public String salvar (Aluno aluno) {
			alunoRepo.save(aluno);
			return "redirect:/alunos";
		}
}
