package com.ejemplo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorNavegacion {

    // Ruta principal para el indice
    @GetMapping("/")
    public String mostrarMenu() {
        return "inicio"; 
    }

    // Ruta para tus datos (Ejercicio A)
    @GetMapping("/perfil")
    public String mostrarPerfil(Model model) {
        model.addAttribute("nombreProyecto", "AGVact1_t4");
        model.addAttribute("nombreAlumno", "Alumno: Gonzalez Valentin Adrian");
        
        return "perfil"; 
    }
}