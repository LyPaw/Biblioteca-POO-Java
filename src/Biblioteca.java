import java.util.ArrayList;
import java.util.Scanner;

import lombok.*;
@Getter
@Setter

public class Biblioteca {

    String nombreLibro;
    String nombreClinte;

    ArrayList<Libros> listaLibros = new ArrayList<>();
    ArrayList<Cliente> listaClientes = new ArrayList<>();



    public void agregarLibro(Libros libro){
        listaLibros.add(libro);
    }


    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void mostrarLibros(){
        for (Libros libro : listaLibros) {
            System.out.println(libro);
        }
    }

    public void mostrarClientes(){
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public void prestarLibro(Scanner sc){
        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = sc.nextLine();
        System.out.println("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();

        Libros libroEncontrado = null;
        for (Libros libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(nombreLibro)) {
                libroEncontrado = libro;
                break;
            }
        }

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (libroEncontrado != null && clienteEncontrado != null) {
            listaLibros.remove(libroEncontrado);
            System.out.println("Libro Prestado a " + clienteEncontrado.getNombre());
        } else {
            System.out.println("Libro o Cliente no encontrado");
        }
    }
}
