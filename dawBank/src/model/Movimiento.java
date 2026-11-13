package model;

import java.time.LocalDateTime;

public class Movimiento {
    //Atributos de la clase
    private static int contadorMovimiento = 0;
    //private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

    private final int id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private double cantidad;

    //Constructor
    public Movimiento(Tipo tipo, double cantidad){
        this.id = contadorMovimiento;
        contadorMovimiento++;
        this.fecha = LocalDateTime.now(); //Ponerle formato a la fecha
        this.tipo = tipo;
        this.cantidad = cantidad;
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
