public class Entrenador {
    private String Nombre;
    private Formacion Formacion;

    public Equipo Equipo_id;

    public Entrenador(String Nombre_Entrenador, Formacion formacionEntrenador) {
        this.Nombre = Nombre_Entrenador;
        this.Formacion = formacionEntrenador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Formacion getFormacion() {
        return Formacion;
    }

    public void setFormacion(Formacion formacion) {
        Formacion = formacion;
    }

    @Override
    public String toString() {
        return "Entrenador [Nombre=" + Nombre + ", Formacion=" + Formacion + "]";
    }

    
}