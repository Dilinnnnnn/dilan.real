import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import aplicativo.datosPersonales;
import drUtility.drUtility;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drUtility.drclear();
        datosPersonales.main(args);
        Thread.sleep(2000);
        drLogin.ingreso(args);
        Thread.sleep(2000);
        drUtility.drclear();
        MenuCargaHoraria.menu(args);
        muestraContenido("src\\Horarios\\a1.csv");

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
