import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Abreviatura;

    public Presidente Presidente_id;
    public Entrenador Entrenador_id;
    public ArrayList<Jugador> Jugadores_lista;

    public Equipo(String Nom_Equipo, String Abreviatura_Equi, Presidente presidente_id, Entrenador entrenador_id, ArrayList jugadores_lista) {
        this.Nombre = Nom_Equipo;
        this.Abreviatura = Abreviatura_Equi;
        this.Presidente_id = presidente_id;
        this.Entrenador_id = entrenador_id;
        this.Jugadores_lista = jugadores_lista;
    }

    public String getNombre() {
        return Nombre;
    }



    public void setNombre(String nombre) {
        Nombre = nombre;
    }



    public String getAbreviatura() {
        return Abreviatura;
    }



    public void setAbreviatura(String abreviatura) {
        Abreviatura = abreviatura;
    }



    public Presidente getPresidente_id() {
        return Presidente_id;
    }



    public void setPresidente_id(Presidente presidente_id) {
        Presidente_id = presidente_id;
    }



    public Entrenador getEntrenador_id() {
        return Entrenador_id;
    }



    public void setEntrenador_id(Entrenador entrenador_id) {
        Entrenador_id = entrenador_id;
    }



    public ArrayList<Jugador> getJugadores_lista() {
        return Jugadores_lista;
    }



    public void setJugadores_lista(ArrayList<Jugador> jugadores_lista) {
        Jugadores_lista = jugadores_lista;
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Abreviatura=" + Abreviatura + ", Presidente_id=" + Presidente_id
                + ", Entrenador_id=" + Entrenador_id + ", Jugadores_lista=" + Jugadores_lista + "]";
    }

}