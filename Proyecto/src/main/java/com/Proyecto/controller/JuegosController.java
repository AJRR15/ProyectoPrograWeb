/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author JoseSapi
 */
public class JuegosController {
    
    @GetMapping("/juegos")
    public String mostrarPaginaJuegos() {
        return "juegos/juegos"; // Devuelve la ruta correcta de la vista (templates/juegos/juegos.html)
    }
}

