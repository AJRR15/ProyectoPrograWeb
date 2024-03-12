/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.Proyecto.Dao;
import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author JoseSapi
 */


public interface Juegosdao extends JpaRepository <Juegos,Long> {
    List<Juegos> findByNombre(String nombre);
    
}
