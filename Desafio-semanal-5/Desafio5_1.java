import java.util.Scanner;

public class Desafio5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        int contador = 0;
        
        System.out.println("Ingrese el primer numero");
        acumulador = sc.nextInt() + acumulador;
        contador++;

        System.out.println("Ingrese el segundo numero");
        acumulador = sc.nextInt() + acumulador;
        contador++;

        System.out.println("Ingrese el tercer numero");
        acumulador = sc.nextInt() + acumulador;
        contador++;

        System.out.println("Ingrese el cuarto numero");
        acumulador = sc.nextInt() + acumulador;
        contador++;

        System.out.println("Ingrese el quinto numero");
    acumulador = sc.nextInt() + acumulador;
        contador++;

        System.out.println("Acumulador: " + acumulador + " Contador: " + contador);
        double promedio = ((double)(acumulador)/(double)(contador));
        System.out.println("La suma de los números tiene un valor de: " + acumulador + " y el promedio es de: " + promedio);


    }
}