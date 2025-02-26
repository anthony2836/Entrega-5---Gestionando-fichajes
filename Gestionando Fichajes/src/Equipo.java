import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Abreviatura;

    public Presidente Presidente_id;
    public Entrenador Entrenador_id;
    public ArrayList<Jugador> jugadores_lista;

    private Traspaso traspaso;  // Enum de estado del traspaso
    private Equipo equipo; // Relación con Equipo


    public Equipo(String Nom_Equipo, String Abreviatura_Equi) {

        this.Nombre = Nom_Equipo;
        this.Abreviatura = Abreviatura_Equi;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre ==null) {
            return;
        }this.Nombre = nombre;
    }

    public String getAbreviatura() {

        return Abreviatura;
    }

    public void setAbreviatura(String abreviatura) {

        if (abreviatura== null) {
            return;
        }this.Abreviatura = abreviatura;
        
    }

    public Presidente getPresidente_id() {

        return Presidente_id;

    }

    public void setPresidente_id(Presidente presidente_id) {

        if (presidente_id == null) {
            return;
        }this.Presidente_id = presidente_id;
        
    }

    public Entrenador getEntrenador_id() {

        return Entrenador_id;

    }

    public void setEntrenador_id(Entrenador entrenador_id) {

        if (entrenador_id== null) {
            return;
        }this.Entrenador_id = entrenador_id;

    }


    public ArrayList<Jugador> getJugadores_lista() {
        return jugadores_lista;
    }

    public void setJugadores_lista(ArrayList<Jugador> jugadores_lista) {
        this.jugadores_lista = jugadores_lista;
    }

  


    public void resetearTraspasos() {
        for (Jugador jugador : jugadores_lista) {
            if (jugador.getTraspaso() == Traspaso.Rechazado_por_presidente || 
                jugador.getTraspaso() == Traspaso.Rechazado_por_entrenador) {
                jugador.setTraspaso(Traspaso.Sin_solicitar);
            }
        }
    }
    
    

    public Traspaso getTraspaso() {
        return traspaso;
    }

    public Equipo getEquipo() {
        return equipo;
    }



    @Override
    public String toString() {
        if (jugadores_lista == null || jugadores_lista.isEmpty()) {
            return "No hay jugadores en este equipo.";
        }
        return "Jugadores: " + jugadores_lista.toString();
    }
}