package com.Proyecto.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {

    // Método para manejar solicitudes GET a la página de contacto
    @GetMapping("/Contacto")
    public String mostrarPaginaContacto() {
        return "Contacto"; // Esto devolverá el nombre de la plantilla Thymeleaf para la página de contacto
    }

    // Puedes agregar más métodos para manejar otras acciones relacionadas con el contacto, como enviar un correo electrónico o procesar el formulario de contacto
}
