import model.Cliente;
import model.Pelicula;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
            //Lo mismo que lo de arriba pero en menos líneas
            if (this.nPeliculasRegistradas >= this.peliculasRegistradas.length){
                this.ampliarDimensionPelicula(); //Hacer metodo
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
    public String infoPeliculasRegistradas(){
        String infoPeliculas = "";
        //Recorrer el array.
        //No vale un foreach porque parte del array esta vacio por lo tanto recorres lo que no hace falta.
        //tambien porque si intentas acceder a una posicion vacia (null) dara NullPointerException.
        //Se usa un for con iterador con la variable libros actuales y te quitas los problemas.
        for (int i = 0; i < this.nPeliculasRegistradas; i++) {
            //Dentro de la variable string con el for sumas toda la informacion de libro que se irá sumando con la anterior informacion.
            //Por eso se usa el += con la posicion de i en el array y el metodo de info libro y un salto de linea.
            infoPeliculas += this.peliculasRegistradas[i].toString() + "\n";
            // Lo de arriba es lo mismo que lo siguiente:
            // infoLibros = infoLibros + this.libros[i].infoLibro() + "\n";
        }

        return infoPeliculas;
    }

    //MOSTRAR CLIENTES REGISTRADOS
    public String infoClientesRegistrados(){
        String infoClientes = "";
        //Recorrer el array.
        //No vale un foreach porque parte del array esta vacio por lo tanto recorres lo que no hace falta.
        //tambien porque si intentas acceder a una posicion vacia (null) dara NullPointerException.
        //Se usa un for con iterador con la variable libros actuales y te quitas los problemas.
        for (int i = 0; i < this.nClientesRegistrados; i++) {
            //Dentro de la variable string con el for sumas toda la informacion de libro que se irá sumando con la anterior informacion.
            //Por eso se usa el += con la posicion de i en el array y el metodo de info libro y un salto de linea.
            infoClientes += this.clientesRegistrados[i].toString() + "\n";
            // Lo de arriba es lo mismo que lo siguiente:
            // infoLibros = infoLibros + this.libros[i].infoLibro() + "\n";
        }

        return infoClientes;
    }

    //ALQUILAR PELICULA
    public boolean alquilarPelicula(Pelicula pelicula, Cliente cliente){
        boolean resultado = false;
        if (pelicula != null && cliente != null){
            if (pelicula.getAlquilada() == false){
                pelicula.setFechaAlquiler(LocalDateTime.now());
                pelicula.setAlquilada(true);
                //HACER SET DE PELICULAS ALQUILADAS EN CLIENTE PARA PODER METER ESA PELICULA EN ESE ARRAY
            }
        }

        return resultado;
    }

    //DEVOLVER PELICULA

    //DAR DE BAJA CLIENTE
    public boolean darCliente(Cliente cliente) {
        boolean resultado = false;
        //comprobamos que el libro que nos dan no este vacío
        if (cliente != null) {
            for (int i = 0; i < clientesRegistrados.length; i++) {
                if (cliente == clientesRegistrados[i]) {
                    cliente.setFechaBaja(LocalDate.now());
                    resultado = true;
                }
            }
        }
        return resultado;
    }

    //REGISTRAR CLIENTE
    public boolean registrarPelicula(Cliente cliente){
        boolean resultado = false;

        //Comprobación si es distinto de null para evitar excepción NullPointer, en caso contrario devuelve false
        if (cliente != null) {
            //Lo mismo que lo de arriba pero en menos líneas
            if (this.nClientesRegistrados >= this.clientesRegistrados.length){
                this.ampliarDimensionClientes(); //Hacer metodo
            }
            this.clientesRegistrados[this.nClientesRegistrados] = cliente;
            this.nClientesRegistrados++;
            resultado = true;
        }

        return resultado;
    }

    //AMPLIAR DIMENSION ARRAY PELICULAS
    private void ampliarDimensionPelicula(){
        //Se va sumando de 100 en 100. Dimension del array actual (100), los llena y le suma la dimension inicial (100).
        Pelicula [] peliculasAux = new Pelicula[this.peliculasRegistradas.length + 100];
        for (int i = 0; i < this.peliculasRegistradas.length; i++){
            peliculasAux[i] = this.peliculasRegistradas[i];
        }
        //Hacemos que Movimientos apunte a MovimientosAux para que se borre solo y lo sobreescriba y se queda apuntando solo a ese.
        this.peliculasRegistradas = peliculasAux;
    }

    //AMPLIAR DIMENSION ARRAY CLIENTES
    private void ampliarDimensionClientes(){
        //Se va sumando de 100 en 100. Dimension del array actual (100), los llena y le suma la dimension inicial (100).
        Cliente [] clientesAux = new Cliente[this.clientesRegistrados.length + 100];
        for (int i = 0; i < this.clientesRegistrados.length; i++){
            clientesAux[i] = this.clientesRegistrados[i];
        }
        //Hacemos que Movimientos apunte a MovimientosAux para que se borre solo y lo sobreescriba y se queda apuntando solo a ese.
        this.clientesRegistrados = clientesAux;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CIF: ").append(this.CIF).append("\n");
        sb.append("Dirección: ").append(this.direccion).append("\n");
        sb.append("Fecha Alta: ").append(this.fechaAlta).append("\n");
        return sb.toString();
    }
}
