import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    @org.junit.jupiter.api.Test
    void apagarLuces() {
        Controlador controlador = new Controlador();
        Dispositivo dispositivo = new Dispositivo(10,"Casa","LucesLeds");
        assertEquals(true,controlador.encenderLuces(dispositivo));
    }

    @org.junit.jupiter.api.Test
    void cerrarPersianas() {
        Controlador controlador = new Controlador();
        Dispositivo dispositivo = new Dispositivo(10,"Casa","LucesLeds");
        assertEquals(false, controlador.cerrarPersianas(new DispPersiana(100,70)));
    }

    @org.junit.jupiter.api.Test
    void acabarVacaciones() {
        Controlador controlador = new Controlador();
        Dispositivo dispositivo = new Dispositivo(10,"Casa","LucesLeds");
        assertEquals(true,controlador.acabarVacaciones());
    }
}