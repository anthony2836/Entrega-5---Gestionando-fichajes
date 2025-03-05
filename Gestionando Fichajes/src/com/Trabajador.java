package com;
import java.util.Date;
import com.clases.*;
import com.enums.*;

public abstract class Trabajador {
    protected String nombre;
    protected Date FechaNacimientoTrabajador;
    protected String paisOrigen;
    private static int contadorTrabajadores = 0;

    public Trabajador(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = (nombre != null) ? nombre : "Error, el nombre no debe ser nulo";
        this.FechaNacimientoTrabajador = (fechaNacimiento != null) ? fechaNacimiento : new Date();
        this.paisOrigen = (paisOrigen != null) ? paisOrigen : "Error, el pais no debe ser nulo";
        contadorTrabajadores++;
    }

    public static int getContadorTrabajadores() {
        return contadorTrabajadores;
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
