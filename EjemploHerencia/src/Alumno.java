import java.time.LocalDate;

public class Alumno extends Persona{ //Aqui indicamos que va a heredar de persona, es decir que la clase persona es el padre
    private String ciclo;
    private int curso;
    private String [] modulos;

    public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String dni,
                  String ciclo, int curso, String [] modulos){
        super(nombre, apellidos, fechaNacimiento, dni); //Debe ser la primera linea del constructor
        //Super llama al constructor de persona

        this.ciclo = ciclo;
        this.curso = curso;
        this.modulos = modulos;
    }

    public int getCurso() {
        return this.curso;
    }

    public String getCiclo() {
        return this.ciclo;
    }

    public String[] getModulos() {
        return this.modulos;
    }

//    public String infoAlumno(){
//        StringBuilder sb = new StringBuilder();
//        //Se puede ver que tiene acceso a los metodos de la clase padre. pero solo a los metodos.
//        //Esto ocurre porque estan puestos en private
//        //Se puede llamar a las cosas del padre con super. y lo que se necesite
//        sb.append(super.infoPersona());
//        sb.append("Ciclo: ").append(this.ciclo).append("\n");
//        sb.append("Curso: ").append(this.curso).append("\n");
//        sb.append("Modulos: ").append("\n"); //Al ser un array lo puedes dejar tal cual o hacer un for para recorrerlo.
//        for (String modulo : this.modulos){
//            sb.append(modulo). append("\n");
//        }
//        return sb.toString();
//    }

    //Sobreescribimos el TOSTRING DEL PADRE
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Ciclo: ").append(this.ciclo).append("\n");
        sb.append("Curso: ").append(this.curso).append("\n");
        sb.append("Modulos: ").append("\n"); //Al ser un array lo puedes dejar tal cual o hacer un for para recorrerlo.
        for (String modulo : this.modulos){
            sb.append(modulo). append("\n");
        }
        return sb.toString();
    }
}
