import java.util.Scanner;
import java.time.LocalDateTime;
public class Desafio4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int bornYear;
        LocalDateTime date = LocalDateTime.now();
        int actualYear = date.getYear();

        System.out.println("Ingrese su año de nacimiento");
        try {
            bornYear = sc.nextInt();
            age = actualYear - bornYear;
            System.out.println("Su edad es: " + age);
            
        } catch (Exception e) {
            System.out.println("El valor ingresado no es correcto");
        }
        


    }
}
