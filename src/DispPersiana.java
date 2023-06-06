public class DispPersiana {

    private int apertura;
    private int rotacion;

    public DispPersiana(int apertura, int rotacion) {
        this.apertura = apertura;
        this.rotacion = rotacion;
    }

    public int getApertura() {
        return apertura;
    }

    public void setApertura(int apertura) {
        this.apertura = apertura;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }

    @Override
    public String toString() {
        return "DispPersiana{" +
                "apertura=" + apertura +
                ", rotacion=" + rotacion +
                '}';
    }
}
