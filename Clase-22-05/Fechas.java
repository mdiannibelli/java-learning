import java.util.Scanner;
public class Fechas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String mes[] = {"January", "February", "March", "April", "May", "June", "Jule", "August", "September", "October", "November", "December"};

        // Recibe fecha como un string dd/mm/aaaa
        String fechaA = scn.nextLine();
        String datos[] = fechaA.split("/");
        int d = Integer.parseInt(datos[0]);
        int m = Integer.parseInt(datos[1]);
        int y = Integer.parseInt(datos[2]);
        System.out.println(d +" of "+ mes[m-1] +" of year "+ y);
        
    }
}
