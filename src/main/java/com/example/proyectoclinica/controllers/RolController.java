package com.example.proyectoclinica.controllers;

import com.example.proyectoclinica.entidades.Rol;
import com.example.proyectoclinica.servicio.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolServicio rolServicio;

    @GetMapping
    public List<Rol> listarRoles(){
        return rolServicio.listarRoles();
    }
}
