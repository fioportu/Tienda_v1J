/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

// Nos devuelve la informacion de categoria como el id, rutaimagen...

package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository; // Libreria que nos permite extraerla la data 

/**
 *
 * @author portu
 */

//Nos permite enviar la informacion
public interface CategoriaDao extends JpaRepository <Categoria, Long> {
    
}
