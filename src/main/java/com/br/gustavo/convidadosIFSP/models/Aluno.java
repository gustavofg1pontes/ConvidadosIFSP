package com.br.gustavo.convidadosIFSP.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Entity
@Table(name = "tb_alunos")
@Getter
@Setter
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String prontuario;
    private Integer idade;
    @OneToMany(mappedBy = "aluno")
    private List<Convidado> convidados = new ArrayList<>();

    public Aluno(){
    }

    public Aluno(Long id, String nome, String prontuario, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.prontuario = prontuario;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
