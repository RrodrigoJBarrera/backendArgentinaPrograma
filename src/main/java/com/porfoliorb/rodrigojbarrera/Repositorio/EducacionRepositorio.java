/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Repositorio;
import com.porfoliorb.rodrigojbarrera.Entidad.Educacion;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rodrigojbarrera
 */
@Repository
public interface EducacionRepositorio extends JpaRepository<Educacion, Integer> {
     List<Educacion> findByPersona(int id_persona);
    
}
