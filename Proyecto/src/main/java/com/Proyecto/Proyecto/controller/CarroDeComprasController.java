<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alejh
 */
@Controller
public class CarroDeComprasController {

    @GetMapping("/carro")
    public String mostrarCarro() {
        return "carro/carrito";
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alejh
 */
@Controller
public class CarroDeComprasController {

    @GetMapping("/carro")
    public String mostrarCarro() {
        return "carro/carrito";
    }
}
>>>>>>> e545c067504fdafe8ebfd9cb49a6f69a9bf61c60
