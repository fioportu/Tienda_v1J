package com.tienda.service;

import com.tienda.domain.producto;
import java.util.List;

public interface productoService {
    

    public List<producto> getproductos(boolean activos);
 

    public producto getproducto(producto producto);
    

    public void save(producto producto);
    

    public void delete(producto producto);

}

