package com.example.demo.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.bean.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
