public class Desafio4_1 {
    public static void main(String[] args) {
        int numero = 24;
        double numero2 = 0.5;
        String cadena = "Esto es ";
        boolean booleano = false;

        double suma = numero + numero2;
        double resta = numero + numero2;
        double multiplicacion = numero * numero2;
        double division = numero/numero2;
        int modulo = (int)(numero % numero2);
        String cadena2 = "una cadena de texto";


        System.out.println("La suma entre numero y numero2 es: " + suma);
        System.out.println("La resta entre numero y numero2 es: " + resta);
        System.out.println("El resulado de multiplicar numero y numero2 es: " + multiplicacion);
        System.out.println("El resulado de dividir numero y numero2 es: " + division);
        System.out.println("El modulo de numero y numero2 es: " + modulo);
        System.out.println("Este es el resultado de concatenar dos strings: "+  cadena + cadena2);
        System.out.println("¿La suma entre numero y numero2 es 10? " + booleano);
    }
}