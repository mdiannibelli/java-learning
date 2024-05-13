import java.util.Scanner;
public class Desafio7Uno {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingresa un número positivo del 1 al 9");
            num = sn.nextInt();
        } while(!(num <= 9 && num >= 1));

        for (int i = 1; i <= 9; i++) {
            double r = Math.pow(num,i);
            System.out.print(num + "^" +  i + " = ");
            System.out.println(Math.round(r));
        }
    }
}