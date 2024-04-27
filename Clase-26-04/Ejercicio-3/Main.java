import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner miScan = new Scanner(System.in);

        // Declaramos values
        String nombre;
        String apellido;
        int edad;
        String result;

        // Asignamos Values
        nombre = miScan.nextLine();
        apellido = miScan.nextLine();
        edad = miScan.nextInt();

        // Consigna
        int nameLength = nombre.length();
        int lastNameLength = apellido.length();
        char initialName = nombre.charAt(0);
        char initialLastName = apellido.charAt(0);
        
        // Casting
        result = String.valueOf(nameLength) + String.valueOf(lastNameLength) + String.valueOf(initialName) + String.valueOf(initialLastName) + String.valueOf(edad);
        System.out.println(result);
    }
}
