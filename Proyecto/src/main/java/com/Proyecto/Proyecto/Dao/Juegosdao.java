<<<<<<< HEAD
package com.Proyecto.Proyecto.Dao;

import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Juegosdao extends JpaRepository<Juegos, Long> {
    List<Juegos> findByNombre(String nombre);

    // Updated method to order by descripcion
    List<Juegos> findByPrecioBetweenOrderByPrecio(double precioInf, double precioSup);
}
=======
package com.Proyecto.Proyecto.Dao;

import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Juegosdao extends JpaRepository<Juegos, Long> {
    List<Juegos> findByNombre(String nombre);

    // Updated method to order by descripcion
    List<Juegos> findByPrecioBetweenOrderByPrecio(double precioInf, double precioSup);
}
>>>>>>> e545c067504fdafe8ebfd9cb49a6f69a9bf61c60
