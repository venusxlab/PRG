public abstract class Astros {

    private double radioEcuatorial;
    private double rotacion;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

    public Astros(double radioEcuatorial, double rotacion, double masa, double gravedad, double temperaturaMedia) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.gravedad = gravedad;
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getRadioEcuatorial() {
        return this.radioEcuatorial;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public double getRotacion() {
        return this.rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return this.masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperaturaMedia() {
        return this.temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return this.gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    //Metodo obstracto que es de obligada implementacion en cualquier clase hija que no sea abstracta
    public abstract String muestra();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Radio Ecuatorial: ").append(this.radioEcuatorial).append("\n");
        sb.append("Rotación: ").append(this.rotacion).append("\n");
        sb.append("Masa:").append(this.masa).append("\n");
        sb.append("Temperatura Media: ").append(this.temperaturaMedia).append("\n");
        sb.append("Gravedad: ").append(this.gravedad).append("\n");
        return sb.toString();
    }
}
