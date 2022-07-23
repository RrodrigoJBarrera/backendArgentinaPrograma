/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Service;

import com.porfoliorb.rodrigojbarrera.Entidad.Persona;
import org.springframework.stereotype.Service;
import com.porfoliorb.rodrigojbarrera.Interface.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.porfoliorb.rodrigojbarrera.Repositorio.PersonaRepositorio;

/**
 *
 * @author rodrigojbarrera
 */
@Service
public class ImpPersonaServicio implements IPersonaServicio{

    @Autowired PersonaRepositorio ipersonaRepositorio;
    
    @Override
    public List<Persona> getPersonas() {
        List<Persona> personaList = ipersonaRepositorio.findAll();
        return personaList;
    }

    @Override
    public void guardarPersona(Persona persona) {
        ipersonaRepositorio.save(persona);
    }

    @Override
    public void eliminarPersona(int id) {
        ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona buscarPersona(int id) {
  
        Persona persona = ipersonaRepositorio.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void modificarPersona(Persona persona) {
        ipersonaRepositorio.save(persona);
    }
    
}
