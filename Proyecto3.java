package biziZaragoza;

import java.io.File;
import java.util.*;

public class Proyecto3 {
    public static void mostrarProyecto3(String ruta) {
        File file = new File(ruta);
        try {
            int numero_usuarios_distintos = 0;
            Scanner f = new Scanner(file);
            ArrayList<String> usuarios = new ArrayList<>(); // Importo un arraylist con todos los usuarios.
            ArrayList<String> usuarios2 = new ArrayList<>();
            while (f.hasNextLine()) {
                String linea = f.nextLine();
                String[] tabla = linea.split(";");
                usuarios.add(tabla[0]);
                usuarios2.add(tabla[0] + " " + tabla[1] + " " + tabla[2] + " " + tabla[3] + " " + tabla[4]);
            }

            /**
             * PRE
             * POST: Este proceso me permite borrar todos los elementos repetidos asi podre saber el numero de usuarios
             * diferentes.
             */
            Set<String> hashSet = new HashSet<String>(usuarios);
            usuarios.clear();
            usuarios.addAll(hashSet);
            for (String s : usuarios) {
                numero_usuarios_distintos++;
            }
            System.out.println("Numero de usuarios distintos: " + (numero_usuarios_distintos - 1));
            /**
             * PRE
             * POST: Ordeno el arraylist de usuarios 2 para trabajar mejor con collections
             */
            Collections.sort(usuarios2);
              for (String s : usuarios2) {
                 System.out.println(s);
             }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la ruta + el nombre donde se encuentra el archivo.csv o .txt: ");
        String ruta = sc.next();

        mostrarProyecto3(ruta);
        // creañppuopuououo
        //
        // ljjouoj
        // kpjoupou
        // r array list si e ir añadiendo usuarios si no lo estan y si lo estan sumar contador
        // crear array list si e ir añadiendo usuarios si no lo estan y si lo estan sumar contador// crear array list si e ir añadiendo usuarios si no lo estan y si lo estan sumar contador

    }
}
