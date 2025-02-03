public class Presidente {
    private String DNI;
    private String Nombre;

    public Equipo Equipo_id;

    public Presidente(String DNI_Presidente, String Nombre_Presidente) {

        this.DNI = DNI_Presidente;
        this.Nombre = Nombre_Presidente;

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
      if (dNI== null) {
        return;        
      }this.DNI = dNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre== null) {
            return;            
        }this.Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Presidente [DNI=" + DNI + ", Nombre=" + Nombre + "]";
    }

    
}
