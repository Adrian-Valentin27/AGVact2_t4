package com.ejemplo.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ejemplo.demo.models.dto.ProductoDTO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/tienda")
public class TiendaController {

    @Value("${tienda.nombre}")
    private String nombreTienda;

    private List<ProductoDTO> inventario = Arrays.asList(
            new ProductoDTO(1, "Laptop HP", "Electronica", 15000.0),
            new ProductoDTO(2, "Mouse Inalámbrico", "Electronica", 300.0),
            new ProductoDTO(3, "Silla Gamer", "Muebles", 2500.0)
    );

    @GetMapping("/productos")
    public String verProductos(@RequestParam(required = false) String categoria, Model model) {
        List<ProductoDTO> listaFiltrada = inventario;
        
        if (categoria != null && !categoria.isEmpty()) {
            listaFiltrada = inventario.stream()
                    .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                    .collect(Collectors.toList());
        }

        model.addAttribute("tituloTienda", nombreTienda);
        model.addAttribute("productos", listaFiltrada);
        return "lista_productos";
    }

   
    @GetMapping("/producto/{id}")
    public String verDetalle(@PathVariable int id, Model model) {
        ProductoDTO productoEncontrado = inventario.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        model.addAttribute("producto", productoEncontrado);
        return "detalle_producto";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("nuevoProducto", new ProductoDTO());
        return "formulario_producto";
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute("nuevoProducto") ProductoDTO producto, Model model) {
        model.addAttribute("productoGuardado", producto);
        return "resultado_producto";
    }
}