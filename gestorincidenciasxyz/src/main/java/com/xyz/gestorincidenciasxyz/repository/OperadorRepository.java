package com.xyz.gestorincidenciasxyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.gestorincidenciasxyz.entity.Operador;

@Repository
public interface OperadorRepository extends JpaRepository<Operador, Integer> {

}
