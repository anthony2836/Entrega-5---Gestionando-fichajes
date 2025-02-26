import java.sql.Date;

public abstract class Trabajador {
    private String nombre;
    private Date FechaNacimientoTrabajador;
    private String paisOrigen;

    public Trabajador(String nombre, Date FechaNacimientoTrabajador, String PaisOrigen) {
        this.nombre = nombre;
        this.FechaNacimientoTrabajador = FechaNacimientoTrabajador;
        this.paisOrigen = PaisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimientoTrabajador() {
        return FechaNacimientoTrabajador;
    }

    public void setFechaNacimientoTrabajador(Date fechaNacimientoTrabajador) {
        FechaNacimientoTrabajador = fechaNacimientoTrabajador;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }



    public void mismaNacionalidad(Trabajador trabajador) {
        if (this.paisOrigen.equalsIgnoreCase(trabajador.getPaisOrigen())) {
            System.out.println(nombre + " y " + trabajador.getNombre() + " tienen la misma nacionalidad: " + paisOrigen);
        } else {
            System.out.println(nombre + " y " + trabajador.getNombre() + " tienen diferentes nacionalidades: " + paisOrigen + " y " + trabajador.getPaisOrigen());
        }
    }

}
