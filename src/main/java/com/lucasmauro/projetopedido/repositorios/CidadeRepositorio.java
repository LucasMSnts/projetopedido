package com.lucasmauro.projetopedido.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasmauro.projetopedido.dominio.Cidade;

@Repository
public interface CidadeRepositorio extends JpaRepository<Cidade, Integer>{

}
