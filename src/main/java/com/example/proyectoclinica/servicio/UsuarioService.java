package com.example.proyectoclinica.servicio;

import com.example.proyectoclinica.dtos.LoginDto;
import com.example.proyectoclinica.dtos.UsuarioDto;
import com.example.proyectoclinica.entidades.Usuario;

import java.util.List;

public interface UsuarioService {
    UsuarioDto validarCredenciales(LoginDto credenciales) throws Exception;

    List<Usuario> listarUsuarios();
}
