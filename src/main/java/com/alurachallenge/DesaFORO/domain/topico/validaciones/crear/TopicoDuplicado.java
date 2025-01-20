package com.alurachallenge.DesaFORO.domain.topico.validaciones.crear;

import com.alurachallenge.DesaFORO.domain.topico.dto.CrearTopicoDTO;
import com.alurachallenge.DesaFORO.domain.topico.repositorio.TopicoRepositorio;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoDuplicado implements ValidarTopicoCreado{

    @Autowired
    private TopicoRepositorio topicoRepositorio;


    @Override
    public void validate(CrearTopicoDTO data) {
        var topicoDuplicado = topicoRepositorio.existsByTituloAndMensaje(data.titulo(), data.mensaje());
        if(topicoDuplicado){
            throw new ValidationException("Este topico ya existe. Revisa /topicos/" + topicoRepositorio.findByTitulo(data.titulo()).getId());

        }
    }
}