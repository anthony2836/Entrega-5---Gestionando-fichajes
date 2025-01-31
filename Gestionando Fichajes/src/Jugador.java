import java.util.Date;

public class Jugador {
    public String Nombre;
    public Date FechaNacimiento;
    public Posicion Posicion;
    public int Dorsal;
    public Traspaso Traspaso;
    public Formacion Formacion;
    public Equipo Equipo_id; 

    public Jugador (String nombreJugador, Date fechaNacimientoJugador, Posicion posicionJugador, int dorsalJugador, Traspaso traspasoJugador) {
        Nombre = nombreJugador;
        FechaNacimiento = fechaNacimientoJugador;
        Posicion = posicionJugador;
        Dorsal = dorsalJugador;
        Traspaso = traspasoJugador;
    }

    public void dorsalJugador (int dorsal) {
        this.Dorsal = ( Dorsal < 0) ? 0 : Dorsal; // Evita valores negativos
    }


    // public int getDorsal(){
    //     return Dorsal;
    // }
    public void getDorsal(int newDorsal){
        Dorsal = newDorsal;
        if (Dorsal < 0 ) {
            System.out.println("Error, el Dorsal no puede ser negativo");
            
        } else {
            System.out.println("num correct");
        }            

    }
    public String toString(){
        return Nombre + Dorsal;
    }
}

    

