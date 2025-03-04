import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {

    public static Date generarFechaNacimiento(int anio, int mes, int dia) {
        
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        return cal.getTime();

    }

    public static void main(String[] args) throws Exception {

        Equipo Team1 = new Equipo("Barcelona", "FBC");
        Equipo Team2 = new Equipo("Real Madrid", "RMCF");
        Equipo Team3 = new Equipo("Atletico Del Madrid", "ATM");

        Presidente p1 = new Presidente("43234401B", "Joan Laporta");
        Presidente p2 = new Presidente("34565543L", "Florentino Pérez");
        Presidente p3 = new Presidente("23434456M", "Enrrique Cerezo Torres");

        Entrenador e1 = new Entrenador("Hansi Flick", Formacion._352);
        Entrenador e2 = new Entrenador("Carlo Ancelotti", Formacion._333);
        Entrenador e3 = new Entrenador("Diego Simeone", Formacion._443);

        Jugador j1 = new Jugador("Anthony", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, 10, Traspaso.Aprobado_por_presidente);
        Jugador j2 = new Jugador("Messi", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, 10, Traspaso.Aprobado_por_entrenador);
        Jugador j3 = new Jugador("Ronaldo", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, 7, Traspaso.Aprobado_por_presidente);
        Jugador j4 = new Jugador("Koke", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, 9, Traspaso.Rechazado_por_entrenador);
        Jugador j5 = new Jugador("Estefano", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Defensa, 4, Traspaso.Sin_solicitar);
        Jugador j6 = new Jugador("Dibu", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Portero, 1, Traspaso.Solicitado);

     // Crear listas de jugadores para cada equipo
    ArrayList<Jugador> jugadoresBarcelona = new ArrayList<>();
    jugadoresBarcelona.add(j1);
    jugadoresBarcelona.add(j2);

    ArrayList<Jugador> jugadoresRealMadrid = new ArrayList<>();
    jugadoresRealMadrid.add(j3);
    jugadoresRealMadrid.add(j4);

    ArrayList<Jugador> jugadoresAtleti = new ArrayList<>();
    jugadoresAtleti.add(j5);
    jugadoresAtleti.add(j6);

    // // Asignar jugadores a los equipos
    // Team1.setJugadores_lista(jugadoresBarcelona);
    // Team2.setJugadores_lista(jugadoresRealMadrid);
    // Team3.setJugadores_lista(jugadoresAtleti);

    // Asignar equipo a los jugadores
    for (Jugador jugador : jugadoresBarcelona) jugador.setEquipo_id(Team1);
    for (Jugador jugador : jugadoresRealMadrid) jugador.setEquipo_id(Team2);
    for (Jugador jugador : jugadoresAtleti) jugador.setEquipo_id(Team3);

    // Mostrar estado inicial
    System.out.println("\nEstado inicial de los equipos:");
    System.out.println("Barcelona: " + Team1.getJugadores_lista());
    System.out.println("Real Madrid: " + Team2.getJugadores_lista());
    System.out.println("Atletico: " + Team3.getJugadores_lista());

    // Intentar traspasar a Anthony (jugador 1) del Barcelona al Real Madrid
    System.out.println("\nIntentando traspasar a Anthony del Barcelona al Real Madrid...");
    j1.realizarTraspaso(Team2); // Traspaso de Anthony a Real Madrid

    // Mostrar estado final
    System.out.println("\nEstado final de los equipos:");
    System.out.println("Barcelona: " + Team1.getJugadores_lista());
    System.out.println("Real Madrid: " + Team2.getJugadores_lista());
    System.out.println("Atletico: " + Team3.getJugadores_lista());
}
     
 
    }



 

