package model;

public class Libro {
    //Atributos de la clase
    private String isbn;
    private String titulo;
    private String autor;
    private int nPag;
    private String editorial;
    private String genero;
    private String fechaPublicacion;

    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        //Los inicializa en vacio para que no de null y no de fallo. Solo que tengan un valor vacio.
        this.nPag = 0;
        this.editorial = "";
        this.genero = "";
        this.fechaPublicacion = "";
    }

    public Libro(String isbn, String titulo, String autor, int nPag, String editorial, String genero, String fechaPublicacion){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.nPag = nPag;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
    }


}//clase
