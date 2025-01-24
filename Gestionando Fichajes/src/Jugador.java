import java.sql.Date;

public class Jugador {
    public String Nombre;
    public Date FechaNacimiento;
    public Posicion Posicion;
    public int Dorsal;
    public Traspaso Traspaso;

    public Jugador (String nombreJugador, Date fechaNacimientoJugador, Posicion posicionJugador, int dorsalJugador, Traspaso traspasoJugador) {
        Nombre = nombreJugador;
        FechaNacimiento = fechaNacimientoJugador;
        Posicion = posicionJugador;
        Dorsal = dorsalJugador;
        Traspaso = traspasoJugador;
    }

}
