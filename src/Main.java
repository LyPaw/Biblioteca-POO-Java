//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int opcion;
    Biblioteca biblioteca = new Biblioteca();

    System.out.println("=====================================");
    System.out.println("Biblioteca Iniciada");
    System.out.println("=====================================");

    do {

        System.out.println("1.Agregar libro\n2.Listar libros\n3.Agregar cliente\n4.Listar clientes\n5.Prestar Libro\n6.Limpiar Pantalla\n7.Salir");

        opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion){
            case 1:
                Libros libro = new Libros();
                libro.insertarDatosLibro(sc);
                biblioteca.agregarLibro(libro);
                System.out.println("Libro añadido");
                break;

            case 2:
                System.out.println("Lista de libros");
                biblioteca.mostrarLibros();
                break;

            case 3:
                Cliente cliente = new Cliente();
                cliente.insertarDatosCliente(sc);
                biblioteca.agregarCliente(cliente);
                System.out.println("Cliente añadido");

               break;

            case 4:

                System.out.println("Lista de Clientes");
                biblioteca.mostrarClientes();
                break;

            case 5:
                biblioteca.prestarLibro(sc);
                break;
            case 6:

                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (IOException | InterruptedException e) {
                    System.out.println("No se pudo limpiar la pantalla.");
                }
                break;

        }


    }while(opcion!=7);
}
