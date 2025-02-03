import java.util.Date;

public class Jugador {
    private String Nombre;
    private Date FechaNacimiento;
    private String Pais;
    private Posicion Posicion;
    private int Dorsal;
    private Traspaso Traspaso;
    private Equipo Equipo_id;

    public Jugador(String nombreJugador, Date fechaNacimientoJugador, String paisJugador, Posicion posicionJugador, int dorsalJugador,
    Traspaso traspasoJugador) {

        this.Nombre = nombreJugador;
        this.FechaNacimiento = fechaNacimientoJugador;
        this.Pais = paisJugador;
        this.Posicion = posicionJugador;
        this.Dorsal = dorsalJugador;
        this.Traspaso = traspasoJugador;

    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        if (Nombre.equals(null)) {
            return;
        }
        this.Nombre = nombre;
    }

    public Date getFechaNacimiento() {
    
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        if (FechaNacimiento==null) {
            return;  
        }FechaNacimiento = fechaNacimiento;
    }

    public Posicion getPosicion() {
        
        return Posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (Posicion== null) {
            return;
        }Posicion = posicion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {

       if (dorsal < 1 ) {
         return;

       }this.Dorsal= dorsal;
    }

    public Traspaso getTraspaso() {
        return Traspaso;
    }

    public void setTraspaso(Traspaso traspaso) {

        if (Traspaso ==null) {
            return;
            
        }this.Traspaso= traspaso;
    }

    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    public void setEquipo_id(Equipo Equipo_id) {

        if (Equipo_id== null) {
            return;
            
        }this.Equipo_id= Equipo_id;
        }

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", Pais=" + Pais + ", Posicion="
                + Posicion + ", Dorsal=" + Dorsal + ", Traspaso=" + Traspaso + ", Equipo_id=" + Equipo_id + "]";
    }

}
