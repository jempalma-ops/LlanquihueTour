package model;

/**
 * Clase que representa a una persona vinculada a la organización
 */

public class Persona {

    //Atributos privados
    private String nombre;
    private String rut;
    private String telefono;
    private Ubicacion ubicacion;

    //Constructor de la clase
    public Persona(String nombre, String rut, String telefono, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    //Métodos getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nRUT: " + rut + "\nTeléfono: " + telefono + "\n" + ubicacion;
    }
}
