/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


package com.tienda.dao;

import com.tienda.domain.producto;
import org.springframework.data.jpa.repository.JpaRepository; // Libreria que nos permite extraerla la data 

/**
 *
 * @author portu
 */

//Nos permite enviar la informacion
public interface productoDao extends JpaRepository <producto, Long> {
    
}
