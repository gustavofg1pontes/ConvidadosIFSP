package com.br.gustavo.convidadosIFSP.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tb_convidados")
@Getter
@Setter
public class Convidado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Aluno aluno;
    private String nome;
    private Integer idade;


    public Convidado() {
    }

    public Convidado(Long id, Aluno aluno, String nome, Integer idade) {
        this.id = id;
        this.aluno = aluno;
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return id.equals(convidado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
