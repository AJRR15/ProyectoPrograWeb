<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Dao;

import com.Proyecto.Proyecto.Domain.Usuario;
import com.Proyecto.Proyecto.Domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario, Long> {
    Usuario findByUsername(String username);
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Proyecto.Dao;

import com.Proyecto.Proyecto.Domain.Usuario;
import com.Proyecto.Proyecto.Domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario, Long> {
    Usuario findByUsername(String username);
    
}
>>>>>>> e545c067504fdafe8ebfd9cb49a6f69a9bf61c60
