import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int notas[] = new int[15];
        int index = 1;
        int aprobaron = 0;
        int presentanTp = 0;
        int rindenEscrito = 0;
        int desaprobaron = 0;

        System.out.println("Ingrese las 15 notas de los estudiantes, -1 para dejar de ingresar");
        do {
            System.out.println("Nota del estudiante: " + index);
            int nota = scn.nextInt();
            if(nota == -1) break;
            notas[index-1] = nota;
            index++;
        } while (index < 16);

        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > 4) aprobaron++;
            if(notas[i] >= 7) presentanTp++;
            if(notas[i] < 7) rindenEscrito++;
            if(notas[i] < 4) desaprobaron++;
        }
        System.out.println(aprobaron + " estudiantes aprobaron, " + desaprobaron + " estudiantes desaprobaron, " + presentanTp + " alumnos tendrán que presentar un TP y " + rindenEscrito + " alumnos deberán rendir escrito.");
    }
}
