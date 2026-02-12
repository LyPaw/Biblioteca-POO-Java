import lombok.*;

import java.util.Scanner;

@Getter
@Setter

public class Cliente {
    String nombre;
    String apellido;
    String email;
    String telefono;
    String direccion;

    public Cliente() {}

    @Override
    public String toString() {
        return "||Nombre: " + nombre +
                " ||Apellido: " + apellido +
                " ||Email: " + email +
                " ||Telefono: " + telefono +
                " ||Direccion: " + direccion;
    }

    public void insertarDatosCliente(Scanner sc){
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el email del cliente: ");
        email = sc.nextLine();
        System.out.print("Ingrese el telefono del cliente: ");
        telefono = sc.nextLine();
        System.out.print("Ingrese el direccion del cliente: ");
        direccion = sc.nextLine();
        sc.nextLine();
    }

}
