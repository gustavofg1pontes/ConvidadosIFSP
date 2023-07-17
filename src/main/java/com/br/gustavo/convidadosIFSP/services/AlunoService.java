package com.br.gustavo.convidadosIFSP.services;

import com.br.gustavo.convidadosIFSP.dtos.AlunoDTO;
import com.br.gustavo.convidadosIFSP.models.Aluno;
import com.br.gustavo.convidadosIFSP.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public void save(Aluno aluno){
        this.alunoRepository.save(aluno);
    }

    @Transactional(readOnly = true)
    public List<AlunoDTO> findAll(){
        return alunoRepository.findAll().stream().map(AlunoDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public AlunoDTO findById(Long id){
        return new AlunoDTO(alunoRepository.findById(id).get());
    }
}
