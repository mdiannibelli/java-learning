import java.util.Scanner;

public class Desafio4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        String apellido;
        String animal;


        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese su animal preferido");
        animal = sc.nextLine();

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(animal);
    }
}
