package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    // Toda la lista de categorias creada en el script
    // Revisa la informacion que tenga en activos
    public List<Categoria> getCategorias(boolean activos);
 
    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);//Agregar uno nuevo o modificar
    
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);

}
