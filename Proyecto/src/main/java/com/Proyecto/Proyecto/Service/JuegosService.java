<<<<<<< HEAD
package com.Proyecto.Proyecto.Service;

import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;

public interface JuegosService {
    List<Juegos> getJuegos(String nombre);

    Juegos getJuego(Juegos juegos);

    void save(Juegos juegos);

    void delete(Juegos juegos);

    List<Juegos> findByPrecioBetweenOrderByPrecio(double precioInf, double precioSup);
}
=======
package com.Proyecto.Proyecto.Service;

import com.Proyecto.Proyecto.Domain.Juegos;
import java.util.List;

public interface JuegosService {
    List<Juegos> getJuegos(String nombre);

    Juegos getJuego(Juegos juegos);

    void save(Juegos juegos);

    void delete(Juegos juegos);

    List<Juegos> findByPrecioBetweenOrderByPrecio(double precioInf, double precioSup);
}
>>>>>>> e545c067504fdafe8ebfd9cb49a6f69a9bf61c60
