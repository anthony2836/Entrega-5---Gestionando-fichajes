import java.util.ArrayList;
public class Equipo {

    public String Nombre;
    public String Abreviatura;
    public Presidente Presidente_id;
    public Entrenador Entrenador_id;
    public ArrayList<Jugador> jugadores_lista;

    public Equipo (String Nom_Equipo, String Abreviatura_Equi){
    
    Nombre = Nom_Equipo;
    Abreviatura = Abreviatura_Equi;

}
}