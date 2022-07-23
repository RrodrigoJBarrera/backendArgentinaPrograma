/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Controlador;

import com.porfoliorb.rodrigojbarrera.Entidad.Persona;
import com.porfoliorb.rodrigojbarrera.Interface.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigojbarrera
 */
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControlador {

    @Autowired
    IPersonaServicio ipersonaServicio;

    @GetMapping("persona/traer")
    public List<Persona> getPersonas() {
        return ipersonaServicio.getPersonas();
    }

    @PostMapping("/persona/crear")
    public String crearPersona(@RequestBody Persona persona) {
        ipersonaServicio.guardarPersona(persona);
        return "Persona Agregada";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String borrarPersona(@PathVariable int id) {
        ipersonaServicio.eliminarPersona(id);
        return "Persona Borrada";
    }
    
      @PutMapping("persona/editar")
    public void modificarPersona(@RequestBody Persona persona) {
        ipersonaServicio.modificarPersona(persona);
    }

    @GetMapping("/persona/traer/perfil")
    public Persona findPersona() {
        return ipersonaServicio.buscarPersona((int) 1);
    }

}
