import java.util.Date;

public class Jugador {
    public String Nombre;
    public Date FechaNacimiento;
    public Posicion Posicion;
    private int Dorsal;
    public Traspaso Traspaso;
    public Formacion Formacion;

    public Jugador (String nombreJugador, Date fechaNacimientoJugador, Posicion posicionJugador, int dorsalJugador, Traspaso traspasoJugador) {
        Nombre = nombreJugador;
        FechaNacimiento = fechaNacimientoJugador;
        Posicion = posicionJugador;
        Dorsal = dorsalJugador;
        Traspaso = traspasoJugador;
    }
    public int getDorsal(){
        return Dorsal;
    }
    public void getDorsal(int newDorsal){
        Dorsal = newDorsal;
        if (Dorsal < 0) {
            System.out.println("Error, el Dorsal no puede ser negativo");
            Dorsal = 0;
        } else {
            Dorsal = newDorsal;
        }
    }
    public String toString(){
        return Nombre + Dorsal;
    }
}

    

