package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    //Atributos de la clase
    private static int contadorMovimiento = 1;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private final int id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private double cantidad;

    //Constructor
    public Movimiento(Tipo tipo, double cantidad){
        this.id = this.contadorMovimiento;
        contadorMovimiento++;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    //Metodo para obtener toda la información de Movimiento
    public String mostrarInfoMovimiento(){
        String infoMovimiento = "";

        infoMovimiento += "ID: " + this.id + "\n";
        infoMovimiento += "Fecha: " + this.fecha.format(formatter) + "\n";//Ponerle formato a la fecha
        infoMovimiento += "Tipo: " + this.tipo + "\n";
        infoMovimiento += "Cantidad: " + this.cantidad + "€" + "\n";

        return infoMovimiento;
    }

}
