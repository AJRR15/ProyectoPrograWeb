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
@Table(name = "contacto")
public class Contactos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Long idContacto;
    private String nombre;
    private String apellido;
    private int numero;
    private String mensaje;

    public Contactos() {
    }

    public Contactos(Long idContacto, String nombre, int numero, String mensaje) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.numero = numero;
        this.mensaje = mensaje;
    }

}
