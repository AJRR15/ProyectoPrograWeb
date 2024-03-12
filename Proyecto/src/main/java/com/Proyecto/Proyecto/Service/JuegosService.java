/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.Proyecto.Service;
import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;

public interface JuegosService {    
    List<Juegos> getJuegos(String nombre);
}