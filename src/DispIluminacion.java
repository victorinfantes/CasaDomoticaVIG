public class DispIluminacion {

    private int color;
    private int intensidad;

    public DispIluminacion(int color, int intensidad) {
        this.color = color;
        this.intensidad = intensidad;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    @Override
    public String toString() {
        return "DispIluminacion{" +
                "color=" + color +
                ", intensidad=" + intensidad +
                '}';
    }
}
