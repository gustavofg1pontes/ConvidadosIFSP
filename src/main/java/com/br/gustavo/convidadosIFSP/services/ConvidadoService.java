package com.br.gustavo.convidadosIFSP.services;


import com.br.gustavo.convidadosIFSP.dtos.ConvidadoDTO;
import com.br.gustavo.convidadosIFSP.models.Aluno;
import com.br.gustavo.convidadosIFSP.models.Convidado;
import com.br.gustavo.convidadosIFSP.repositories.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConvidadoService {
    @Autowired
    private ConvidadoRepository convidadoRepository;

    public void save(Convidado convidado){
        this.convidadoRepository.save(convidado);
    }

    @Transactional(readOnly = true)
    public List<ConvidadoDTO> findAll(){
        return convidadoRepository.findAll().stream().map(ConvidadoDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public ConvidadoDTO findById(Long id){
        return new ConvidadoDTO(convidadoRepository.findById(id).get());
    }

}
