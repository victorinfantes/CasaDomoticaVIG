public class CasaDomotica {
    public static void main(String[] args) {

        Controlador controlador = new Controlador();
        Dispositivo dispositivo = new Dispositivo(10,"Casa","LucesLeds");

        controlador.abrirPersianas(new DispPersiana(0,0));
        controlador.cerrarPersianas(new DispPersiana(100,60));
        controlador.encenderLuces(dispositivo);


    }
}
