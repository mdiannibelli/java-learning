import java.util.Scanner;

public class Desafio5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        double base;

        System.out.println("Ingrese en cm cuánto medirá la altura del rectángulo");
        altura = sc.nextDouble();

        System.out.println("Ingrese en cm cuánto medirá la base del rectángulo");
        base = sc.nextDouble();

        int area = (int)base * (int)altura;
        int perimetro = ((int)base * 2) + ((int)altura * 2);

        System.out.println("El área del rectángulo será de: " + area + "cm²" + " y el perímetro será de: " + perimetro + "cm");
    }
}
