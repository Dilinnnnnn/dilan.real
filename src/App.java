import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import aplicativo.datosPersonales;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        datosPersonales.main(args);
        Thread.sleep(100);
        drLogin.ingreso(args);
        MenuCargaHoraria.menu(args);

    }

    static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            System.out.println(cadena);
        }
        b.close();
    }
}

// is directori