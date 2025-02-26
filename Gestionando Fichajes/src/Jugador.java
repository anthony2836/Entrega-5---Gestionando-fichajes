import java.util.Date;

public class Jugador {
    private String Nombre;
    private Date FechaNacimiento;
    private String Pais;
    private Posicion Posicion;
    private int Dorsal;
    public Traspaso Traspaso;
    private Equipo Equipo_id;
 
    //Constructor
    public Jugador(String nombreJugador, Date fechaNacimientoJugador, String paisJugador, Posicion posicionJugador, int dorsalJugador,
    Traspaso traspasoJugador) {

        this.Nombre = nombreJugador;
        this.FechaNacimiento = fechaNacimientoJugador;
        this.Pais = paisJugador;
        this.Posicion = posicionJugador;
        this.Dorsal = dorsalJugador;
        this.Traspaso = traspasoJugador.Sin_solicitar;
 
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {

        if (Nombre.equals (null)) {
            return;
        }this.Nombre = nombre;
    }

    public Date getFechaNacimiento() {
    
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        if (FechaNacimiento== null) {
            return;  
        }this.FechaNacimiento = fechaNacimiento;
    }

    public Posicion getPosicion() {
        
        return Posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (Posicion== null) {
            return;
        }this.Posicion = posicion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {

       if (dorsal < 1 ) {
         return;

       }this.Dorsal= dorsal;
    }


    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    public void setEquipo_id(Equipo Equipo_id) {

        if (Equipo_id== null) {
            return;
            
        }this.Equipo_id= Equipo_id;
    }

    public void setTraspaso(Traspaso traspaso) {

        if (traspaso == traspaso.Sin_solicitar) {
            traspaso = traspaso.Solicitado; 
            return;
            
        }else{

        }
    }
    public void aprobarPorEntrenador(Traspaso traspaso) {
        if (traspaso == traspaso.Solicitado) {
            traspaso = traspaso.Aprobado_por_presidente;
        } else {
            
        }
    }

    public void rechazarPorEntrenador(Traspaso traspaso) {
        if (traspaso == traspaso.Solicitado) {
            traspaso = traspaso.Rechazado_por_entrenador;
        } else {
            
        }
    }

    public void aprobarPorPresidente(Traspaso traspaso) {
        if (traspaso == Traspaso.Aprobado_por_entrenador) {
            traspaso = Traspaso.Aprobado_por_presidente;
        } else {
           
        }
    }

    public void rechazarPorPresidente(Traspaso traspaso) {
        if (traspaso == Traspaso.Aprobado_por_entrenador) {
            traspaso = Traspaso.Rechazado_por_presidente;
        } else {
         
        }
    }



    public void resetearTraspasos(Jugador jugador) {
            if (jugador.getTraspaso() == Traspaso.Rechazado_por_presidente || 
                jugador.getTraspaso() == Traspaso.Rechazado_por_entrenador) {
                jugador.setTraspaso(Traspaso.Sin_solicitar);  // Cambia al estado inicial
            }
        }
    

    public String getPais() {
        return Pais;
    }

    public Traspaso getTraspaso() {
        return Traspaso;
    }

    public void realizarTraspaso(Equipo nuevoEquipo) {
        if (this.Traspaso == Traspaso.Aprobado_por_presidente) {
            // Verificar si el jugador tiene un equipo actual
            if (this.Equipo_id != null) {
                // Verificar si el jugador está en la lista de su equipo
                if (this.Equipo_id.getJugadores_lista().contains(this)) {
                    // Remover al jugador del equipo actual
                    this.Equipo_id.getJugadores_lista().remove(this);
                }
            }
    
            // Agregar al jugador al nuevo equipo
            nuevoEquipo.getJugadores_lista().add(this);
    
            // Actualizar el equipo del jugador
            this.Equipo_id = nuevoEquipo;
    
            // Restablecer el estado del traspaso
            this.setTraspaso(Traspaso.Sin_solicitar);
    
            System.out.println("Traspaso realizado con éxito.");
        } else {
            System.out.println("No se puede realizar el traspaso. Aprobación pendiente.");
        }
    }
    


    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", Pais=" + Pais + ", Posicion="
                + Posicion + ", Dorsal=" + Dorsal + ", Traspaso=" + Traspaso + ", Equipo_id=" + Equipo_id + "]";
    }





}
