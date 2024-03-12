/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Service.Impl;
import com.Proyecto.Proyecto.Dao.Juegosdao;
import com.Proyecto.Proyecto.Service.JuegosService;
import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JoseSapi
 */

@Service
public class JuegosServiceImpl implements JuegosService {
    
    @Autowired
    private Juegosdao juegosDao;
    

    @Override
    @Transactional(readOnly = true)
    public List<Juegos> getJuegos(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            return juegosDao.findByNombre(nombre);
        } else {
            return juegosDao.findAll();
        }
 }   
}
