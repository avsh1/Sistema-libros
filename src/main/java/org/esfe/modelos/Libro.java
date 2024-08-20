package org.esfe.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El título es requerido")
    private String titulo;

    @NotBlank(message = "El autor es requerido")
    private String autor;

    @NotBlank(message = "La descripcion es requerida")
    private String descripcion;

    @NotNull(message = "La fecha de publicación es requerida")
    private LocalDate fechaDePublicacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank(message = "El título es requerido") String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NotBlank(message = "El título es requerido") String titulo) {
        this.titulo = titulo;
    }

    public @NotBlank(message = "El autor es requerido") String getAutor() {
        return autor;
    }

    public void setAutor(@NotBlank(message = "El autor es requerido") String autor) {
        this.autor = autor;
    }

    public @NotBlank(message = "La descripcion es requerida") String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(@NotBlank(message = "La descripcion es requerida") String descripcion) {
        this.descripcion = descripcion;
    }

    public @NotNull(message = "La fecha de publicación es requerida") LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(@NotNull(message = "La fecha de publicación es requerida") LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
}
