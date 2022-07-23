/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Interface;

import com.porfoliorb.rodrigojbarrera.Entidad.Persona;
import java.util.List;


/**
 *
 * @author rodrigojbarrera
 */

public interface IPersonaServicio {

    public List<Persona> getPersonas();
    
    public void guardarPersona(Persona persona);
    
     public void modificarPersona(Persona persona);
    
    public void eliminarPersona(int id);
    
    public Persona buscarPersona(int id);
}
