// Crear una lista de productos empezando por Zanahora, Cebollas, Tomates y Papas, el valor ingresado no puede ser un campo vacío.

import java.util.Scanner;
public class Productos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Array de 50 productos
        String productos[] = new String[5];

        productos[0] = "Zanahoria";
        productos[1] = "Cebollas";
        productos[2] = "Tomates";
        productos[3] = "Papas";

        int lastPosition = 3;
        boolean keepEntering = true;

        System.out.println("Ingrese varios productos para insertarlos a una lista");
        do {
            // Leer un string de usuario
            String product = scn.nextLine();
            // Comparar con ENTER
            if(product.equals("")) {
                keepEntering = false;
            } else {
                // Ingreso del producto en la lista de productos
                lastPosition++;
                if(lastPosition < productos.length) {
                    productos[lastPosition] = product;
                    showProducts(productos);
                } else {
                    System.out.println("Ya no hay espacio para ingresar " + product);
                    keepEntering = false;
                    lastPosition--;
                }
            }
        } while (keepEntering);

        // Mostrar productos
        System.out.println("Los productos de la lista son:");
        showProducts(productos);
    }
    // Función para mostrar los productos
    public static void showProducts(String[] productos) {
        for(String p:productos) {
            System.out.println(p);
        }
    }
}