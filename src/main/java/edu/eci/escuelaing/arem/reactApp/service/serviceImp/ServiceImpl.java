package edu.eci.escuelaing.arem.reactApp.service.serviceImp;

import edu.eci.escuelaing.arem.reactApp.model.Articulo;
import edu.eci.escuelaing.arem.reactApp.model.Persona;
import edu.eci.escuelaing.arem.reactApp.model.repository.ArticuloRepository;
import edu.eci.escuelaing.arem.reactApp.model.repository.PersonaRepository;
import edu.eci.escuelaing.arem.reactApp.service.ReactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements ReactService {

    private final PersonaRepository personaRepository;
    private final ArticuloRepository articuloRepository;

    public ServiceImpl(PersonaRepository personaRepository, ArticuloRepository articuloRepository) {
        this.personaRepository = personaRepository;
        this.articuloRepository = articuloRepository;
    }

    @Override
    public List<Articulo> getArticulos() {
        return articuloRepository.findAll();
    }

    @Override
    public Optional<Articulo> getArticulo(Long id) {
        return articuloRepository.findById(id);
    }

    @Override
    public void saveArticulo(Articulo articulo) {
        articuloRepository.save(articulo);
    }

    @Override
    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> getPersona(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }
}
