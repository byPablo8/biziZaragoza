package biziZaragoza;

import java.io.File;
import java.util.Scanner;

public class Proyecto2 {
    /**
     * PRE:
     * POST: Este metodo muestra por pantalla el numero de usos, usos circulares y de traslado.
     * @param ruta
     */
    public static void mostrarProyecto2(String ruta) {
        File file = new File(ruta); //creamos fichero
        try {
            Scanner f = new Scanner(file);
            int numero_usos = 0, numero_usos_circulares = 0, numero_usos_traslado = 0; //variables
            while (f.hasNextLine()) {
                numero_usos++;
                String linea = f.nextLine();
                String[] tabla = linea.split(";");
                if (tabla[2].equalsIgnoreCase(tabla[4])) {
                    numero_usos_circulares++;
                }
                if (!tabla[2].equalsIgnoreCase(tabla[4])) {
                    numero_usos_traslado++;
                }
            }
            System.out.println("El numero de usos totales es: " + (numero_usos - 1));
            System.out.println("El numero de usos circulares es: " + numero_usos_circulares);
            System.out.println("El numero de usos como traslado es: " + numero_usos_traslado);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Desarrolla un programa Java que solicite al usuario un fichero de usos de Bizi Zaragoza, y a continuación, muestre un
     * resumen del contenido del fichero en el que se indique el número de usos totales recogidos en el documento,
     * distinguiendo cuántos de ellos se corresponde a traslados y cuántos de ellos son circulares (estación de origen y destino
     * son idénticas).
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la ruta + el nombre donde se encuentra el archivo.csv o .txt: ");
        String ruta = sc.next();
        mostrarProyecto2(ruta);
    }
    //dsgrgpwidfjewlfjljdglsd
}
