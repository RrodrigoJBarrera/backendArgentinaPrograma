/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Service;

import com.porfoliorb.rodrigojbarrera.Entidad.Educacion;
import com.porfoliorb.rodrigojbarrera.Interface.IEducacionServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfoliorb.rodrigojbarrera.Repositorio.EducacionRepositorio;

/**
 *
 * @author rodrigojbarrera
 */
@Service
public class ImpEducacionServicio implements IEducacionServicio {

    @Autowired EducacionRepositorio ieducacionRepositorio;

    @Override
    public List<Educacion> getEducacion() {
        
        List<Educacion> educacionList = ieducacionRepositorio.findByPersona(1);
        return educacionList;
    }

    @Override
    public void guardarEducacion(Educacion educacion) {
        ieducacionRepositorio.save(educacion);
    }

    @Override
    public void eliminarEducacion(int id) {
        ieducacionRepositorio.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(int id) {
        Educacion educacion = ieducacionRepositorio.findById(id).orElse(null);
        return educacion;
    }

    @Override
    public void modificarEducacion(Educacion educacion) {
        ieducacionRepositorio.save(educacion);
    }
    
  
    
}
