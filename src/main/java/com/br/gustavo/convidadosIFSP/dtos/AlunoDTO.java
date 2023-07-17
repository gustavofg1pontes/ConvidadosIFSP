package com.br.gustavo.convidadosIFSP.dtos;

import com.br.gustavo.convidadosIFSP.models.Aluno;
import com.br.gustavo.convidadosIFSP.models.Convidado;

import java.util.ArrayList;
import java.util.List;

public class AlunoDTO {
    private String nome;
    private String prontuario;
    private Integer idade;
    private List<ConvidadoDTO> convidados = new ArrayList<>();

    public AlunoDTO() {
    }

    public AlunoDTO(String nome, String prontuario, Integer idade) {
        this.nome = nome;
        this.prontuario = prontuario;
        this.idade = idade;
    }

    public AlunoDTO(Aluno aluno) {
        this.nome = aluno.getNome();
        this.prontuario = aluno.getProntuario();
        this.idade = aluno.getIdade();
        this.convidados = aluno.getConvidados().stream().map(ConvidadoDTO::new).toList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<ConvidadoDTO> getConvidados() {
        return convidados;
    }
}
