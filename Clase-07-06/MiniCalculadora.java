import java.util.Scanner;
public class MiniCalculadora {
    public static void main(String[] args) {
        System.out.println("Ingresa 3 números");
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int mayor = mayor(a, b, c);
        int menor = menor(a , b, c);
        
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
        buscarPares(menor, mayor);
    }

    public static int mayor(int a, int b, int c) {
        int nums[] = new int[3];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;

        int result = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(result < nums[i]) {
                result = nums[i];
            }
        }
        return result;
    }

    public static int menor(int a, int b, int c) {
        int nums[] = new int[3];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;

        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(result > nums[i]) {
                result = nums[i];
            }
        }
        return result;
    }

    public static void buscarPares(int min, int may) {
        for(int i = min; i <= may; i++) {
            if(i%2==0) {
                System.out.print(i+", ");
            }
        }
    }
}