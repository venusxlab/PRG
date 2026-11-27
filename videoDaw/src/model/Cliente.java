package model;

import java.time.LocalDate;

public class Cliente {
    private final String dni;
    private final String nombre;
    private int numSocio = 0;
    private String direccion;
    private final LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private Pelicula [] peliculasAlquiladas;
    private int nPeliculasAlquiladas;

    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.numSocio++;
        this.fechaBaja = null;
        this.nPeliculasAlquiladas = 0;
        this.peliculasAlquiladas = new Pelicula[100];
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumSocio() {
        return this.numSocio;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }

    public Pelicula[] getPeliculasAlquiladas() {
        //for para recorrer el array?
        return this.peliculasAlquiladas;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DNI: ").append(this.dni).append("\n");
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Numero de socio: ").append(this.numSocio).append("\n");
        sb.append("Dirección: ").append(this.direccion).append("\n");
        sb.append("Fecha Nacimiento: ").append(this.fechaNacimiento).append("\n");
        sb.append("Fecha Baja: ").append(this.fechaBaja).append("\n");
        return sb.toString();
    }
}
