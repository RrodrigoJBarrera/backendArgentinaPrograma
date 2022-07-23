/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Interface;

import com.porfoliorb.rodrigojbarrera.Entidad.Habilidad;
import java.util.List;

/**
 *
 * @author rodrigojbarrera
 */
public interface IHabilidadServicio {
    
    public List<Habilidad> obtenerHabilidades();
    
    public void guardarHabilidad(Habilidad habilidad);
    
    public void modificarHabilidad(Habilidad habilidad);
    
    public void eliminarHabilidad(int id);
    
    public Habilidad buscarHabilidad(int id);
    
}
