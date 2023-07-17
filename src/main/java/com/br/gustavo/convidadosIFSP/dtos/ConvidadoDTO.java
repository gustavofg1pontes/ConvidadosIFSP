package com.br.gustavo.convidadosIFSP.dtos;

import com.br.gustavo.convidadosIFSP.models.Convidado;

public class ConvidadoDTO {
    private String nome;
    private Integer idade;

    public ConvidadoDTO() {
    }

    public ConvidadoDTO(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public ConvidadoDTO(Convidado convidado) {
        this.nome = convidado.getNome();
        this.idade = convidado.getIdade();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
