package model;

public class Movimiento {
    //Atributos de la clase
    private static int contadorMovimiento = 0;

    private final int id;
    private String fecha;
    private String tipo;
    private int cantidad;

    //Constructor
    public Movimiento(String fecha, String tipo, int cantidad){
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.id = contadorMovimiento;
        contadorMovimiento++;

    }

    //Metodo para obtener toda la información de Movimiento
    public String mostrarInfoMovimiento(){
        String infoMovimiento = "";

        infoMovimiento += "ID: " + this.id + "\n";
        infoMovimiento += "Fecha: " + this.fecha + "\n";
        infoMovimiento += "Tipo: " + this.tipo + "\n";
        infoMovimiento += "Cantidad: " + this.cantidad + "\n";

        return infoMovimiento;
    }

}
