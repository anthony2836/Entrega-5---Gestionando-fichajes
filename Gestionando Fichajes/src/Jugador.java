import java.util.Date;

public class Jugador {
    private String Nombre;
    private Date FechaNacimiento;
    private String Pais;
    private Posicion Posicion;
    private int Dorsal;
    private Traspaso Traspaso;
    
    public Equipo Equipo_id;

    public Jugador(String nombreJugador, Date fechaNacimientoJugador, String paisJugador, Posicion posicionJugador, int dorsalJugador,
            Traspaso traspasoJugador) {
        this.Nombre = nombreJugador;
        this.FechaNacimiento = fechaNacimientoJugador;
        this.Pais = paisJugador;
        this.Posicion = posicionJugador;
        this.Dorsal = dorsalJugador;
        this.Traspaso = traspasoJugador;

        validarDatos();
    }

    public void validarDatos() {
        if (Nombre == null) {
            System.out.println("ERROR!, Agrega un nombre");
        }
        if (FechaNacimiento == null) {
            System.out.println("ERROR!, Agrega una fecha de nacimiento");
        }
        if (Posicion == null) {
            System.out.println("ERROR!, Agrega una posicion");
        }
        if (Dorsal <= 0) {
            System.out.println("ERROR!, Dorsal no valido");
        }
        if (Traspaso == null) {
            System.out.println("ERROR!, Agrega un traspaso");
        } else {
            System.out.println("Todo bien");
        }
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
        FechaNacimiento = fechaNacimiento;
    }

    public Posicion getPosicion() {
        return Posicion;
    }

    public void setPosicion(Posicion posicion) {
        Posicion = posicion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal < 1) {
            return;
        }
        Dorsal = dorsal;
    }

    public Traspaso getTraspaso() {
        return Traspaso;
    }

    public void setTraspaso(Traspaso traspaso) {
        Traspaso = traspaso;
    }


    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    public void setEquipo_id(Equipo equipo_id) {
        Equipo_id = equipo_id;
    }


    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", Pais=" + Pais + ", Posicion="
                + Posicion + ", Dorsal=" + Dorsal + ", Traspaso=" + Traspaso + ", Equipo_id=" + Equipo_id + "]";
    }

}
