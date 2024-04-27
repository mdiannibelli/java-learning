import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String nombre;
        String apellido;
        String color;
        var user = "";

        System.out.println("Ingrese su nombre");
        nombre = scn.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scn.nextLine();
        System.out.println("Ingrese su color favorito");
        color = scn.nextLine();

        System.out.println("Vamos a generarte un usuario");
        String A = (nombre.substring(0, 3)).toUpperCase();
        String B = (apellido.substring(0, 3).toUpperCase());
        var C = color.toUpperCase();
        var D = nombre.length() + apellido.length();
        user = A + B + C + D;
        System.out.println("Su usuario es: " + user);
    }
}