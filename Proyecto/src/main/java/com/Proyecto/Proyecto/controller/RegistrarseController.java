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
public class RegistrarseController {

    @GetMapping("/registrarse")
    public String mostrarRegistrarse() {
        return "registrar/registrarse";
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
public class RegistrarseController {

    @GetMapping("/registrarse")
    public String mostrarRegistrarse() {
        return "registrar/registrarse";
    }
}
>>>>>>> e545c067504fdafe8ebfd9cb49a6f69a9bf61c60
