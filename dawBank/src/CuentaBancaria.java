import model.Movimiento;
import model.Tipo;

public class CuentaBancaria {

    //Atributos de la clase
    private final String iban;
    private final String titular;
    private double saldo;

    //Atributos coleccion de la clase relacionado con la coleccion de Movimientos
    private Movimiento[] Movimientos;
    private int nMovimientosActuales = 0;
    private final int dimensionInicial = 100;

    //Constructor
    public CuentaBancaria (String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.Movimientos = new Movimiento[this.dimensionInicial];
        nMovimientosActuales = 0;
    }

    //getters y setters
    public String getIban(){
        return this.iban;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    //Metodo para obtener toda la información de la cuenta bancaria
    public String infoCuentaBancaria(){
        String infoCuentaBancaria = "";

        infoCuentaBancaria += "IBAN: " + this.iban + "\n";
        infoCuentaBancaria += "Titular: " + this.titular + "\n";
        infoCuentaBancaria += "Saldo: " + this.saldo + "\n";

        return infoCuentaBancaria;
    }


    //Metodo ingresar dinero
    public boolean ingresarDinero(double cantidad){
        boolean resultado = false;
        if (cantidad > 0){
            if (this.nMovimientosActuales >= this.Movimientos.length){
                this.ampliarDimensionMovimiento();
            }
            this.saldo = this.saldo + cantidad;
            Movimiento ingreso = new Movimiento(Tipo.INGRESO, cantidad);
            this.Movimientos[this.nMovimientosActuales] = ingreso;
            this.nMovimientosActuales++;
            resultado = true;
        }
        return resultado;
    }

    //Metodo retirar dinero
    public boolean retirarDinero(double cantidad){
        boolean resultado = false;
        if (cantidad > 0 && cantidad <= this.saldo){
            if (this.nMovimientosActuales >= this.Movimientos.length){
                this.ampliarDimensionMovimiento();
            }
            this.saldo = this.saldo - cantidad;
            Movimiento retirada = new Movimiento(Tipo.RETIRADA, cantidad);
            this.Movimientos[this.nMovimientosActuales] = retirada;
            this.nMovimientosActuales++;
            resultado = true;
        }
        return resultado;
    }

    //Ampliar dimension del array movimientos por si se llena
    private void ampliarDimensionMovimiento(){
        //Se va sumando de 100 en 100. Dimension del array actual (100), los llena y le suma la dimension inicial (100).
        Movimiento [] MovimientosAux = new Movimiento[this.Movimientos.length + this.dimensionInicial];
        for (int i = 0; i < this.Movimientos.length; i++){
            MovimientosAux[i] = this.Movimientos[i];
        }
        //Hacemos que libros apunte a librosaux para que se borre solo y lo sobreescriba y se queda apuntando solo a ese.
        this.Movimientos = MovimientosAux;
    }

} //clase
