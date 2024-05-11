import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        String palabraInvertida = "";

        // For invertido => i = ultima posición del string
        for(int i = palabra.length() - 1; i>= 0 ; i--) {
            System.out.println(i);
            char c = palabra.charAt(i);
            palabraInvertida += c;
        }

        if(palabra.equals(palabraInvertida)) {
            System.out.println("Es una palabra palíndroma");
        } else {
            System.out.println("No es una palabra palíndroma");
        }
    }
}