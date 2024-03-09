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
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
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

