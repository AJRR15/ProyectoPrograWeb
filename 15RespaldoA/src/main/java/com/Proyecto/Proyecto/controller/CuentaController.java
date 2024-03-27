/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.Domain.Cuenta;
import com.Proyecto.Proyecto.Service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alejh
 */
@Controller
@RequestMapping("/cuenta")
public class CuentaController {
    @Autowired
    private CuentaService cuentaService;

    @PostMapping("/registrar")
    public String registrarCuenta(@RequestParam("correo") String correo,
                                  @RequestParam("nombre") String nombre,
                                  @RequestParam("contrasena") String contrasena) {
        Cuenta nuevaCuenta = new Cuenta(correo, nombre, contrasena);
        cuentaService.guardarCuenta(nuevaCuenta);
        return "redirect:/login"; // Redirige a la página de inicio de sesión
    }

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "redirect:/iniciar/iniciarsesion"; // Aquí retornas la plantilla HTML para el formulario de inicio de sesión
    }
}
