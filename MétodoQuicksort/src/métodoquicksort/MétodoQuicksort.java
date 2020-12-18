package métodoquicksort;

import com.sun.corba.se.impl.logging.POASystemException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class MétodoQuicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner introducido = new Scanner(System.in);

        System.out.println("\n METODO QUICKSORT  \n");

        int elementos;//Variable de tipo entero
        System.out.println("Introduzca el número de elementos del arreglo:");
        elementos = introducido.nextInt();

        
        int arreglo[] = new int[elementos];// Crea el arreglo y Asigna el tamaño al arreglo
        for (int i = 0; i < elementos; i++) {//Recorre al arreglo
            System.out.println("Introduzca el elemento que estará en la posición " + (i + 1) + ":");
            arreglo[i] = introducido.nextInt();
        }

        System.out.println("\n ORDENAMIENTO POR EL MÉTODO QUICKSORT \n");
        
        String datos = "Los elementos que ha Introducido Son: \n";//Muestra el arreglo original
        for (int k = 0; k < arreglo.length; k++) {
            datos = datos + arreglo[k] + "\n";
        }
        System.out.println(datos + "");

        Quicksort ordenado = new Quicksort();//Creación del objeto ordenado
        ordenado.ordenarQuicksort(arreglo);//Llamada al método ordenarQuicksort que retorna al arreglo ordenado

        String datos1 = "Los Elementos Ordenados Ascendentemente son:\n";//Recorre al arreglo ascendentemente
        for (int i = 0; i < arreglo.length; i++) {
            datos1 = datos1 + arreglo[i] + "\n";
        }

        System.out.println(datos1);

        String datos2 = "Los Elementos Ordenados Descendentemente son:\n";//Recorre al arreglo descendentemente
        for (int i = arreglo.length - 1; i >= 0; i--) {
            datos2 = datos2 + arreglo[i] + "\n";
        }

        System.out.println(datos2);

    }

}
