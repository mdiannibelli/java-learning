import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nums[] = new int[5];
        System.out.println("Ingrese 5 números");
        int num1 = scn.nextInt();
        nums[0] = num1;
        int num2 = scn.nextInt();
        nums[1] = num2;
        int num3 = scn.nextInt();
        nums[2] = num3;
        int num4 = scn.nextInt();
        nums[3] = num4;
        int num5 = scn.nextInt();
        nums[4] = num5;

        for(int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        scn.close();
    }
}