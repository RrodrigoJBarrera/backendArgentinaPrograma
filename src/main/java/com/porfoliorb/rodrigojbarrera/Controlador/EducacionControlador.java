/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Controlador;

import com.porfoliorb.rodrigojbarrera.Entidad.Educacion;
import com.porfoliorb.rodrigojbarrera.Interface.IEducacionServicio;
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
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionControlador {

    @Autowired
    IEducacionServicio ieducacionServicio;

    @GetMapping("educacion/traer")
    public List<Educacion> getPersonas() {
        return ieducacionServicio.getEducacion();
    }

    @PostMapping("educacion/crear")
    public String crearPersona(@RequestBody Educacion educacion) {
        ieducacionServicio.guardarEducacion(educacion);
        return "Educacion Agregada";
    }

    @DeleteMapping("educacion/borrar/{id}")
    public String borrarPersona(@PathVariable int id) {
        ieducacionServicio.eliminarEducacion(id);
        return "Educacion Borrada";
    }

    @PutMapping("/educacion/editar")
    public void modificarHabilidad(@RequestBody Educacion educacion) {
        ieducacionServicio.modificarEducacion(educacion);
    }

}
