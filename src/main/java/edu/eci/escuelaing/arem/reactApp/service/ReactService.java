package edu.eci.escuelaing.arem.reactApp.service;

import edu.eci.escuelaing.arem.reactApp.model.Articulo;
import edu.eci.escuelaing.arem.reactApp.model.Persona;

import javax.persistence.metamodel.ListAttribute;
import java.util.List;
import java.util.Optional;

public interface ReactService {
    List<Articulo> getArticulos();

    Optional<Articulo> getArticulo(Long id);

    void saveArticulo(Articulo articulo);

    List<Persona> getPersonas();

    Optional<Persona> getPersona(Long id);

    void savePersona(Persona persona);
}
