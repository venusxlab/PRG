public class Planeta extends Astros{

    private double distanciaSol;
    private double orbitaSol;
    private boolean tieneSatelites;

    public Planeta(double radioEcuatorial, double rotacion, double masa, double gravedad, double temperaturaMedia,
                   double distanciaSol, double orbitaSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacion, masa, gravedad, temperaturaMedia);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }

    public double getDistanciaSol() {
        return this.distanciaSol;
    }

    public double getOrbitaSol() {
        return this.orbitaSol;
    }

    public boolean isTieneSatelites() {
        return this.tieneSatelites;
    }

    @Override
    public String muestra() {
        return super.toString() + this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Distancia al Sol: ").append(this.distanciaSol).append("\n");
        sb.append("Orbita al Sol: ").append(this.orbitaSol).append("\n");
        sb.append("Tiene Satelites: ").append(this.tieneSatelites).append("\n");
        return sb.toString();
    }
}
