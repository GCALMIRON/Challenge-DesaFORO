package com.alurachallenge.DesaFORO.domain.topico.validaciones.crear;

import com.alurachallenge.DesaFORO.domain.topico.dto.CrearTopicoDTO;
import com.alurachallenge.DesaFORO.domain.usuario.repositorio.UsuarioRepositorio;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarTopicoUsuario implements ValidarTopicoCreado{

    @Autowired
    private UsuarioRepositorio repository;

    @Override
    public void validate(CrearTopicoDTO data) {
        var existeUsuario = repository.existsById(data.usuarioId());
        if (!existeUsuario) {
            throw new ValidationException("Este usuario no existe");
        }

        var usuarioHabilitado = repository.findById(data.usuarioId()).get().getEnabled();
        if (!usuarioHabilitado) {
            throw new ValidationException("Este usuario fue deshabiliado.");
        }
    }
}
