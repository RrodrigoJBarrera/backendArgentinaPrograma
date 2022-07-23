/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.porfoliorb.rodrigojbarrera.Entidad.Experiencia;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 *
 * @author rodrigojbarrera
 */
@Repository
public interface ExperienciaRepositorio extends JpaRepository<Experiencia, Integer> {
    
    List<Experiencia> findByPersona(int id_persona);
}
