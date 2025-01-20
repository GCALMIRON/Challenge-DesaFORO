package com.alurachallenge.DesaFORO.domain.topico.validaciones.crear;


import com.alurachallenge.DesaFORO.domain.curso.repositorio.RepositorioCurso;
import com.alurachallenge.DesaFORO.domain.topico.dto.CrearTopicoDTO;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarCursoCreado implements ValidarTopicoCreado{

    @Autowired
    private RepositorioCurso repository;

    @Override
    public void validate(CrearTopicoDTO data) {
        var ExisteCurso = repository.existsById(data.cursoId());
        if(!ExisteCurso){
            throw new ValidationException("Este curso no existe.");
        }

        var cursoHabilitado = repository.findById(data.cursoId()).get().getActivo();
        if(!cursoHabilitado){
            throw new ValidationException("Curso no disponible en este momento.");
        }
    }
}
