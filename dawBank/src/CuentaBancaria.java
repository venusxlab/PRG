public class CuentaBancaria {

    //Atributos de la clase
    private final String iban;
    private final String titular;
    private int saldo;

    //Constructor
    public CuentaBancaria (String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
    }

    //getters y setters
    public String getIban(){
        return this.iban;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getSaldo() {
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


    //Metodo
} //clase
