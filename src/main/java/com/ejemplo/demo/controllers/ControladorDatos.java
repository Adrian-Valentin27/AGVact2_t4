package com.ejemplo.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDatos {

    @GetMapping("/api/hobbies")
    public String[] misHobbies() {
        
        String[] lista = {"Videojuegos", "Escuchar musica"};
        return lista; 
    }

    @GetMapping("/api/saludo")
    public String mensajeSimple() {
        return "El servidor funciona sin errores!!";
    }
}