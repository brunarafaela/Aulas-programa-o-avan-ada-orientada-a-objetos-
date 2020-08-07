package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.bean.Aluno;
import com.example.demo.model.service.AlunoService;


@Controller
public class AlunoController {

		//inversão de controle
	   //injeção de dependência
	
	//	@Autowired
	//	private AlunoRepository alunoRepo;
		
		//@Autowired
		//public AlunoController (AlunoRepository repository) {
		//}
		
		//@Autowired
		//public void setAlunoRepository (AlunoRepository alunoRepo) {
		//	this.alunoRepo = alunoRepo;
		//}
		
		
		@Autowired
		private AlunoService alunoService;
		
		
		@GetMapping ("/alunos")
		public ModelAndView listarAlunos() {
			
			ModelAndView mv = new ModelAndView ("lista_alunos");
			List<Aluno> alunos = alunoService.listarTodos();
			mv.addObject(new Aluno());
			mv.addObject("alunos", alunos);
			return mv;
		}
		
		@PostMapping ("/alunos")
		public String salvar (Aluno aluno) {
			alunoService.salvar(aluno);
			return "redirect:/alunos";
		}
}
