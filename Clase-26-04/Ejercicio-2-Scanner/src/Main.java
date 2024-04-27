import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int numA;
        //int numB;
        //int numC;

        //numA = sc.nextInt();
        //numB = sc.nextInt();
        //numC = sc.nextInt();

        //var suma = numA + numB + numC;
        // System.out.println(suma);
        System.out.println("Ingrese su estatura");
        double estatura;
        System.out.println("Ingrese su peso");
        double peso;

        estatura = sc.nextDouble();
        peso = sc.nextDouble();

        var IMC = peso / (estatura*estatura);
        System.out.println("Tu IMC es: " + IMC);
    }
}