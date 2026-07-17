package com.ejemplo.demo.controllers;

import org.springframework.web.bind.annotation.*;

import com.ejemplo.demo.models.dto.ProductoDTO;

@RestController
@RequestMapping("/api/tienda")
public class TiendaRestController {

    @PostMapping("/registrar")
    public ProductoDTO registrarAPI(@RequestBody ProductoDTO nuevoProducto) {

        return nuevoProducto;
    }

    @GetMapping("/")
    public String mostrarMenu() {
        return "index"; // Esto busca el archivo index.html en la carpeta templates
    }
}