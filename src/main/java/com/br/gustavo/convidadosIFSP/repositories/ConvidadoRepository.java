package com.br.gustavo.convidadosIFSP.repositories;

import com.br.gustavo.convidadosIFSP.dtos.ConvidadoDTO;
import com.br.gustavo.convidadosIFSP.models.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
}
