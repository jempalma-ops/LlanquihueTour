package app;

import model.Persona;
import model.Ubicacion;
import model.Cliente;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Permite crear objetos y mostrar sus datos.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Sistema de gestión de personas");
        System.out.println("     - Llanquihue Tour -");
        System.out.println("=================================");

        //Crear objeto ubicación 1
        Ubicacion ubicacion1 = new Ubicacion("Av. calle 123", "Llanquihue", "Los Lagos");

        //Crear objeto ubicación 2
        Ubicacion ubicacion2 = new Ubicacion("Calle volcan 123", "Villarica", "Los Lagos");

        //Crear objeto ubicación 3
        Ubicacion ubicacion3 = new Ubicacion("Pasaje 123","Osorno", "Los Lagos");

        //Crear objeto de cliente 1
        Cliente cliente1 = new Cliente("Felipe Camiruaga", "12345678-9", "912345678", ubicacion1, "felipe.camiruaga.1@gmail.com");

        //Crear objeto de cliente 2
        Cliente cliente2 = new Cliente("Britney Spears", "12345678-k","987654321", ubicacion2, "opsididitagain@gmail.com");

        //Crear objeto de cliente 3
        Cliente cliente3 = new Cliente("Pamela Díaz", "11111111-0","911111111", ubicacion3, "lafiera@gmail.com");

        //Mostrar los datos de los clientes
        System.out.println("Cliente 1");
        System.out.println(cliente1);
        System.out.println();
        System.out.println("Cliente 2");
        System.out.println(cliente2);
        System.out.println();
        System.out.println("Cliente 3");
        System.out.println(cliente3);


    }
}