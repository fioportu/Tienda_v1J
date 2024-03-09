package com.tienda.service.impl;

import com.tienda.dao.productoDao;
import com.tienda.domain.producto;
import com.tienda.service.productoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class productoServiceImpl implements productoService {
    
    @Autowired
    private productoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<producto> getproductos(boolean activos) {
        var lista=productoDao.findAll(); //Se va a guardar en esta lista
        if (activos) {
           lista.removeIf(e -> !e.isActivo()); //Va a remover de la lista lo que sea diferente de activos 
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public producto getproducto(producto producto) {
        return productoDao.findById(producto.getIdproducto()).orElse(null);
    }

    @Override
    @Transactional //Metodo de tipo transaccional porque le voy a preguntar a la bd sobre la info si existe me la devuelve
    public void save(producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(producto producto) {
        productoDao.delete(producto);
    }

}
