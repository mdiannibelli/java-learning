import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nota;
        int estudiantes = 0;
        int notasDeEstudiantes[] = new int[6];

        System.out.println("Ingresa una nota del 1 al 10, ingresa una nota negativa para salir");
        while(estudiantes < 6) {
            nota =  scn.nextInt();
            if(nota > 0 && nota <= 10) {
                notasDeEstudiantes[estudiantes] = nota;
                estudiantes++;
            } else if(nota < 0) {
                break;
            } else {
                System.out.println("Debe ingresar una nota del 1 al 10");
            }
        }

        int aprobaron = 0;
        int presentanTp = 0;
        int rindenEscrito = 0;
        //Te pedimos determinar cuántos aprobaron (nota > 4), de éstos cuántos deben presentar TP (nota >= 7) y cuántos rinden escrito (nota <7) y cuántos desaprobaron. 

        for(int i = 0; i < notasDeEstudiantes.length; i++) {
            if(notasDeEstudiantes[i] > 4) {
                System.out.println("El estudiante: " + i + " aprobó.");
                aprobaron++;
            }
            if(notasDeEstudiantes[i] >=  7) {
                System.out.println("El estudiante: " + i + " deberá presentar tp.");
                presentanTp++;
            }
            if(notasDeEstudiantes[i] < 7) {
                System.out.println("El estudiante: " + i + " deberá rendir escrito.");
                rindenEscrito++;
            }
        }

        System.out.println(aprobaron + " alumnos han aprobado, " + presentanTp + " alumnos deberán presentar tp y " + rindenEscrito + " alumnos deberán rendir escrito.");
    }
}
