import java.util.Scanner;

public class EliminarUnProducto {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Array de 50 productos
        String productos[] = new String[5];

        productos[0] = "Zanahoria";
        productos[1] = "Cebollas";
        productos[2] = "Tomates";
        productos[3] = "Papas";

        int lastPosition = 3;
        boolean keepDeleting = true;

        // Mostrar productos
        for(int i = 0; i < lastPosition; i++) {
            System.out.println(i +") " + productos[i]);
        }

        System.out.println("Ingresar un número de un producto a eliminar");
        do {
            int productToDelete = scn.nextInt();
            if(productToDelete == -1) {
                System.out.println("No hay elementos para eliminar");
                keepDeleting = false;
            } else {
                if(productToDelete >= 0 && productToDelete <= lastPosition) {
                    System.out.println("Se eliminó el producto " + productos[productToDelete]);
                    // Sobreescribe la posición a eliminar por el elemento de la última posición y luego elimina la última posición con null.
                    productos[productToDelete] = productos[lastPosition];
                    productos[lastPosition] = null;
                    lastPosition--;
                } else {
                    System.out.println("No se ha podido eliminar el producto");
                }

            }

        } while (keepDeleting);
    }
}
