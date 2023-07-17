package com.br.gustavo.convidadosIFSP.controllers;

import com.br.gustavo.convidadosIFSP.dtos.ConvidadoDTO;
import com.br.gustavo.convidadosIFSP.models.Convidado;
import com.br.gustavo.convidadosIFSP.services.ConvidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/convidados")
public class ConvidadoController {
    @Autowired
    private ConvidadoService convidadoService;

    @PostMapping(value = "/cadastro")
    public void save(@RequestBody Convidado convidado){
        this.convidadoService.save(convidado);
    }

    @GetMapping(value = "/{id}")
    public ConvidadoDTO findById(@PathVariable Long id){
        return convidadoService.findById(id);
    }

    @GetMapping
    public List<ConvidadoDTO> findAll(){
        return convidadoService.findAll();
    }

}
