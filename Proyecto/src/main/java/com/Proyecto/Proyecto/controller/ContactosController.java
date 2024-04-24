// ContactosController.java
package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.Domain.Contactos;
import com.Proyecto.Proyecto.Domain.Informacion;
import com.Proyecto.Proyecto.Service.ContactosService;
import com.Proyecto.Proyecto.Service.InformacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactosController {

    @Autowired
    private ContactosService contactosService;
    @Autowired
    private InformacionService infoService;

    @GetMapping("/contactos")
    public String mostrarPaginaContacto(Model model) {
        var contactos = contactosService.getContactos(null);
        var informaciones = infoService.getInformaciones(null);
        model.addAttribute("contactos", contactos);
        model.addAttribute("informaciones", informaciones);
        return "contacto/listado";
    }

    @PostMapping("/guardar")
    public String guardarContacto(Contactos contacto) {
        contactosService.save(contacto);
        return "redirect:/contacto/contactos";
    }

    @GetMapping("/eliminar/{idContacto}")
    public String contactoEliminar(Contactos contacto) {
        contactosService.delete(contacto);
        return "redirect:/contacto/contactos";
    }

    @PostMapping("/guardarInformacion")
    public String guardarInformacion(Informacion informacion) {
        infoService.save(informacion);
        return "redirect:/contacto/contactos";
    }

    @GetMapping("/eliminarInformacion/{id_informacion}")
    public String informacionEliminar(Informacion Informacion) {
        infoService.delete(Informacion);
        return "redirect:/contacto/contactos";
    }

}
