/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Controlador;
import com.porfoliorb.rodrigojbarrera.Entidad.Usuario;
import com.porfoliorb.rodrigojbarrera.Interface.IUsuarioServicio;
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
@CrossOrigin(origins = "https://still-reef-69263.herokuapp.com:3306/")
public class UsuarioControlador {
    
    @Autowired
    IUsuarioServicio iUsuarioServicio;

    @GetMapping("usuario/traer")
    public Usuario getUsuario() {
        return iUsuarioServicio.obtenerUsuario((int) 1);
    }
    
    @PutMapping("usuario/editar")
    public String modificarUsuario(@RequestBody Usuario usuario) {
        iUsuarioServicio.modificarUsuario(usuario);
        return "Usuario Modificado";
    }
    
}
