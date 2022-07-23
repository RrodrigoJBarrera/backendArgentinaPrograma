/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Interface;

import com.porfoliorb.rodrigojbarrera.Entidad.Experiencia;
import java.util.List;

/**
 *
 * @author rodrigojbarrera
 */
public interface IExperienciaServicio {
    
    public List<Experiencia> obtenerExperiencia();
    
    public void guardarExperiencia(Experiencia experiencia);
    
    public void modificarExperiencia(Experiencia experiencia);
    
    public void eliminarExperiencia(int id);
    
    public Experiencia buscarExperiencia(int id);
    
}
