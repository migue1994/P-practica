package edu.eci.escuelaing.arem.reactApp.controller;

import edu.eci.escuelaing.arem.reactApp.model.Articulo;
import edu.eci.escuelaing.arem.reactApp.model.Persona;
import edu.eci.escuelaing.arem.reactApp.service.ReactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/app")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class RestContoller {
    private final ReactService reactService;

    public RestContoller(ReactService reactService) {
        this.reactService = reactService;
    }

    @GetMapping("/personas")
    public ResponseEntity<?> getPersonas(){
        try {
            return new ResponseEntity<>(reactService.getPersonas(), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("No se encontraron personas",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/personas/{id}")
    public ResponseEntity<?> getPersona(@PathVariable Long id){
        try {
            return new ResponseEntity<>(reactService.getPersona(id), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("No existe la persona",HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("personas")
    public ResponseEntity<?> postPersona(@Valid @RequestBody Persona persona){
        try {
            reactService.savePersona(persona);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("No fue posible registrar la persona",HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/articulos")
    public ResponseEntity<?> getArticulos(){
        try {
            return new ResponseEntity<>(reactService.getArticulos(), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("No se encontraron articulos",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/articulos/{id}")
    public ResponseEntity<?> getArticulo(@PathVariable Long id){
        try {
            return new ResponseEntity<>(reactService.getArticulo(id), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("No existe el articulo",HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("articulos")
    public ResponseEntity<?> postArticulo(@Valid @RequestBody Articulo articulo){
        try {
            reactService.saveArticulo(articulo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("No fue posible registrar el articulo",HttpStatus.FORBIDDEN);
        }
    }

}
