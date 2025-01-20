package com.alurachallenge.DesaFORO.domain.usuario.validaciones.update;

import com.alurachallenge.DesaFORO.domain.usuario.dto.ActualizarUsuarioDTO;
import com.alurachallenge.DesaFORO.domain.usuario.repositorio.UsuarioRepositorio;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidaActualizacionUsuario implements ValidarActualizarUsuario {

    @Autowired
    private UsuarioRepositorio repository;

    @Override
    public void validate(ActualizarUsuarioDTO data) {
        if(data.email() != null){
            var emailDuplicado = repository.findByEmail(data.email());
            if(emailDuplicado != null){
                throw new ValidationException("Este email ya esta en uso");
            }
        }
    }
}
