package com.example.proyectoclinica.servicio.impl;

import com.example.proyectoclinica.entidades.Rol;
import com.example.proyectoclinica.repositorios.RolRepositorio;
import com.example.proyectoclinica.servicio.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServicioImpl implements RolServicio {
    @Autowired
    private RolRepositorio rolRepositorio;

    @Override
    public List<Rol> listarRoles(){

        return rolRepositorio.findAll();
    }
}
