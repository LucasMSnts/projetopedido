package com.lucasmauro.projetopedido.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasmauro.projetopedido.dominio.Cliente;;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{

}