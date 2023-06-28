package drUtility;

import java.util.Scanner;

public class drUtility {

    private static final int delay = 100;
    static Scanner sc = new Scanner(System.in);

    /**
     * obtener un numero nayor o igual que 0
     * 
     * @param mensaje tipo etiqueta
     * @return el numero mayor o igual que 0
     */
    public static int drgetNumeroPositivo(String mensaje) {
        int numero;
        System.out.print(mensaje);
        do {
            numero = sc.nextInt();
        } while (numero <= 0);
        return numero;
    }

    public static String frase() {
        String frase = sc.nextLine();
        frase = frase.toLowerCase();
        return frase;
    }

    /**
     * Limpiar la terminal
     */
    public static final void drclear() {
        try {
            String operatingSystem = System.getProperty("os.name"); // Check the current operating system
            if (operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void drshowloading() throws InterruptedException {
        String strCaracter = "\\|/-"; // [ \ | / - | ]
        for (int i = 0; i <= 100; i++) {
            System.out.print(String.format("\r %s %3d %% ", strCaracter.charAt(i % strCaracter.length()), i));
            Thread.sleep(delay);
        }
    }

}