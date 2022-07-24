/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Controlador;

import com.porfoliorb.rodrigojbarrera.Interface.IHabilidadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.porfoliorb.rodrigojbarrera.Entidad.Habilidad;
import java.util.List;
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
public class HabilidadControlador {
    
    @Autowired IHabilidadServicio ihabilidadServicio;
    
    @GetMapping("habilidad/traer")
    public List<Habilidad> getHabilidades(){
        return ihabilidadServicio.obtenerHabilidades();
    }
    
     @PostMapping("habilidad/crear")
    public String crearHabilidad(@RequestBody Habilidad habilidad) {
        ihabilidadServicio.guardarHabilidad(habilidad);
        return "Habilidad Agregada";
    }

    @DeleteMapping("habilidad/borrar/{id}")
    public String borrarPersona(@PathVariable int id) {
        ihabilidadServicio.eliminarHabilidad(id);
        return "Habilidad Borrada";
    }
    
    
    @PutMapping("habilidad/editar")
    public void modificarHabilidad(@RequestBody Habilidad habilidad) {
        ihabilidadServicio.modificarHabilidad(habilidad);
    }

}
