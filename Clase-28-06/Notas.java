// La matriz representa las notas parciales de 5 alumnos de una clase, mostrar por consola el promedio que obtiene cada alumno si aprueba o no.
public class Notas {
    public static void main(String[] args) {
        int notas[][] = {
                { 3, 2, 7 },
                { 7, 2, 7 },
                { 8, 5, 9 },
                { 5, 6, 8 },
                { 4, 4, 7 }
        };

        for (int i = 0; i < notas.length; i++) {
            int sum = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sum += notas[i][j];
            }
            int promedio = sum / notas[i].length;
            System.out.println("Alumno " + i + " tiene un promedio de " + promedio);
        }
    }

}
