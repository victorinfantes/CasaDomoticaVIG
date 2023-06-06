import java.util.List;

public class Controlador {

    private List<DispIluminacion> luces;
    private List<DispPersiana> persianas;

    public void addEspacio(String nombreUbicacion, int numeroLuces, int numeroPersianas) {
        Dispositivo dispositivo = new Dispositivo("",1,nombreUbicacion, "dispositivoNuevo",false);
    }

    public void apagarLuces(Dispositivo dispositivo) {
        dispositivo.setEncendido(false);
        System.out.println("Las luces del dispositivo "+dispositivo.toString()+" se han apagado");
    }

    public void cerrarPersianas(DispPersiana persiana) {
        persiana.setRotacion(0);
        persiana.setApertura(0);
        System.out.println("Las persianas "+persiana.toString()+" se han cerrado");
    }


    public void encenderLuces(Dispositivo dispositivo) {
        dispositivo.setEncendido(true);
        System.out.println("Las luces del dispositivo "+dispositivo.toString()+" se han encendido");
    }

    public void abrirPersianas(DispPersiana persiana) {
        persiana.setApertura(100);
        persiana.setRotacion(50);
        System.out.println("Las persianas "+persiana.toString()+" se han abierto");
    }

    public void comenzarVacaciones() {
        for (int i = 0; i < luces.size(); i++) {
            luces.get(i).setColor(0);
            luces.get(i).setIntensidad(0);
        }
        for (int i = 0; i < persianas.size(); i++) {
            persianas.get(i).setApertura(0);
            persianas.get(i).setRotacion(0);
        }
    }
    public void acabarVacaciones() {
        for (int i = 0; i < luces.size(); i++) {
            luces.get(i).setColor(100);
            luces.get(i).setIntensidad(100);
        }
        for (int i = 0; i < persianas.size(); i++) {
            persianas.get(i).setApertura(100);
            persianas.get(i).setRotacion(50);
        }
    }
    }


