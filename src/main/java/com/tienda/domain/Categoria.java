package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data // Tipo Data 
@Entity //Identidad
@Table(name = "categoria") //Nombre de la tabla

//Almacenar la información
public class Categoria implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco

    //Autoincrementelo uno, id1, id2, id3...
    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la categoria.

    // Información del script de la base de datos
    // Valores que agregamos en la taba de base de datos
    
    @Id //id categoria es la llave de la tabla categoria. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_categoria") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idCategoria; // Long se usa porque se puede utilizar mas espacios en el disco, pueden hacerse muchos id...
    private String descripcion; // String es varchar
    private String rutaImagen;
    private boolean activo;

    // Constructor con y sin parametros 
    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}

