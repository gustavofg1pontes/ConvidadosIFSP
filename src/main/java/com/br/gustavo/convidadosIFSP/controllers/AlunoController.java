package com.br.gustavo.convidadosIFSP.controllers;

import com.br.gustavo.convidadosIFSP.dtos.AlunoDTO;
import com.br.gustavo.convidadosIFSP.models.Aluno;
import com.br.gustavo.convidadosIFSP.services.AlunoService;
import com.br.gustavo.convidadosIFSP.services.ConvidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
    @Autowired
    private ConvidadoService convidadoService;

    @PostMapping(value = "/cadastro")
    public void save(@RequestBody Aluno aluno){
        this.alunoService.save(aluno);
    }

    @GetMapping(value = "/{id}")
    public AlunoDTO findById(@PathVariable Long id){
        return alunoService.findById(id);
    }

    @GetMapping
    public List<AlunoDTO> findAll(){
        return alunoService.findAll();
    }
}
