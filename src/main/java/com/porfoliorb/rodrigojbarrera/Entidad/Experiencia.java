/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliorb.rodrigojbarrera.Entidad;

import javax.persistence.*;

import lombok.*;

/**
 *
 * @author rodrigojbarrera
 */
@Getter
@Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    private String tipo_trabajo;
    

    private String lugar;
    
  
    private String descripcion;
    

    private String puesto;
    
   
    private String anio_inicio;
    

    private String anio_finalizacion;
    
    @Column(name="id_persona")
    private int persona;
    
 
    
    
}
