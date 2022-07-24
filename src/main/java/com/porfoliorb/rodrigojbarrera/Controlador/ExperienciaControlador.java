/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Controlador;

import com.porfoliorb.rodrigojbarrera.Entidad.Educacion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.porfoliorb.rodrigojbarrera.Interface.IExperienciaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.porfoliorb.rodrigojbarrera.Entidad.Experiencia;
import com.porfoliorb.rodrigojbarrera.Entidad.Habilidad;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author rodrigojbarrera
 */
@RestController
@CrossOrigin(origins = "https://still-reef-69263.herokuapp.com/")
public class ExperienciaControlador {
    
    @Autowired IExperienciaServicio iExperienciaServicio;
    
    @GetMapping("experiencia/traer")
    public List<Experiencia> getExperiencias(){
        return iExperienciaServicio.obtenerExperiencia();
    }
    
      @PostMapping("experiencia/crear")
    public String crearExperiencia(@RequestBody Experiencia experiencia) {
        iExperienciaServicio.guardarExperiencia(experiencia);
        return "Experiencia Agregada";
    }

    @DeleteMapping("experiencia/borrar/{id}")
    public String borrarExperiencia(@PathVariable int id) {
        iExperienciaServicio.eliminarExperiencia(id);
        return "Experiencia Borrada";
    }
   
    
    @PutMapping("/experiencia/editar")
    public void modificarExperiencia(@RequestBody Experiencia experiencia) {
        iExperienciaServicio.modificarExperiencia(experiencia);
    }
    
}
