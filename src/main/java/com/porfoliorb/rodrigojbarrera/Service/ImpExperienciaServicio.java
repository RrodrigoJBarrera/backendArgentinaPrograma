/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Service;

import com.porfoliorb.rodrigojbarrera.Entidad.Experiencia;
import com.porfoliorb.rodrigojbarrera.Interface.IExperienciaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfoliorb.rodrigojbarrera.Repositorio.ExperienciaRepositorio;

/**
 *
 * @author rodrigojbarrera
 */
@Service
public class ImpExperienciaServicio implements IExperienciaServicio {

    @Autowired
    ExperienciaRepositorio IExperienciaServicio;

    @Override
    public List<Experiencia> obtenerExperiencia() {
        List<Experiencia> experieciaList = IExperienciaServicio.findByPersona(1);
        return experieciaList;
    }

    @Override
    public void guardarExperiencia(Experiencia experiencia) {
        IExperienciaServicio.save(experiencia);
    }

    @Override
    public void eliminarExperiencia(int id) {
        IExperienciaServicio.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(int id) {
        Experiencia experiencia = IExperienciaServicio.findById(id).orElse(null);
        return experiencia;
    }

    @Override
    public void modificarExperiencia(Experiencia experiencia) {
        IExperienciaServicio.save(experiencia);
    }

}
