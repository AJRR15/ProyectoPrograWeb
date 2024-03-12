/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.Domain.Juegos;
import com.Proyecto.Proyecto.Service.JuegosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author alejh
 */
@Controller
public class JuegosController {

    @Autowired
    private JuegosService juegosService;

    @GetMapping("/juegos")
    public String mostrarJuegos(Model model) {
        List<Juegos> juegos = juegosService.getJuegos(null); // Cambia el nombre del método según sea necesario
        model.addAttribute("juegos", juegos);
        return "juego/juegos"; // Devuelve el nombre de la vista a renderizar
    }

}
