import java.util.Scanner;
public class CrearPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nroPersonas = 4;
        String nombres[] = new String[nroPersonas];
        double pesos[] = new double[nroPersonas];
        double estatura[] = new double[nroPersonas];

        for(int i = 0; i < nombres.length-1; i++) {
            nombres[i] = sc.nextLine();
            pesos[i] = sc.nextDouble();
            estatura[i] = sc.nextDouble();
            // Elimina el espacio
            sc.nextLine();
        }
        System.out.println();

        // Calcular imc
        double imcs[] = new double[nroPersonas];
        for(int i = 0; i <= nroPersonas; i++) {
            double p = pesos[i];
            double e = estatura[i];
            double imc = p/Math.pow(e,2);
            imcs[i] = imc;
        }
        System.out.println();

        // Determinar rango de IMC
        String estados[] = new String[nroPersonas];
        for(int j = 0; j < nroPersonas; j++) {
            double imc = imcs[j];

            if(imc < 18.5) {
                estados[j] = "Debajo de lo normal";
            } else if(imc < 25) {
                estados[j] = "Normal";
            } else if(imc < 30) {
                estados[j] = "Sobre peso";
            } else {
                estados[j] = "Obesidad";
            }
        }
    }
}