package com.necro.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.necro.form.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}   
