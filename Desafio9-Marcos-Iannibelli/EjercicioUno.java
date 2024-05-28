import java.util.Scanner;
public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nums[] = new int[10];
        int position = 0;
        int sum = 0;
        
        System.out.println("Ingrese 10 numeros");
        while(position < 10) {
            int num = scn.nextInt();
            nums[position] = num;
            position++;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) continue;
            sum += nums[i];
        }
        
        double promedio = sum / position;
        System.out.println("El promedio de los 10 números ingresados es de: " + promedio);
        System.out.println("Los números ingresados son:");
        mostrarArray(nums);

    }
    public static void mostrarArray(int[] nums) {
        for(int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}