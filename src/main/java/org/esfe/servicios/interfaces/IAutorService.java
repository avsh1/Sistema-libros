package org.esfe.servicios.interfaces;


import org.esfe.modelos.Autor;
import org.esfe.modelos.Libro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
public interface IAutorService {
    Page<Autor> buscarTodosPaginados(Pageable pageable);

    List<Autor> obtenerTodos();

    Optional<Autor> buscarPorId(Integer id);

    Autor crearOEditar(Autor autor);

    void eliminarPorId(Integer id);

}
