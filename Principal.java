import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        int opcion;

        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEMA DE GESTIÓN DE FLOTILLA ");
            System.out.println("=================================");
            System.out.println("1. Consultar unidades disponibles");
            System.out.println("2. Asignar chofer a unidad");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    sistema.mostrarUnidadesDisponibles();
                    pausarConsola(scanner);
                    break;

                case 2:
                    System.out.println("\n--- ASIGNACIÓN DE CHOFER ---");
                    System.out.print("Ingrese la placa de la unidad: ");
                    String placa = scanner.nextLine();

                    System.out.print("Ingrese el nombre completo del chofer: ");
                    String nombreCompleto = scanner.nextLine();

                    System.out.print("Ingrese el número de licencia: ");
                    String licencia = scanner.nextLine();

                    Chofer nuevoChofer = new Chofer(nombreCompleto, licencia);
                    sistema.asignarChofer(placa, nuevoChofer);
                    pausarConsola(scanner);
                    break;

                case 3:
                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intente nuevamente.");
                    pausarConsola(scanner);
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }

    // Método auxiliar para pausar la pantalla
    private static void pausarConsola(Scanner scanner) {
        System.out.println("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
}
