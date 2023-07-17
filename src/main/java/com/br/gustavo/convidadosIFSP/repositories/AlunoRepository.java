package com.br.gustavo.convidadosIFSP.repositories;

import com.br.gustavo.convidadosIFSP.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
