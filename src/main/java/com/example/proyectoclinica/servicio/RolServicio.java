package com.example.proyectoclinica.servicio;

import com.example.proyectoclinica.entidades.Rol;
import com.example.proyectoclinica.repositorios.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RolServicio {

    public List<Rol> listarRoles();
}
