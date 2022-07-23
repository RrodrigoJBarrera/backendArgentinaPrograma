/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Interface;

import com.porfoliorb.rodrigojbarrera.Entidad.Educacion;
import java.util.List;

/**
 *
 * @author rodrigojbarrera
 */
public interface IEducacionServicio {

    public List<Educacion> getEducacion();

    public void guardarEducacion(Educacion educacion);
    
    public void modificarEducacion(Educacion educacion);

    public void eliminarEducacion(int id);

    public Educacion buscarEducacion(int id);

}
