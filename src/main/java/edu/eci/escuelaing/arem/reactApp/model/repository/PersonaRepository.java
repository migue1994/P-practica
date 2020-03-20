package edu.eci.escuelaing.arem.reactApp.model.repository;

import edu.eci.escuelaing.arem.reactApp.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
