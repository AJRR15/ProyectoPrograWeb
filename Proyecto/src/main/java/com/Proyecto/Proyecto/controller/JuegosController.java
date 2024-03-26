package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.Domain.Juegos;
import com.Proyecto.Proyecto.Service.JuegosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JuegosController {

    @Autowired
    private JuegosService juegosService;

    @GetMapping("/juegos")
    public String mostrarJuegos(Model model) {
        List<Juegos> juegos = juegosService.getJuegos(null);
        model.addAttribute("juegos", juegos);
        return "juego/juegos";
    }
}
