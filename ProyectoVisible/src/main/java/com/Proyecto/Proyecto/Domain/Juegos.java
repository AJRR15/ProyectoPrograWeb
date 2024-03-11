/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "juego")
public class Juegos implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_juego")
    private Long idJuego;
    private String imagen;
    private String nombre;
    private String empresa;
    private double precio;
    private String categoria;
    private boolean activo;
   

    public Juegos() {
    }

    public Juegos(String categoria, boolean activo) {
        this.categoria = categoria;
        this.activo = activo;
    }
}
