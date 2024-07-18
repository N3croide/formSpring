package com.necro.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.form.models.Usuario;
import com.necro.form.repository.UsuarioRepository;

@Service
public class UsuarioService{
    
    @Autowired
    private UsuarioRepository repository;

    public void saveUsuario(Usuario usuario){
        repository.save(usuario);
    }
}
