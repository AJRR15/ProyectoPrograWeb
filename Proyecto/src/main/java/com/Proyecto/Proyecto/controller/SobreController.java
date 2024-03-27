package com.Proyecto.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreController {

    // Método para manejar solicitudes GET a la página de sobre nosotros
    @GetMapping("/sobre")
    public String mostrarPaginaSobreNosotros() {
        return "Sobre_nosotros"; // Devolver el nombre correcto de la plantilla Thymeleaf
    }

    // Puedes agregar más métodos para manejar otras acciones relacionadas con la página de sobre nosotros
}
