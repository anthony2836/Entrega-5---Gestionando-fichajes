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


        Equipo Team1 = new Equipo("Barcelona", "FBC", null, null, null);
        Equipo Team2 = new Equipo("RealMadrid", "RMCF", null, null, null);
        Equipo Team3 = new Equipo("AtleticoDelMadrid", "ATM", null, null, null);

        Presidente p1 = new Presidente("43234401B", "Joan Laporta");
        Presidente p2 = new Presidente("34565543L", "Florentino Pérez");
        Presidente p3 = new Presidente("23434456M", "ENRIQUE CEREZO TORRES");

        Entrenador e1 = new Entrenador("Hansi Flick", Formacion._352);
        Entrenador e2 = new Entrenador("Carlo Ancelotti", Formacion._333);
        Entrenador e3 = new Entrenador("Diego Simeone", Formacion._443);

        Jugador j1 = new Jugador("Anthony", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, -10, Traspaso.Sin_solicitar);
        Jugador j2 = new Jugador("Messi", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, 10, Traspaso.Aprobado_por_entrenador);
        Jugador j3 = new Jugador("Ronaldo", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, 7, Traspaso.Aprobado_por_presidente);
        Jugador j4 = new Jugador("Koke", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Delantero, 9, Traspaso.Rechazado_por_entrenador);
        Jugador j5 = new Jugador("Estefano", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Defensa, 4, Traspaso.Sin_solicitar);
        Jugador j6 = new Jugador("Dibu", generarFechaNacimiento(1990, 10, 15),"Ecuador", Posicion.Portero, 1, Traspaso.Solicitado);

        ArrayList<Jugador> jugadoresBarcelona = new ArrayList<Jugador>();
        jugadoresBarcelona.add(j1);
        jugadoresBarcelona.add(j2);

        ArrayList<Jugador> jugadoresRealMadrid = new ArrayList<Jugador>();
        jugadoresRealMadrid.add(j3);
        jugadoresRealMadrid.add(j4);

        ArrayList<Jugador> jugadoresAtleti = new ArrayList<Jugador>();
        jugadoresAtleti.add(j5);
        jugadoresAtleti.add(j6);

        // Team4.setPresidente_id(p1);
        // Team4.setEntrenador_id(e1);
        // Team4.setJugadores_lista(jugadoresBarcelona);



        // System.out.println(j1);
        // System.out.println(p1);
        // System.out.println(e2);
        // System.out.println(Team4);


    }
}
