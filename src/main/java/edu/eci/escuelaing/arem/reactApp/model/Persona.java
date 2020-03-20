package edu.eci.escuelaing.arem.reactApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    private Long id;
    @NonNull
    private String tipoDocumento;
    private String Nombre;
    private String documento;
    private String telefono;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Articulo> articulos;
}
