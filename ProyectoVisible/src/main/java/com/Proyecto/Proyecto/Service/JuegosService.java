/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.Proyecto.Service;
import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;

public interface JuegosService {    
    // Se obtiene un listado de juegos en un List   
    public List<Juegos> getJuegos(boolean activos); 
    public Juegos getJuego(Juegos juego); 
}