import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private List<DispIluminacion> luces;
    private List<DispPersiana> persianas;

    public Controlador() {
        this.luces = new ArrayList<>();
        this.persianas = new ArrayList<>();
    }

    public void addEspacio(String nombreUbicacion, int numeroLuces, int numeroPersianas) {
        Dispositivo dispositivo = new Dispositivo("",1,nombreUbicacion, "dispositivoNuevo",false);
    }

    public boolean apagarLuces(Dispositivo dispositivo) {
        dispositivo.setEncendido(false);
        System.out.println("Las luces del dispositivo "+dispositivo.toString()+" se han apagado");
        return false;
    }

    public boolean cerrarPersianas(DispPersiana persiana) {
        persiana.setRotacion(0);
        persiana.setApertura(0);
        System.out.println("Las persianas "+persiana.toString()+" se han cerrado");
        return false;
    }


    public boolean encenderLuces(Dispositivo dispositivo) {
        dispositivo.setEncendido(true);
        System.out.println("Las luces del dispositivo "+dispositivo.toString()+" se han encendido");
        return true;
    }

    public boolean abrirPersianas(DispPersiana persiana) {
        persiana.setApertura(100);
        persiana.setRotacion(50);
        System.out.println("Las persianas "+persiana.toString()+" se han abierto");
        return true;
    }

    public boolean comenzarVacaciones() {
        for (int i = 0; i < luces.size(); i++) {
            luces.get(i).setColor(0);
            luces.get(i).setIntensidad(0);
        }
        for (int i = 0; i < persianas.size(); i++) {
            persianas.get(i).setApertura(0);
            persianas.get(i).setRotacion(0);
        }
        boolean encendido = false;
        return false;
    }
    public boolean acabarVacaciones() {
        for (int i = 0; i < luces.size(); i++) {
            luces.get(i).setColor(100);
            luces.get(i).setIntensidad(100);
        }
        for (int i = 0; i < persianas.size(); i++) {
            persianas.get(i).setApertura(100);
            persianas.get(i).setRotacion(50);
        }

        return true;
    }
    }


