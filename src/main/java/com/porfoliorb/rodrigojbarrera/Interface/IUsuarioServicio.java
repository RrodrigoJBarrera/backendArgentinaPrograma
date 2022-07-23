/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Interface;
import com.porfoliorb.rodrigojbarrera.Entidad.Experiencia;
import com.porfoliorb.rodrigojbarrera.Entidad.Usuario;
import java.util.List;
/**
 *
 * @author rodrigojbarrera
 */
public interface IUsuarioServicio {
    
     
    public Usuario obtenerUsuario(int id);
    
    public Usuario buscarUsuario(int id);
    
    public void modificarUsuario(Usuario usuario);
    
}
