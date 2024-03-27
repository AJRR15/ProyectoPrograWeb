package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.Domain.Juegos;
import com.Proyecto.Proyecto.Service.JuegosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/juego")
public class JuegosController {

    @Autowired
    private JuegosService juegosService;

    @GetMapping("/juegos")
    public String mostrarJuegos(Model model) {
        List<Juegos> juegos = juegosService.getJuegos(null);
        model.addAttribute("juegos", juegos);
        return "juego/juegos"; // Ruta correcta para la vista de juegos
    }

    @GetMapping("/listado2")
    public String listado2(Model model) {
        List<Juegos> juegos = juegosService.getJuegos(null);
        model.addAttribute("juegos", juegos);
        return "juego/listado2"; // Ruta correcta para la vista de listado2
    }

    @PostMapping("/query1")
    public String consultaQuery1(@RequestParam(value = "precioInf") double precioInf,
            @RequestParam(value = "precioSup") double precioSup, Model model) {
        List<Juegos> juegos = juegosService.findByPrecioBetweenOrderByPrecio(precioInf, precioSup);
        model.addAttribute("juegos", juegos);
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        // Redirigir explícitamente a la página de listado2 después de realizar la consulta
        return "juego/listado2";
    }
}
