package com.ejemplo.demo.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.demo.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")



public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")


    public ClaseDTO detalles_info() {
    /*     Empleados empleado1 = new Empleados("Juan","Rodriguez", "Calle 1 No 2", 
        "gerente",35,951659832,001);

        Map<String, Object > respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos Empleado");
        respuesta.put("Información", empleado1);
        */

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Adrian");


        return usuario1;
    }
}
