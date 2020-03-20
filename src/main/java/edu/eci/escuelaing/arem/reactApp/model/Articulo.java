package edu.eci.escuelaing.arem.reactApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Articulo {
    @Id
    private Long id;
    @NonNull
    private String Name;
    private int precio;
}
