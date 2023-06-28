package aplicativo;

public class datosPersonales {
    public static final String CEDULA = "1750741934";
    public static final String CORREO = "dilan.real@epn.edu.ec";
    public static final String NOMBRE = "DILAN ELIAS REAL ANGULO";

    public static void main(String[] args) throws Exception {
        String drnombreConvertido = drconvertirNombre();
        String drcorreoConvertido = drconvertirCorreo();

        System.out.println("\n \033[0;31m Cédula: " + CEDULA);
        System.out.println("\n Nombre: " + drnombreConvertido);
        System.out.println("\n Correo: " + drcorreoConvertido);
    }

    public static String drconvertirNombre() {
        char ultimoDigito = CEDULA.charAt(CEDULA.length() - 1);
        if (ultimoDigito % 2 == 0) {
            return NOMBRE.toLowerCase();
        } else {
            return NOMBRE.toUpperCase();
        }
    }

    public static String drconvertirCorreo() {
        char ultimoDigito = CEDULA.charAt(CEDULA.length() - 1);
        if (ultimoDigito % 2 == 0) {
            return CORREO.toUpperCase();
        } else {
            return CORREO.toLowerCase();
        }
    }
}
