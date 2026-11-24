import java.time.LocalDate;

public class Pelicula extends Producto{

    private String genero;
    private int duracion;
    private String ISAN;
    private String director;
    private String calificacionEdad;
    private String formato;

    public Pelicula(String genero, int duracion, String ISAN, String director, String calificacionEdad, String formato,
                    String codigo, String nombre, String descripcion, double precio) {
        super(codigo, nombre, descripcion, precio);
        this.genero = genero;
        this.duracion = duracion;
        this.ISAN = ISAN;
        this.director = director;
        this.calificacionEdad = calificacionEdad;
        this.formato = formato;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String getISAN() {
        return this.ISAN;
    }

    public String getDirector() {
        return this.director;
    }

    public String getCalificacionEdad() {
        return this.calificacionEdad;
    }

    public String getFormato() {
        return this.formato;
    }

    public void setCalificacionEdad(String calificacionEdad) {
        this.calificacionEdad = calificacionEdad;
    }

    @Override
    public double obtenerDescuento() {
        return 10;
    }

    @Override
    public String calificacion() {
        return this.calificacionEdad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("genero: ").append(this.genero).append("\n");
        sb.append("duracion: ").append(this.duracion).append("\n");
        sb.append("ISAN: ").append(this.ISAN).append("\n");
        sb.append("director: ").append(this.director).append("\n");
        sb.append("Calificacion Edad: ").append(this.calificacionEdad).append("\n");
        sb.append("Formato: ").append(this.formato).append("\n");
        return sb.toString();
    }

}
