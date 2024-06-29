public class Matrices {
    public static void main(String[] args) {
        // Declarar una matriz de matrices
        int mtz[][];

        // Declarar y asignar tamaño
        int mtz2[][] = new int[4][3]; // tamaño fill-column

        // Declarar y asignar tamaño + valores
        int mtz3[][] = { { 4, 2, 1 }, { 3, 6, 8 }, { 2, 4, 6 }, { 2, 2, 1 } }; // Fill = 4 - Col =3

        int nf = mtz3.length;
        int nc = mtz3[0].length;
        System.out.println(nf);
        System.out.println(nc);

        // Mostrar matriz HORIZONTALMENTE (por filas)
        System.out.println("Horizontal");
        for (int i = 0; i < mtz3.length; i++) {
            for (int j = 0; j < mtz3[i].length; j++) {
                System.out.print(mtz3[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar matriz VERTICALMENTE (por columnas)
        System.out.println("Vertical");
        for (int i = 0; i < mtz3[0].length; i++) {
            for (int j = 0; j < mtz3.length; j++) {
                System.out.print(mtz3[j][i] + " ");
            }
            System.out.println();
        }

    }
}