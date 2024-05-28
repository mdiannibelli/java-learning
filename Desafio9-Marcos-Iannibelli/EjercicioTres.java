public class EjercicioTres {
    public static void main(String[] args) {
        int calificacionA[] = new int[15];
        int calificacionB[] = new int[15];
        int index = 0;

        System.out.println("Bienvenido a nuestra encuesta, te pedimos que sigas los pasos...");

        do {
            System.out.println("Usuario " + index + ": Califique el producto A");
            double noteA = Math.floor((Math.random() * 10) + 1);
            calificacionA[index] = (int)noteA;
            System.out.println("Usuario " + index + ": Califique el producto B");
            double noteB = Math.floor((Math.random() * 10) + 1);
            calificacionA[index] = (int)noteB;

            index++;
        } while (index < 15);
    }
}
