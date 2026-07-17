package com.ejemplo.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/parametros")
public class RquestParamControllers {

        @GetMapping("/detalle")
        public parametroDTO detalle (@RequestParam(required = false, 
                                defaultValue = "Hola a todos") String informacion){
            parametroDTO parametro1 = new parametroDTO();
            parametro1.setInformacion(informacion);
            return parametro1;
        }

        
}
