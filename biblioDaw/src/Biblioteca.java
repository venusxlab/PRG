import model.Libro;

public class Biblioteca {

    //Atributos de la clase
    private String codigo;
    private String nombre;
    private String direccion;
    private String email;
    private String nTelefono;

    //Atributos de la clase relacionados con la Coleccion de Libros
    private Libro[] libros;
    private int nLibrosActuales;
    private final int dimensionInicial = 100;

    //Constructor de la clase
    public Biblioteca(String codigo, String nombre, String direccion, String email, String nTelefono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.nTelefono = nTelefono;
        //Inicializamos el array apuntando a la variable con la dimension inicial antes creada
        this.libros = new Libro[this.dimensionInicial];

        this.nLibrosActuales = 0;
    }

    /*
    * Getters y Setters de nuestros atributos
    * */

    public String getCodigo() {
        return this.codigo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getnTelefono() {
        return this.nTelefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public int getnLibrosActuales() {
        return this.nLibrosActuales;
    }

    //Insertar libros en la biblioteca
    public boolean insertarLibro(Libro libro){
        boolean resultado = false;

        //Comprobacion si es distinto de null para evitar excepcion NullPointer, en caso contrarop devuelve false
        if (libro != null) {
//            if (this.nLibrosActuales < this.libros.length){
//                //Esto se podria extraer a un metodo aparte llamarlo guardarLibro y no repetir esas tres lineas de codigo.
//                this.libros[this.nLibrosActuales] = libro;
//                this.nLibrosActuales++;
//                resultado = true;
//            } else {
//                //No hay espacio en el array para insertar
//                //Reflexionar opcion: ampliar dimension del array
//                this.ampliarDimensionBiblioteca();
//                this.libros[this.nLibrosActuales] = libro;
//                this.nLibrosActuales++;
//                resultado = true;
//            }
            //Lo mismo que lo de arriba pero en menos lineas
            if (this.nLibrosActuales >= this.libros.length){
                this.ampliarDimensionBiblioteca();
            }
            this.libros[this.nLibrosActuales] = libro;
            this.nLibrosActuales++;
            resultado = true;
        }

        return resultado;
    }


    //Eliminar libro



    //Buscar libro por ISBN



    //Mostrar información de la biblioteca
    public String infoBiblioteca(){
        String infoBiblio = "";

        infoBiblio += "Codigo: " + this.codigo + "\n";
        infoBiblio += "Nombre: " + this.nombre + "\n";
        infoBiblio += "Direccion: " + this.direccion + "\n";
        infoBiblio += "Email: " + this.email + "\n";
        infoBiblio += "Nº Telefono: " + this.nTelefono + "\n";
        infoBiblio += "Nº de libros actuales: " + this.nLibrosActuales + "\n";

        return infoBiblio;
    }


    //Mostrar información de todos los libros almacenados


    //Ampliar dimension del array
    private void ampliarDimensionBiblioteca(){
        //Se va sumando de 100 en 100. Dimension del array actual (100), los llena y le suma la dimension inicial (100).
        Libro [] librosAux = new Libro[this.libros.length + this.dimensionInicial];
        for (int i = 0; i < this.libros.length; i++){
            librosAux[i] = this.libros[i];
        }
        //Hacemos que libros apunte a librosaux para que se borre solo y lo sobreescriba y se queda apuntando solo a ese.
        this.libros = librosAux;
    }

}//Clase
