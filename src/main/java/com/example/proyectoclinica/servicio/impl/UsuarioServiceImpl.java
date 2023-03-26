package com.example.proyectoclinica.servicio.impl;

import com.example.proyectoclinica.dtos.LoginDto;
import com.example.proyectoclinica.dtos.UsuarioDto;
import com.example.proyectoclinica.entidades.Usuario;
import com.example.proyectoclinica.repositorios.UsuarioRepositorio;
import com.example.proyectoclinica.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public UsuarioDto validarCredenciales(LoginDto credenciales) throws Exception {

        UsuarioDto dto = new UsuarioDto();
        Usuario usuario = usuarioRepositorio.findUsuarioByLogin(credenciales.getUsuario());

        if(!usuario.getPassword().equals(credenciales.getContrasena())
        || !usuario.getRolId().toString().equals(credenciales.getRol())){
            throw new Exception("Credenciales incorrectas");
        }

        dto.setLogin(usuario.getLogin());
        dto.setNombre(usuario.getNombre());

        return dto;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }
}
