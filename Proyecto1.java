package biziZaragoza;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Proyecto1 {

    /**
     * PRE:
     * POST: Este metodo genera un programa Java que genere un documento “pruebas-10.csv” con las 10 primeras líneas del fichero
     * “usos16.csv”, incluyendo la cabecera.
     *
     * @param file
     */
    public static void generarDocumento1(File file) {
        //Creamos fichero pruebas10.
        File pruebas10;
        String ruta = "C:\\Users\\PABLO\\OneDrive\\Escritorio";
        String nombre = "pruebas-10.csv";
        pruebas10 = new File(ruta, nombre);
        try {
            Scanner sc = new Scanner(file);
            Formatter f = new Formatter(pruebas10);
            //Escribimos las 10 lineas que nos piden.
            for (int i = 1; i <= 10; i++) {
                f.format(sc.nextLine() + "\n");
            }
            f.flush();
            f.close();
            System.out.println("Fichero pruebas-10.csv generado correctamente.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Este metodo genera un programa Java que genera un documento “pruebas-2000.csv” con las 2000 primeras líneas del
     * fichero “usos17.csv”, incluyendo la cabecera.
     *
     * @param file2
     */
    public static void generarDocumento2(File file2) {
        //Creamos fichero prueba2000.
        File pruebas2000;
        String ruta = "C:\\Users\\PABLO\\OneDrive\\Escritorio";
        String nombre = "pruebas-2000.csv";
        pruebas2000 = new File(ruta, nombre);
        try {
            Scanner sc = new Scanner(file2);
            Formatter f = new Formatter(pruebas2000);
            //Escribimos las 2000 lineas que nos piden.
            for (int i = 1; i <= 2000; i++) {
                f.format(sc.nextLine() + "\n");
            }
            f.flush();
            f.close();
            System.out.println("Fichero pruebas-2000.csv generado correctamente.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * PRE:
     * POST: Este programa Java se inicia y genera un documento “pruebas-10.csv” con las 10 primeras líneas del fichero
     * “usos16.csv”, incluyendo la cabecera y genera un documento “pruebas-2000.csv” con las 2000 primeras líneas del
     * fichero “usos17.csv”, incluyendo la cabecera.
     */

    public static void main(String[] args) {
        File file, file2;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\usos16.csv");
        file2 = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\usos17.csv");
        generarDocumento1(file);
        generarDocumento2(file2);
    }
}
