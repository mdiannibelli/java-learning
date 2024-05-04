import java.util.Scanner;

public class Desafio5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int celsius;
        double fahrenheit;
        
        System.out.println("Ingrese una temperatura en grados celsius");
        celsius = sc.nextInt();
        
        fahrenheit = (double)celsius;

        double temp = (celsius * (double)9/5) + 32;
        System.out.println(temp);

    }
}
