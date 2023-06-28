public class drLogin {
    private static final String USER1 = "dilan.real@epn.edu.ec";
    private static final String CLAVE1 = "1750741934";
    private static final String USER2 = "profe";
    private static final String CLAVE2 = "1234";
    private static final int INTENTOSMAXIMOS = 3;

    public static void ingreso(String[] args) {
        boolean loginConExito = drIngreso();

        if (loginConExito) {
            String autenticacionDeUsuario = USER2.equals("profe") ? "PROFE" : USER2.toUpperCase();
            System.out.println("\n:: Bienvenido " + autenticacionDeUsuario);
        } else {
            System.out.println("\n:: Error de autenticacion, usuario y contraseña incorrectas");
            System.out.println("gracias ");
            System.exit(0);
        }

    }

    private static boolean drIngreso() {
        // Scanner scan = new Scanner(System.in);

        for (int intentos = 1; intentos <= INTENTOSMAXIMOS; intentos++) {
            System.out.print("\n \033[0;36m Usuario: ");
            String usuario = App.scan.nextLine();
            System.out.print("\n Contraseña: ");
            String clave = App.scan.nextLine();

            if ((usuario.equals(USER1) && clave.equals(CLAVE1)) || (usuario.equals(USER2) && (clave.equals(CLAVE2)))) {
                // App.scan.close();
                return true;
            } else {
                int intentosfaltantes = INTENTOSMAXIMOS - intentos;
                System.out.println("numero de intentos restantes: " + intentosfaltantes);
            }
        }
        // scan.close();
        return false;
    }

}