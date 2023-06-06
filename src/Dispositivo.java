import java.util.Random;

public class Dispositivo {

    private String mac;
    private int id;
    private String ubicacion;
    private String nombre;
    private boolean encendido;

    public Dispositivo(String mac, int id, String ubicacion, String nombre, boolean encendido) {
        this.mac = mac;
        this.id = id;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.encendido = encendido;
        generarMacAleatoria();
    }

    //Metodos

    public void generarMacAleatoria() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] letras =  {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random rd = new Random();
        int numero = numeros[rd.nextInt(numeros.length)];
        char letra = letras[rd.nextInt(letras.length)];
        String mac = "";
        for (int i = 0; i < 6; i++) {
            if (i == 3 || i==6) {
                for (int j = 0; j < 3; j++) {
                    mac = mac + letra;
                }
            }
            mac = mac + numero;
        }
    }


    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "mac='" + mac + '\'' +
                ", id=" + id +
                ", ubicacion='" + ubicacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", encendido=" + encendido +
                '}';
    }
}
