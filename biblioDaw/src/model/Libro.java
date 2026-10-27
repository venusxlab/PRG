package model;

public class Libro {

    //Contador static de la clase, para saber el numero total de libros creados
    private static int contadorTotal = 0;

    //Atributos de la clase
    private final int id;
    private String isbn;
    private String titulo;
    private String autor;
    private int nPag;
    private String editorial;
    private String genero;
    private String fechaPublicacion;

    //Constructores
    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        //Los inicializa en vacio para que no de null y no de fallo. Solo que tengan un valor vacio.
        this.nPag = 0;
        this.editorial = "";
        this.genero = "";
        this.fechaPublicacion = "";
        this.id = contadorTotal;
        contadorTotal++;
    }

    public Libro(String isbn, String titulo, String autor, int nPag, String editorial, String genero, String fechaPublicacion){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.nPag = nPag;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.id = contadorTotal;
        contadorTotal++;
    }

    /*
    * Definimos las propiedades: getters y setters
    * */

    public String getIsbn() {
        return this.isbn;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    //En caso de que nos insterese poder cambiar el autor del libro como un libro tecnico
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    //lo mismo
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public String getGenero() {
        return this.genero;
    }

    //Lo mismo
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getnPag() {
        return this.nPag;
    }

    //Lo mismo
    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    //Metodo para obtener toda la información de libro
    public String infoLibro(){
        String infoLibro = "";

        infoLibro += "ID: " + this.id + "\n";
        infoLibro += "Titulo: " + this.titulo + "\n";
        infoLibro += "Autor: " + this.autor + "\n";
        infoLibro += "ISBN: " + this.isbn + "\n";
        infoLibro += "Genero: " + this.genero + "\n";
        infoLibro += "Fecha Publicacion: " + this.fechaPublicacion + "\n";
        infoLibro += "Editorial: " + this.editorial + "\n";
        infoLibro += "NPaginas: " + this.nPag + "\n";

        return infoLibro;
    }


}//clase
