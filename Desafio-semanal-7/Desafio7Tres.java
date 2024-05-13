import java.util.Scanner;
public class Desafio7Tres {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        int result = 0;
        int f0 = 0;
        int f1 = 1;

        do {
            System.out.println("Ingrese un número positivo mayor o igual a dos");
            num = scn.nextInt();
        } while(!(num >= 2));

        for (int i = 2; i <= num; i++) {
            result = f1 + f0;
            f0 = f1;
            f1 = result;
            System.out.println(f1);
        }
    }
}
