package com.desafio.forohub.domain.respuesta.repository;

import com.desafio.forohub.domain.respuesta.Respuesta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

    Page<Respuesta> findAllByTopicoId(Long topicoId, Pageable pageable);

    Page<Respuesta> findAllByUsuarioId(Long usuarioId, Pageable pageable);

    Respuesta getReferenceByTopicoId(Long id);

    @SuppressWarnings("null")
    Respuesta getReferenceById(Long id);
}
