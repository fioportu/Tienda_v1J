package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-v1-j-3a733.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "TechShop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase"; //En donde esta mi  llave
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-v1-j-3a733-firebase-adminsdk-1u34c-e82305bbd6";
}
