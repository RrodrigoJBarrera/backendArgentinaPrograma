/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Service;

import com.porfoliorb.rodrigojbarrera.Entidad.Habilidad;
import com.porfoliorb.rodrigojbarrera.Interface.IHabilidadServicio;
import com.porfoliorb.rodrigojbarrera.Repositorio.HabilidadRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author rodrigojbarrera
 */
@Service
public class ImpHabilidadServicio implements IHabilidadServicio {

    @Autowired HabilidadRepositorio ihabilidadRepositorio;
    
    @Override
    public void guardarHabilidad(Habilidad habilidad) {
        ihabilidadRepositorio.save(habilidad);
    }

    @Override
    public void eliminarHabilidad(int id) {
        ihabilidadRepositorio.deleteById(id);
    }

    @Override
    public List<Habilidad> obtenerHabilidades() {
       List<Habilidad> habilidadList = ihabilidadRepositorio.findByPersona(1);
       return habilidadList;
    }

    @Override
    public Habilidad buscarHabilidad(int id) {
        Habilidad habilidad = ihabilidadRepositorio.findById(id).orElse(null);
        return habilidad;
    }

    @Override
    public void modificarHabilidad(Habilidad habilidad) {
        ihabilidadRepositorio.save(habilidad);
    }
    
}
