package com.Proyecto.Proyecto.Service.Impl;

import com.Proyecto.Proyecto.Dao.Juegosdao;
import com.Proyecto.Proyecto.Service.JuegosService;
import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional(readOnly = true)
    public Juegos getJuego(Juegos juegos) {
        return juegosDao.findById(juegos.getId_juego()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Juegos juegos) {
        juegosDao.save(juegos);
    }

    @Override
    @Transactional
    public void delete(Juegos juegos) {
        juegosDao.delete(juegos);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Juegos> findByPrecioBetweenOrderByPrecio(double precioInf, double precioSup) {
        return juegosDao.findByPrecioBetweenOrderByPrecio(precioInf, precioSup);
    }
}
