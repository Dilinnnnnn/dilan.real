public class MenuCargaHoraria {
    private static String temaAsignado = "<<Profesores>>";
    private static String usuarioLogeado = "PROFE";

    public static void menu(String[] args) {
        // var scan = new Scanner(System.in);
        int opcion;

        do {
            drmostrarInicio();
            drmostrarOpciones();
            System.out.print("Ingrese su opción: ");
            opcion = App.scan.nextInt();

            switch (opcion) {
                case 1:
                    visualizarProfesor();
                    System.out.println("\n - 202110105-CHUNCHO JIMENEZ ANGEL DAVID");
                    System.out.println("\n - 202111083-HIDALGO CRUZ PABLO ESTEBAN");
                    System.out.println("\n - 202120757-ALEMAN OSORIO CARLOS ALEJANDRO");

                    break;
                case 2:
                    visualizarTitulo();
                    break;
                case 3:
                    visualizarHorario();
                    break;
                case 4:
                    visualizarHorarioTitulo();
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

        // scan.close();
    }

    private static void drmostrarInicio() {
        System.out.println("------------------------------------------");
        System.out.println("Carga horaria de " + temaAsignado);
        System.out.println("------------------------------------------");
        System.out.println("Usuario: " + usuarioLogeado);
    }

    private static void drmostrarOpciones() {
        System.out.println();
        System.out.println("\n 1. Visualizar profesores");
        System.out.println("\n 2. Visualizar titulos ");
        System.out.println("\n 3. Visualizar Horario");
        System.out.println("\n 4. Visualizar Horario de una asignatura");
        System.out.println("\n 0. SALIR");
    }

    private static void visualizarProfesor() {
        System.out.println("\n\n [+] Visualizando profesores");
    }

    private static void visualizarTitulo() {
        System.out.println("Visualizando titulos");
    }

    private static void visualizarHorario() {
        System.out.println("Visualizando horario");
    }

    private static void visualizarHorarioTitulo() {
        System.out.println("Visualizando horario de una asignatura según el tema-asignado");
    }
}