import java.util.Scanner;
public class Desafio7Dos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int userNum;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un número entero positivo");
            userNum = scn.nextInt();
        } while(!(userNum > 0));
        
        for (int i = 1; i <= userNum; i++) {
            if(i % 2 != 0) {
                suma += i;
            } 
        }
        System.out.println("La suma de todos los números impares es de: " + suma);
    }
}
