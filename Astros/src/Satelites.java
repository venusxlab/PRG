public class Satelites extends Astros{

    private double distanciaPlanetaria;
    private double orbitaPlanetaria;
    private Planeta planeta;

    public Satelites(double radioEcuatorial, double rotacion, double masa, double gravedad, double temperaturaMedia,
                     double distanciaPlanetaria, double orbitaPlanetaria, Planeta planeta) {
        super(radioEcuatorial, rotacion, masa, gravedad, temperaturaMedia);
        this.distanciaPlanetaria = distanciaPlanetaria;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planeta = planeta;
    }

    public double getDistanciaPlanetaria() {
        return this.distanciaPlanetaria;
    }

    public double getOrbitaPlanetaria() {
        return this.orbitaPlanetaria;
    }

    public Planeta getPlaneta() {
        return this.planeta;
    }

    @Override
    public String muestra() {
        return super.toString() + this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Distancia Planetaria: ").append(this.distanciaPlanetaria).append("\n");
        sb.append("Orbita Planetaria: ").append(this.orbitaPlanetaria).append("\n");
        sb.append("Planeta al que pertenece:").append(this.planeta).append("\n");
        return sb.toString();
    }
}
