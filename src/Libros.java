import lombok.*;

import java.util.Scanner;

@Getter
@Setter

public class Libros {
    String titulo;
    String autor;
    String editora;
    String genero;
    String isbn;
    String categoria;

    public Libros() {

    }

    @Override
    public String toString() {
        return "||Titulo: " + titulo +
                ", ||Autor: " + autor
                + ", ||Editora: " + editora
                + ", ||Genero: " + genero
                + ", ||ISBN: " + isbn
                + ", ||Categoria: " + categoria;
    }


    public void insertarDatosLibro(Scanner sc){
        System.out.print("Ingrese el nombre del libro: ");
        titulo = sc.nextLine();
        System.out.print("Ingrese autor del libro: ");
        autor = sc.nextLine();
        System.out.print("Ingrese editora del libro: ");
        editora = sc.nextLine();
        System.out.print("Ingrese genero del libro: ");
        genero = sc.nextLine();
        System.out.print("Ingrese isbn del libro: ");
        isbn = sc.nextLine();
        System.out.print("Ingrese categoria del libro: ");
        categoria = sc.nextLine();
        sc.nextLine();

    }

}
