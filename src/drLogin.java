import java.util.Scanner;

public class drLogin {
    private static final String USER1 = "dilan.real@epn.edu.ec";
    private static final String CLAVE1 = "1750741934";
    private static final String USER2 = "profe";
    private static final String CLAVE2 = "1234";
    private static final int INTENTOSMAXIMOS = 3;

    public static void main(String[] args) {
        boolean loginConExito = drIngreso();

        if (loginConExito) {
            String autenticacionDeUsuario = USER2.equals("profe") ? "PROFE" : USER1.toUpperCase();
            System.out.println(":: Bienvenido " + autenticacionDeUsuario);
        } else {
            System.out.println(":: Error de autenticacion, usuario y contraseña incorrectas");
            System.out.println("gracias ");
        }
    }

    private static boolean drIngreso() {
        Scanner scan = new Scanner(System.in);

        for (int intentos = 1; intentos <= INTENTOSMAXIMOS; intentos++) {
            System.out.print("Usuario: ");
            String usuario = scan.nextLine();
            System.out.print("Contraseña: ");
            String clave = scan.nextLine();

            if ((usuario.equals(USER1) && clave.equals(CLAVE1)) || (usuario.equals(USER2) && (clave.equals(CLAVE2)))) {
                scan.close();
                return true;
            } else {
                int intentosfaltantes = INTENTOSMAXIMOS - intentos;
                System.out.println("numero de intentos restantes: " + intentosfaltantes);
            }
        }
        scan.close();
        return false;
    }

}