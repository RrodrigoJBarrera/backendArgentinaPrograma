/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rodrigojbarrera
 */
@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   
    private String nombre;

  
    private String apellido;


    private String direccion;

   
    private String email;

  
    private String telefono;

   
    private String profesion;

   
    private String sobremi;

    
    private String github;

 
    private String linkedin;


  
    private String edad;
    private String linkcv;
}
