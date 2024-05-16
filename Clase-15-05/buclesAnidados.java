import java.util.Scanner;
public class buclesAnidados {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Dos encuentas de 4 productos cada una.
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese su nombre:");
            String nombre = scn.nextLine();

            System.out.println("Ingrese su localidad:");
            String localidad = scn.nextLine();

            for(int j = 0; j < 4; j++) {
                System.out.println("Califica del 1 al 10 al producto: " + j);
                int puntuacion = scn.nextInt();
            }
            scn.nextLine(); // Limpiar scanner
            System.out.println("Gracias " + nombre + " de " + localidad + " por participar!");
        }
        System.out.println("Gracias a todos por participar" );
    }
}
