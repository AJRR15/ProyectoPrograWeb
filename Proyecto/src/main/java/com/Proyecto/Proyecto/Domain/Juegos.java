<<<<<<< HEAD
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
    private Long id_juego;
    private String imagen;
    private String nombre;
    private String empresa;
    private double precio;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    public Juegos() {
    }

    public Juegos(String imagen, String nombre, String empresa, double precio, boolean activo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.empresa = empresa;
        this.precio = precio;
        this.activo = activo;
    }
}
=======
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
    private Long id_juego;
    private String imagen;
    private String nombre;
    private String empresa;
    private double precio;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    public Juegos() {
    }

    public Juegos(String imagen, String nombre, String empresa, double precio, boolean activo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.empresa = empresa;
        this.precio = precio;
        this.activo = activo;
    }
}
>>>>>>> e545c067504fdafe8ebfd9cb49a6f69a9bf61c60
