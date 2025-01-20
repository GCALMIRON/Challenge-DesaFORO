package com.alurachallenge.DesaFORO.domain.usuario.dto;

import com.alurachallenge.DesaFORO.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}
