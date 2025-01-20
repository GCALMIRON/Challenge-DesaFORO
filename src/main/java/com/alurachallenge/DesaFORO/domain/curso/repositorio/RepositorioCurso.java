package com.alurachallenge.DesaFORO.domain.curso.repositorio;

import com.alurachallenge.DesaFORO.domain.curso.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCurso extends JpaRepository<Curso, Long> {

    Page<Curso> findAllByActivoTrue(Pageable pageable);
}
