/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Service;
import com.porfoliorb.rodrigojbarrera.Entidad.Usuario;
import com.porfoliorb.rodrigojbarrera.Interface.IUsuarioServicio;
import com.porfoliorb.rodrigojbarrera.Repositorio.HabilidadRepositorio;
import com.porfoliorb.rodrigojbarrera.Repositorio.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rodrigojbarrera
 */
@Service
public class ImpUsuarioServicio implements IUsuarioServicio {
    
    @Autowired UsuarioRepositorio iUsuarioRepositorio;

    @Override
    public Usuario obtenerUsuario(int id) {
        Usuario usuario = iUsuarioRepositorio.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public Usuario buscarUsuario(int id) {
        Usuario usuario = iUsuarioRepositorio.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        iUsuarioRepositorio.save(usuario);
    }
    
}
