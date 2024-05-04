import java.util.Scanner;
public class CalculadoraIMC {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su estatura en metros");
    double estatura;
    estatura = sc.nextDouble();

    System.out.println("Ingrese su peso en kg");
    double peso;
    peso = sc.nextDouble();

    double imc;
    imc = peso/(estatura*estatura);

    if (imc < 18.5) {
        System.out.println("Debajo de lo normal");
    } else if (imc < 25) {
        System.out.println("Normal");
    } else if (imc < 30) {
        System.out.println("Sobrepeso");
    } else {
        System.out.println("Obesidad");
    }
    

   } 
}
