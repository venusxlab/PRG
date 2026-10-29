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

    //Insertar libros en la biblioteca FUNCIÓN
    public boolean insertarLibro(Libro libro){
        boolean resultado = false;

        //Comprobación si es distinto de null para evitar excepción NullPointer, en caso contrario devuelve false
        if (libro != null) {
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
    public boolean eliminarLibro(Libro libro){
        boolean resultado = false;
        //comprobamos que el libro que nos dan no este vacío
        if (libro != null){
            //creamos una variable para usarla para ver donde está el libro, ya que en el array no hay posición -1
            int index = -1;
            for (int i = 0; i < this.nLibrosActuales; i++){
                //doble comprobación primero vemos si esa posición del array está vacía
                if (this.libros[i] != null){
                    //comprobamos que si ese libro tiene el mismo isbn que el libro que nos han pasado
                    if (this.libros[i].equals(libro.getIsbn())){
                        //cambiamos index a la posición de ese libro para tenerlo guardado.
                        index = i;
                        break; //eliminar primera ocurrencia, en este caso el ISBN es único, por lo tanto, lo paramos.
                    }
                }
            }
            //Comprobamos que realmente se haya encontrado un elemento
            if (index != -1){
                //hacemos que esa posición sea null, es decir la eliminamos y cambiamos resultado a true.
                this.libros[index] = null;
                resultado = true;

                //Recolocar el array de libros, ya que ahora puede haber espacios en medio
                //Como hay que recorrer hacia atrás hay que hacer un for desde el index que es donde está vacío hasta el total de libros que haya
                for (int i = index; i < this.nLibrosActuales; i++) {
                    this.libros[i] = this.libros[i+1];
                }
                this.libros[this.nLibrosActuales-1] = null;
                this.nLibrosActuales--;

                //Segunda forma recolocar array
                //Más rápida y más eficiente con cantidades grandes de datos u objetos.
                this.libros[index] = this.libros[this.nLibrosActuales-1];
                this.libros[this.nLibrosActuales-1] = null;
                this.nLibrosActuales--;
            }
        }

        return resultado;
    }


    //Buscar libro por ISBN
    public Libro getLibroByIsbn(String isbn){
        //Libro ya es un objeto, por lo tanto, la función lo definimos para que devuelva ESE objeto (libro)
        //No solo devuelve la informacion del objeto, devuelve el objeto completo
        Libro libro = null;
        //Primero comprobamos que no este vacio, es decir que le den a enter (null).
        //Segundo que pasen un string sin ningun valor, como por ejemplo darle espacio y enviarlo.
        //La exclamacion niega, es igual que isbn.isEmpty() == false
        if (isbn != null && !isbn.isEmpty()){
            for (int i = 0; i < this.nLibrosActuales; i++) {
                //Si esa posicion de i, usamos el metodo getisbn, es decir ese mismo isbn es igual al isbn que nos pasan en este metodo
                //Hacemos que la variable libro contenga la informacion de esa posicion, es decir cambiamos de null a esa informacion y se devuelve.
                if (this.libros[i].getIsbn().equals(isbn)){
                    libro = this.libros[i];
                    return libro;
                }
            }
        }
        //Se vuelve a poner en caso de que dentro del for y el if no se encuentre nada entonces devolveria el null del principio.
        return libro;
    }


    //Buscar libro por titulo (el titulo debe de ser unico)
    public Libro getLibroByTitulo(String titulo){
        //Libro ya es un objeto por lo tanto el metodo lo definimos para que devuelve ESE objeto (libro)
        //No solo devuelve la informacion del objeto, devuelve el objeto completo
        Libro libro = null;
        //Primero comprobamos que no este vacio, es decir que le den a enter (null).
        //Segundo que pasen un string sin ningun valor, como por ejemplo darle espacio y enviarlo.
        //La exclamacion niega, es igual que titulo.isEmpty() == false
        if (titulo != null && !titulo.isEmpty()){
            for (int i = 0; i < this.nLibrosActuales; i++) {
                //Si esa posicion de i, usamos el metodo getTitulo, es decir ese mismo titulo es igual al titulo que nos pasan en este metodo
                //Hacemos que la variable libro contenga la informacion de esa posicion, es decir cambiamos de null a esa informacion y se devuelve.
                if (this.libros[i].getTitulo().equals(titulo)){
                    libro = this.libros[i];
                    return libro;
                }
            }
        }
        //Se vuelve a poner en caso de que dentro del for y el if no se encuentre nada entonces devolveria el null del principio.
        return libro;
    }

    //Mostrar información de la biblioteca METODO
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


    //Mostrar información de todos los libros almacenados METODO
    public String infoLibroBiblioteca(){
        String infoLibros = "";
        //Recorrer el array.
        //No vale un foreach porque parte del array esta vacio por lo tanto recorres lo que no hace falta.
        //tambien porque si intentas acceder a una posicion vacia (null) dara NullPointerException.
        //Se usa un for con iterador con la variable libros actuales y te quitas los problemas.
        for (int i = 0; i < this.nLibrosActuales; i++) {
            //Dentro de la variable string con el for sumas toda la informacion de libro que se irá sumando con la anterior informacion.
            //Por eso se usa el += con la posicion de i en el array y el metodo de info libro y un salto de linea.
            infoLibros += this.libros[i].infoLibro() + "\n";
            // Lo de arriba es lo mismo que lo siguiente:
            // infoLibros = infoLibros + this.libros[i].infoLibro() + "\n";
        }

        return infoLibros;
    }

    //Ampliar dimension del array METODO
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
