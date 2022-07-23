/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Repositorio;
import com.porfoliorb.rodrigojbarrera.Entidad.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rodrigojbarrera
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    
}
