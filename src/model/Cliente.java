package model;

/**
 * Clase que representa al cliente con los datos que hereda de la clase Persona
 */

public class Cliente extends Persona {

    //Atributo privado
    private String correo;

    //Constructor de la clase
    public Cliente(String nombre, String rut, String telefono, Ubicacion ubicacion,String correo) {
        super(nombre, rut, telefono, ubicacion);
        this.correo = correo;
    }

    //Métodos getter y setter
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCorreo: " + correo;
    }
}