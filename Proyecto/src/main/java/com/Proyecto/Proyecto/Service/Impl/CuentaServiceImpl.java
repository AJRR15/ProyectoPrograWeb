<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Service.Impl;

import com.Proyecto.Proyecto.Dao.CuentaDao;
import com.Proyecto.Proyecto.Domain.Cuenta;
import com.Proyecto.Proyecto.Service.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alejh
 */
@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaDao cuentaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> getCuenta(String correo) {
    if (correo != null && !correo.isEmpty()) {
            return cuentaDao.findByCorreo(correo);
        } else {
            return cuentaDao.findAll();
        }
    }
        @Override
    public void guardarCuenta(Cuenta cuenta) {
        cuentaDao.save(cuenta);
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Service.Impl;

import com.Proyecto.Proyecto.Dao.CuentaDao;
import com.Proyecto.Proyecto.Domain.Cuenta;
import com.Proyecto.Proyecto.Service.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alejh
 */
@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaDao cuentaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> getCuenta(String correo) {
    if (correo != null && !correo.isEmpty()) {
            return cuentaDao.findByCorreo(correo);
        } else {
            return cuentaDao.findAll();
        }
    }
        @Override
    public void guardarCuenta(Cuenta cuenta) {
        cuentaDao.save(cuenta);
    }
    
}
>>>>>>> e545c067504fdafe8ebfd9cb49a6f69a9bf61c60
