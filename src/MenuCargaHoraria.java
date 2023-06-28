import java.util.Scanner;

public class MenuCargaHoraria {
    private static String temaAsignado = "<<tema-asignado>>";
    private static String usuarioLogeado = "PROFE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarCabecera();
            mostrarOpciones();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    visualizarAlumnos();
                    break;
                case 2:
                    visualizarAsignaturas();
                    break;
                case 3:
                    visualizarHorario();
                    break;
                case 4:
                    visualizarHorarioAsignatura();
                    break;
                case 0:
                    System.out.println("Regresa pronto " + usuarioLogeado);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarCabecera() {
        System.out.println("------------------------------------------");
        System.out.println("Carga horaria de " + temaAsignado);
        System.out.println("------------------------------------------");
        System.out.println("Usuario: " + usuarioLogeado);
    }

    private static void mostrarOpciones() {
        System.out.println();
        System.out.println("1. Visualizar Alumnos (Según el tema-asignado)");
        System.out.println("2. Visualizar Asignaturas (Según el tema-asignado)");
        System.out.println("3. Visualizar Horario");
        System.out.println("4. Visualizar Horario de una asignatura (Según el tema-asignado)");
        System.out.println("0. SALIR");
    }

    private static void visualizarAlumnos() {
        System.out.println("Visualizando alumnos según el tema-asignado");
    }

    private static void visualizarAsignaturas() {
        System.out.println("Visualizando asignaturas según el tema-asignado");
    }

    private static void visualizarHorario() {
        System.out.println("Visualizando horario");
    }

    private static void visualizarHorarioAsignatura() {
        System.out.println("Visualizando horario de una asignatura según el tema-asignado");
    }
}