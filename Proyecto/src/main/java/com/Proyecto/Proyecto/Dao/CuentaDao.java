/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Dao;
import java.util.List;
import com.Proyecto.Proyecto.Domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejh
 */
public interface CuentaDao extends JpaRepository<Cuenta, Long> {
    List<Cuenta> findByCorreo(String correo);
}
