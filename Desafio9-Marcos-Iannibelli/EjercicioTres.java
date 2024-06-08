public class EjercicioTres {
    public static void main(String[] args) {
        int calificacionA[] = new int[15];
        int calificacionB[] = new int[15];
        int index = 0;

        System.out.println("Bienvenido a nuestra encuesta, te pedimos que sigas los pasos...");

        do {
            double noteA = Math.floor((Math.random() * 10) + 1);
            calificacionA[index] = (int)noteA;
           
            double noteB = Math.floor((Math.random() * 10) + 1);
            calificacionB[index] = (int)noteB;

            index++;
        } while (index < 15);

        int sumaA = 0;
        int sumaB = 0;

        for(int i = 0; i < index; i++) {
            sumaA += calificacionA[i];
            sumaB += calificacionB[i];
        }

        double promedioA = sumaA / index;
        double promedioB = sumaB / index;
        System.out.println("El promedio de A es " + promedioA + " y el promedio de B es " + promedioB);
        if(promedioA > promedioB) {
            System.out.println("El producto A es preferido por la gente");
        } else if (promedioA == promedioB) {
            System.out.println("Ambos productos son preferidos por igual por la gente");
        } else {
            System.out.println("El producto B es preferido por la gente");
        }
    }
}
