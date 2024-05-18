import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        int counter = 0;
        int intNums[] = new int[5];

        System.out.println("Ingresa cinco números enteros positivos para calcular el promedio de ellos:");

        while(counter < 5) {
            num = scn.nextInt();
            if(num > 0) {
                intNums[counter] = num;
                counter++;
            } else {
                System.out.println("Por favor, ingrese un número positivo");
            }
        }
        
        // Sumamos los numeros
        int suma = 0;
        for(int i = 0; i < intNums.length; i++) {
            suma += intNums[i];
        }
        double average = (double)suma / intNums.length; 
        System.out.println("El promedio de los números es de: " + average);

    }
}
