/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Service;

import com.Proyecto.Proyecto.Domain.Cuenta;
import java.util.List;

/**
 *
 * @author alejh
 */
public interface CuentaService {
    List<Cuenta> getCuenta(String correo);
    void guardarCuenta(Cuenta cuenta);
}
