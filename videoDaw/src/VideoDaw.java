import model.Cliente;
import model.Pelicula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VideoDaw {
    private String CIF;
    private String direccion;
    private LocalDate fechaAlta;
    private Pelicula[] peliculasRegistradas;
    private Cliente[] clientesRegistrados;
    private int nPeliculasRegistradas;
    private int nClientesRegistrados;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public VideoDaw(String CIF, String direccion) {
        this.CIF = CIF;
        this.direccion = direccion;
        this.fechaAlta = LocalDate.now();
        this.peliculasRegistradas = new Pelicula[100];
        this.clientesRegistrados = new Cliente[100];
        this.nClientesRegistrados = 0;
        this.nPeliculasRegistradas = 0;
    }

    public String getCIF() {
        return this.CIF;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    //REGISTRAR PELICULA
    public boolean registrarPelicula(Pelicula pelicula){
        boolean resultado = false;

        //Comprobación si es distinto de null para evitar excepción NullPointer, en caso contrario devuelve false
        if (pelicula != null) {
//            if (this.nLibrosActuales < this.libros.length){
//                //Esto se podría extraer a una función aparte llamarlo guardarLibro y no repetir esas tres lineas de código.
//                this.libros[this.nLibrosActuales] = libro;
//                this.nLibrosActuales++;
//                resultado = true;
//            } else {
//                //No hay espacio en el array para insertar
//                //Reflexionar opción: ampliar dimension del array
//                this.ampliarDimensionBiblioteca();
//                this.libros[this.nLibrosActuales] = libro;
//                this.nLibrosActuales++;
//                resultado = true;
//            }
            //Lo mismo que lo de arriba pero en menos líneas
            if (this.nPeliculasRegistradas >= this.peliculasRegistradas.length){
                this.ampliarDimensionBiblioteca(); //Hacer metodo
            }
            this.peliculasRegistradas[this.nPeliculasRegistradas] = pelicula;
            this.nPeliculasRegistradas++;
            resultado = true;
        }

        return resultado;
    }


    //DAR DE BAJA PELICULA
    public boolean darBajaPelicula(Pelicula pelicula) {
        boolean resultado = false;
        //comprobamos que el libro que nos dan no este vacío
        if (pelicula != null) {
            for (int i = 0; i < peliculasRegistradas.length; i++) {
                if (pelicula == peliculasRegistradas[i]) {
                    pelicula.setFechaBaja(LocalDate.now());
                    resultado = true;
                }
            }
        }
        return resultado;
    }

    //MOSTRAR PELICULAS REGISTRADAS

    //MOSTRAR CLIENTES REGISTRADOS

    //ALQUILAR PELICULA

    //DEVOLVER PELICULA

    //DAR DE BAJA CLIENTE

    //REGISTRAR CLIENTE


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CIF: ").append(this.CIF).append("\n");
        sb.append("Dirección: ").append(this.direccion).append("\n");
        sb.append("Fecha Alta: ").append(this.fechaAlta).append("\n");
        return sb.toString();
    }
}
