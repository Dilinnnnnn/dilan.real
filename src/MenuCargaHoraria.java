import drUtility.drUtility;

public class MenuCargaHoraria {
    private static String temaAsignado = "\033[0;33m<<Profesores>>";
    private static String usuarioLogeado = "PROFE";

    public static void menu(String[] args) {
        // var scan = new Scanner(System.in);
        int opcion;

        do {
            drmostrarInicio();
            drmostrarOpciones();
            System.out.print("\n [+] Ingrese su opción: ");
            opcion = App.scan.nextInt();
            drUtility.drclear();

            switch (opcion) {
                case 1:
                    visualizarProfesor();
                    System.out.println("\n \033[0;35m - 202110105-CHUNCHO JIMENEZ ANGEL DAVID");
                    System.out.println("\n - 202111083-HIDALGO CRUZ PABLO ESTEBAN");
                    System.out.println("\n - 202120757-ALEMAN OSORIO CARLOS ALEJANDRO \n");
                    drUtility.presioneTeclaContinuar();
                    drUtility.drclear();

                    break;
                case 2:
                    visualizarTitulo();
                    System.out.println("\n - ICCD323-GRLSW SISTEMAS OPERATIVOS SISTEMAS OPERATIVOS");
                    System.out.println("\n - ICCD343-GR1SW CONTACTO CON LA M\u00DASICA");
                    System.out.println("\n - ICCD343-GR1SW ARQUITECTURA DE COMPUTADORES");
                    System.out.println("\n  - MATD223-GR4SW PROBABILIDAD Y ESTADISTiCA BASICAS");
                    System.out.println("\n - CSHD3BL-A3 FUNDAMENTOS DE REDES Y CONECTIVIDAD");
                    System.out.println("\n - ICCD353-GR1SW FUNDAMENTOS DE REDES Y CONECTIVIDAD \n");

                    drUtility.presioneTeclaContinuar();
                    drUtility.drclear();
                    break;
                case 3:
                    visualizarHorario();
                    drUtility.presioneTeclaContinuar();
                    drUtility.drclear();

                    break;
                case 4:
                    visualizarHorarioTitulo();
                    drUtility.presioneTeclaContinuar();
                    drUtility.drclear();

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