package model;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {
    private int codPelicula = 0;
    private final String titulo;
    private final Tipo genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private Boolean isAlquilada;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Pelicula (String titulo, Tipo genero){
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = null;
        this.fechaAlquiler = null;
        this.codPelicula++;
        this.isAlquilada = false;
    }

    public int getCodPelicula() {
        return this.codPelicula;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Tipo getGenero() {
        return this.genero;
    }

    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public Boolean getAlquilada() {
        return this.isAlquilada;
    }

    public void setAlquilada(Boolean alquilada) {
        this.isAlquilada = alquilada;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo pelicula: ").append(this.codPelicula).append("\n");
        sb.append("Titulo: ").append(this.titulo).append("\n");
        sb.append("Genero: ").append(this.genero).append("\n");
        sb.append("Fecha Registro: ").append(this.fechaRegistro.format(formatter1)).append("\n");
        sb.append("Fecha Baja: ").append(this.fechaBaja.format(formatter1)).append("\n");
        sb.append("Fecha Alquiler: ").append(this.fechaAlquiler.format(formatter)).append("\n");
        sb.append("Esta alquilada: ").append(this.isAlquilada).append("\n");
        return sb.toString();
    }
}
