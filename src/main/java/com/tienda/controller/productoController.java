package com.tienda.controller;

import com.tienda.domain.producto;
import com.tienda.service.productoService;
import com.tienda.service.impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/producto")
public class productoController {
    
    @Autowired
    private productoService productoService; // Mi lista 

    @GetMapping("/listado") //
    public String inicio(Model model) {
        var productos = productoService.getproductos(false);
        model.addAttribute("productos", productos); // 
        model.addAttribute("totalproductos", productos.size());
        return "/producto/listado";
    }
    
    @GetMapping("/nuevo")
    public String productoNuevo(producto producto) {
        return "/producto/modifica";
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String productoGuardar(producto producto,
            @RequestParam("imagenFile") MultipartFile imagenFile) {   // Donde digo ocupo que usted me de una imagen para guardarla     
        if (!imagenFile.isEmpty()) {
            productoService.save(producto);
            producto.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "producto", 
                            producto.getIdproducto()));
        }
        productoService.save(producto);
        return "redirect:/producto/listado";
    }

    @GetMapping("/eliminar/{idproducto}")
    public String productoEliminar(producto producto) {
        productoService.delete(producto);
        return "redirect:/producto/listado";
    }

    @GetMapping("/modifica/{idproducto}")
    public String productoModificar(producto producto, Model model) {
        producto= productoService.getproducto(producto);
        model.addAttribute("producto", producto);
        return "/producto/modifica";
    }

}
